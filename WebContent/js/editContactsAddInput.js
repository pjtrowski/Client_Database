function addContactInput(){
      var i=1;
      do
      {
    	  i++
      }
      while($('#contact'+i).children().length!=0)
    	 //if(i<10)
      $('#contactsGroup').append('<div id="contact'+i+'"></div>');
      $('#contact'+i).html('<span style="margin-right:6px">'+i+'</span><input class="form-control" id="cont'+i+'" name="cont'+i+'" placeholder="Full Name"><input class="form-control" id="contphn'+i+'" name="contphn'+i+'" placeholder="Phone"><input class="form-control" id="email'+i+'" name="email'+i+'" placeholder="Email">');
 }