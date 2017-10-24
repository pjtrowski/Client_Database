function editContacts()
{
	var modalBody=$('<div id="modalContent"></div>');
	var modalForm=$('<form role="form" name="modalForm" action="com.data/ContactsUpdate" method="post"></form>');
	var formGroup=$('<div id="contactsGroup" class="form-group"></div>');
	var cont =$("#cont1").text();
	var x=1;
	if(cont=='')
    {
	 var modalContactGroup=$('<div id="contact1"></div>');
	 modalContactGroup.append('<span style="margin-right:6px">1</span>');
	 modalContactGroup.append('<input class="form-control" id="cont1" name="cont1" placeholder="Full Name" />');
	 modalContactGroup.append('<input class="form-control" id="contphn1" name="contphn1" placeholder="Phone" />');
	 modalContactGroup.append('<input class="form-control" id="email1" name="email1" placeholder="Email" />');
    formGroup.append(modalContactGroup);
    }
	else{
	 while(!cont=='')
	 {	 
	 var cont =$("#cont"+x+"").text();
     var contphn=$("#contphn"+x+"").text();
     var email=$("#email"+x+"").text();
     var modalContactGroup=$('<div id="contact'+x+'"></div>');      
    
     modalContactGroup.append('<span style="margin-right:6px">'+x+'</span>');
     modalContactGroup.append('<input class="form-control" id="cont'+x+'" name="cont'+x+'"   placeholder="Full Name" value="'+cont+'" />');
     modalContactGroup.append('<input class="form-control" id="contphn'+x+'" name="contphn'+x+'" placeholder="Phone" value="'+contphn+'" />');
     modalContactGroup.append('<input class="form-control" id="email'+x+'" name="email'+x+'"  placeholder="Email" value="'+email+'" />');
     formGroup.append(modalContactGroup);	
     x++;}
	}
	 modalForm.append(formGroup);
     modalBody.append(modalForm);
     //button adds one input row to modal calling onClick addContactInput()
     modalBody.append('<button type="button" id="addRowBtn" onClick="addContactInput()" style="margin-left:14px" class="btn btn-default btn-sm"><span></span>Add Contact</button>');
     $('#contacts-info-body').html(modalBody);
     $('.modal-footer .btn-primary').click(function(){
    	 $('form[name="modalForm"]').submit()  	 
     })
}


