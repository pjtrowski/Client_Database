package com.clientdb;


import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class LogWriter {
	
	public synchronized static void log(String user, String msg)
	{
			
		  String s = new java.util.Date()+"-"+user+"-"+msg+"\n";
		    byte data[] = s.getBytes();
		    Path p = Paths.get("C:/temp/clientdblog.txt");
		    try 
		    (OutputStream out = new BufferedOutputStream(
		      Files.newOutputStream(p, CREATE, APPEND))) 
		    {
		      out.write(data, 0, data.length);
		    } catch (IOException x) {
		      System.err.println(x);
		    }
	}
 }
