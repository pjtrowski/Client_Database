    $(function () {
        $(".editButton").click(function () {     
        var columnHeadings = $(".listofusers thead th").map(function() 
        		{
                   return $(this).text();
                }).get();
         columnHeadings.pop();
         var columnValues = $(this).parent().siblings().map(function() 
        		 {
                   return $(this).text();
        		 }).get();
    var modalBody = $('<div id="modalContent"></div>');
    var modalForm = $('<form role="form" name="modalForm" action="com.admin/EditUser" method="post"></form>');
    var formGroup = $('<div class="form-group"></div>');
    $.each(columnHeadings, function(i,columnHeader) 
    {
    	if(i<5)
    	{
    		formGroup.append('<label for="'+columnHeader+'">'+columnHeader+'</label>');
    		formGroup.append('<input class="form-control" name="'+columnHeader+'" id="'+columnHeader+'" value="'+columnValues[i]+'" />');
    	}	
    	else
    	{
            formGroup.append('<label for="'+columnHeader+'">'+columnHeader+'</label>');
            var formControl=$('<select class="form-control" name="'+columnHeader+'"></div>');
            formControl.append('<option value="Admin">Admin</option>');
            formControl.append('<option value="Write">Write</option>');
            formControl.append('<option value="Read">Read</option>');
            formGroup.append(formControl);
    	}   
         modalForm.append(formGroup);
    });
    modalBody.append(modalForm);
    $('.modal-body').html(modalBody);
  });
  $('.modal-footer .btn-primary').click(function(){
     $('form[name="modalForm"]').submit();
  }) 
    });