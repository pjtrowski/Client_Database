     $(document).ready(function(){
      var i=1;
     $("#add_row").click(function()
    		 {if(i<10){
      $('#addr'+i).html("<td>"+ (i+1) +"</td><td><input name='newName"+i+"' type='text' placeholder='Name' class='form-control input-md'  /> </td><td><input  name='newPhone"+i+"' type='text' placeholder='Phone'  class='form-control input-md'></td><td><input  name='newEmail"+i+"' type='text' placeholder='Email'  class='form-control input-md'></td>");

      $('#newCompanyContact').append('<tr id="addr'+(i+1)+'"></tr>');
      i++; }		
  });
     $("#delete_row").click(function(){
    	 if(i>1){
		 $("#addr"+(i-1)).html('');
		 i--;
		 }
	 });
});