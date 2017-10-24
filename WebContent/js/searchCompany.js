 var request=new XMLHttpRequest();  
    function searchInfo()
    {  
    	var name=document.searchfield.name.value;  
    	var url="search.jsp?company="+name;  
    	try{  
    	request.onreadystatechange=function(){  
    		if(request.readyState==4){  
    		var val=request.responseText;  
    	document.getElementById('tableContent').innerHTML=val;  
    		}  
    		}//end of function  
    request.open("GET",url,true);  
    request.send();  
    }catch(e){alert("Unable to connect to server");}  
    }