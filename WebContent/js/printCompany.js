function printDiv(DivID) 
{
	var settings="toolbar=yes,location=no,";
	settings+="directories=yes,menubar=yes,";
	settings+="scrollbars=yes,width=650, height=600, left=100, top=25";
   var content = document.getElementById(DivID).innerHTML;
   var doc_to_print=window.open("","",settings);
   doc_to_print.document.open();
   doc_to_print.document.write('<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"');
   doc_to_print.document.write('"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">');
   doc_to_print.document.write('<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">');
   doc_to_print.document.write('<head><title>CLIENT DB</title>');
   doc_to_print.document.write('<style type="text/css">body{ margin:5%;');
   doc_to_print.document.write('font-family:verdana,Arial;color:#000;');
   doc_to_print.document.write('font-family:Verdana, Geneva, sans-serif; font-size:12px;}');
   doc_to_print.document.write('button{display:none}');
   doc_to_print.document.write('a{color:#000;text-decoration:none;} </style>');
   doc_to_print.document.write('</head><body onLoad="self.print()"><left>');
   doc_to_print.document.write(content);
   doc_to_print.document.write('</left></body></html>');
   doc_to_print.document.close();
   doc_to_print.focus();
}