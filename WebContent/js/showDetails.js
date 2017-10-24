function companyInfo(name){
  	  var xhttp;
  	  if (name == "") {
  	    document.getElementById("info").innerHTML = "";
  	    return;
  	  }
  	  xhttp = new XMLHttpRequest();
  	  xhttp.onreadystatechange = function() {
  	    if (this.readyState == 4 && this.status == 200) {
  	    document.getElementById("info").innerHTML = this.responseText;
  	    }
  	  };
  	  xhttp.open("GET", "CompanyDataDetails.do?company="+name, true);
  	  xhttp.send();
  	}