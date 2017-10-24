function editCompany() {
        var modal_company =$("#modalCompany").text();
        var modal_user=$("#modalUser").text();
        var modal_street=$("#modalStreet").text();
        var modal_city=$("#modalCity").text();
        var modal_state=$("#modalState").text();
        var modal_zip=$("#modalZip").text();
        var modal_phone=$("#modalPhone").text();
        var modal_fax=$("#modalFax").text();
        var modal_email=$("#modalEmail").text();
        var modal_notes=$("#modalNotes").text();

    var modalBody = $('<div id="modalContent"></div>');
    var modalForm = $('<form role="form" name="modalForm" action="com.data/DataUpdate" method="post"></form>');
    var formGroup = $('<div class="form-group"></div>');
    var addressGroup=$('<div id="modalAddress"></div>');
    var phoneFaxGroup=$('<div id="modalPhoneFax"></div>');
    
    formGroup.append('<input class="form-control" name="update_company" id="update_company" value="'+modal_company+'" readonly="readonly" style="font-size:x-large"/><br>');   
    formGroup.append('<label for="'+modal_street+'">Address</label>');
    formGroup.append('<input class="form-control" name="street" id="street" value="'+modal_street+'" />');
    addressGroup.append('<label for="'+modal_city+'">City</label>');
    addressGroup.append('<input class="form-control" name="city" id="city" value="'+modal_city+'" />');
    addressGroup.append('<label for="'+modal_state+'" style="margin-left:8px;">State</label>');
    addressGroup.append('<input class="form-control" name="state" id="state" value="'+modal_state+'" />');
    addressGroup.append('<label for="'+modal_zip+'" style="margin-left:8px;">Zip</label><br>');
    addressGroup.append('<input class="form-control" name="zip" id="zip" value="'+modal_zip+'" />');  
    formGroup.append(addressGroup);
    phoneFaxGroup.append('<label for="'+modal_phone+'">Phone</label>');
    phoneFaxGroup.append('<input class="form-control" name="phone" id="phone" value="'+modal_phone+'" />');
    phoneFaxGroup.append('<label for="'+modal_fax+'" style="margin-left:8px;">Fax</label>');
    phoneFaxGroup.append('<input class="form-control" name="fax" id="fax" value="'+modal_fax+'" />');
    formGroup.append(phoneFaxGroup);
    
    formGroup.append('<label for="'+modal_email+'" style="margin-left:8px;">Email</label>');
    formGroup.append('<input class="form-control" name="email" id="email" value="'+modal_email+'" />');
      
    formGroup.append('<label for="'+modal_notes+'">Notes</label>');
    formGroup.append('<textarea class="form-control" style="width:100%;height:200px" name="message-text" id="message-text">'+modal_notes+'</textarea>');
    modalForm.append(formGroup);
    modalBody.append(modalForm);
    $('#company-info-body').html(modalBody);
   $('.modal-footer .btn-primary').click(function(){
     $('form[name="modalForm"]').submit();
  }) 
 }