function newCompanyExist(){
                var xmlhttp = new XMLHttpRequest();
                var companyname = document.forms["createEntry"]["newCompany"].value;
                var url = "companyexist.jsp?companyname=" + companyname;
                xmlhttp.onreadystatechange = function(){
                    if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
                        if(xmlhttp.responseText == "Company already exist!")
                            document.getElementById("existAlert").style.color = "red";
                        else
                        document.getElementById("existAlert").style.color = "green";
                        document.getElementById("existAlert").innerHTML = xmlhttp.responseText;
                    }      
                };
                try{
                xmlhttp.open("GET",url,true);
                xmlhttp.send();
            }catch(e){alert("unable to connect to server");
            }
}