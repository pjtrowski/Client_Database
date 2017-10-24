package com.data;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.clientdb.ConnectionManager;
public class DataDAO {
	
	static Connection conn;
	static ResultSet rs;
	static Statement stm;
	public static void updateCompany(DataBean data) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		String company=data.getCompanyName();
		String street=data.getStreet();
		String city=data.getCity();
		String state=data.getState();
		String zip =data.getZip();
		String phone=data.getPhone();
		String fax=data.getFax();
		String email=data.getEmail_company();
		String notes=data.getNotes();
		String sessionUser=data.getSessionUser();
		String querry="UPDATE mailing_list SET Work_Phone='"+phone+"',Fax_Number='"+fax+"',Email_Address='"+email+"',Address='"+street+"',City='"+city+"',State='"+state+"',Postal_Code='"+zip+"',Notes='"+notes+"',LastModifiedBy_1='"+sessionUser+"',DateModified=NOW() WHERE (company_name='"+company+"')";
		System.out.println(querry);
		try
		{
			conn=com.clientdb.ConnectionManager.getConnection();
			stm=conn.createStatement();
			stm.executeUpdate(querry);
			stm.close();
			conn.close();
		
		}
		catch(Exception ex)
		{
			com.clientdb.ErrorWriter.log(ex.getMessage());
		}
	}
	public static void updateContacts(DataBean data) 
	{
		String company=data.getCompanyName();
		String cont1=data.getCont1();
		String cont2=data.getCont2();
		String cont3=data.getCont3();
		String cont4=data.getCont4();
		String cont5=data.getCont5();
		String cont6=data.getCont6();
		String cont7=data.getCont7();
		String cont8=data.getCont8();
		String cont9=data.getCont9();
		String cont10=data.getCont10();
		String contphn1=data.getContphn1();
		String contphn2=data.getContphn2();
		String contphn3=data.getContphn3();
		String contphn4=data.getContphn4();
		String contphn5=data.getContphn5();
		String contphn6=data.getContphn6();
		String contphn7=data.getContphn7();
		String contphn8=data.getContphn8();
		String contphn9=data.getContphn9();
		String contphn10=data.getContphn10();
		String email1=data.getEmail1();
		String email2=data.getEmail2();
		String email3=data.getEmail3();
		String email4=data.getEmail4();
		String email5=data.getEmail5();
		String email6=data.getEmail6();
		String email7=data.getEmail7();
		String email8=data.getEmail8();
		String email9=data.getEmail9();
		String email10=data.getEmail10();
		String sessionuser=data.getSessionUser();
		String update_company_contacts="UPDATE mailing_list SET CONT1='"+checkNull(cont1)+"',CONT2='"+checkNull(cont2)+"',CONT3='"+checkNull(cont3)+"',CONT4='"+checkNull(cont4)+"',CONT5='"+checkNull(cont5)+"',CONT6='"+checkNull(cont6)+"',CONT7='"+checkNull(cont7)+"',CONT8='"+checkNull(cont8)+"',CONT9='"+checkNull(cont9)+"',CONT10='"+checkNull(cont10)+"',CONTPHN1='"+checkNull(contphn1)+"',CONTPHN2='"+checkNull(contphn2)+"',CONTPHN3='"+checkNull(contphn3)+"',CONTPHN4='"+checkNull(contphn4)+"',CONTPHN5='"+checkNull(contphn5)+"',CONTPHN6='"+checkNull(contphn6)+"',CONTPHN7='"+checkNull(contphn7)+"',CONTPHN8='"+checkNull(contphn8)+"',CONTPHN9='"+checkNull(contphn9)+"',CONTPHN10='"+checkNull(contphn10)+"',EMAIL1='"+checkNull(email1)+"',EMAIL2='"+checkNull(email2)+"',EMAIL3='"+checkNull(email3)+"',EMAIL4='"+checkNull(email4)+"',EMAIL5='"+checkNull(email5)+"',EMAIL6='"+checkNull(email6)+"',EMAIL7='"+checkNull(email7)+"',EMAIL8='"+checkNull(email8)+"',EMAIL9='"+checkNull(email9)+"',EMAIL10='"+checkNull(email10)+"',DateModified=NOW(),LastModifiedBy_1='"+sessionuser+"' WHERE (company_name='"+company+"')";
		System.out.println(update_company_contacts);
		try
		{
			conn=com.clientdb.ConnectionManager.getConnection();
			stm=conn.createStatement();
			stm.executeUpdate(update_company_contacts);
			conn.close();
			stm.close();
		}
		catch(Exception ex)
		{
			com.clientdb.ErrorWriter.log(ex.getMessage());
		}
	}
	public static void createData(DataBean data)
	{
		String company=data.getCompanyName();
		String street=data.getStreet();
		String city=data.getCity();
		String state=data.getState();
		String zip =data.getZip();
		String phone=data.getPhone();
		String fax=data.getFax();
		String cont1=data.getCont1();
		String cont2=data.getCont2();
		String cont3=data.getCont3();
		String cont4=data.getCont4();
		String cont5=data.getCont5();
		String cont6=data.getCont6();
		String cont7=data.getCont7();
		String cont8=data.getCont8();
		String cont9=data.getCont9();
		String cont10=data.getCont10();
		String contphn1=data.getContphn1();
		String contphn2=data.getContphn2();
		String contphn3=data.getContphn3();
		String contphn4=data.getContphn4();
		String contphn5=data.getContphn5();
		String contphn6=data.getContphn6();
		String contphn7=data.getContphn7();
		String contphn8=data.getContphn8();
		String contphn9=data.getContphn9();
		String contphn10=data.getContphn10();
		String email1=data.getEmail1();
		String email2=data.getEmail2();
		String email3=data.getEmail3();
		String email4=data.getEmail4();
		String email5=data.getEmail5();
		String email6=data.getEmail6();
		String email7=data.getEmail7();
		String email8=data.getEmail8();
		String email9=data.getEmail9();
		String email10=data.getEmail10();
		String notes=data.getNotes();
		String sessionuser=data.getSessionUser();
		String country="";
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("MM/dd/yyyy");
		String currentDate=df.format(date);
		String create_company_querry="INSERT INTO mailing_list (company_name,Address,Address2,City,State,Postal_Code,Country,Work_phone,Fax_number,Date_Updated,Notes,CONT1,CONT2,CONT3,CONT4,CONT5,CONT6,CONT7,CONT8,CONT9,CONT10,CONTPHN1,CONTPHN2,CONTPHN3,CONTPHN4,CONTPHN5,CONTPHN6,CONTPHN7,CONTPHN8,CONTPHN9,CONTPHN10,CONTFAX1,CONTFAX2,CONTFAX3,CONTFAX4,CONTFAX5,CONTFAX6,CONTFAX7,CONTFAX8,CONTFAX9,CONTFAX10,EMAIL1,EMAIL2,EMAIL3,EMAIL4,EMAIL5,EMAIL6,EMAIL7,EMAIL8,EMAIL9,EMAIL10,DateCreated,CreatedBy,LastModifiedBy_1,DateModified,DateCreated_1) VALUES('"+company+"','"+street+"','','"+city+"','"+state+"','"+zip+"','"+country+"','"+phone+"','"+fax+"','"+currentDate+"','"+notes+"','"+checkNull(cont1)+"','"+checkNull(cont2)+"','"+checkNull(cont3)+"','"+checkNull(cont4)+"','"+checkNull(cont5)+"','"+checkNull(cont6)+"','"+checkNull(cont7)+"','"+checkNull(cont8)+"','"+checkNull(cont9)+"','"+checkNull(cont10)+"','"+checkNull(contphn1)+"','"+checkNull(contphn2)+"','"+checkNull(contphn3)+"','"+checkNull(contphn4)+"','"+checkNull(contphn5)+"','"+checkNull(contphn6)+"','"+checkNull(contphn7)+"','"+checkNull(contphn8)+"','"+checkNull(contphn9)+"','"+checkNull(contphn10)+"','','','','','','','','','','','"+checkNull(email1)+"','"+checkNull(email2)+"','"+checkNull(email3)+"','"+checkNull(email4)+"','"+checkNull(email5)+"','"+checkNull(email6)+"','"+checkNull(email7)+"','"+checkNull(email8)+"','"+checkNull(email9)+"','"+checkNull(email10)+"',NOW(),'"+sessionuser+"','"+sessionuser+"',NOW(),NOW());"; 
		System.out.println(create_company_querry);
		try
		{
			conn=com.clientdb.ConnectionManager.getConnection();
			stm=conn.createStatement();
			stm.executeUpdate(create_company_querry);
			stm.close();
			conn.close();
		
		}
		catch(Exception ex)
		{
			com.clientdb.ErrorWriter.log(ex.getMessage());
		}	
	}
	public static String checkNull(String stringToCheck)
	{
		if(stringToCheck==null)
		{
		stringToCheck="";
		return stringToCheck;
		}
		else{return stringToCheck;}	
	}
	public static DataBean companyInfo(String companyName)
	{
		DataBean company=new DataBean();
		String querry="SELECT * from mailing_list WHERE company_name='"+companyName+"'";
		try{
		conn=ConnectionManager.getConnection();
		stm=conn.createStatement();
		ResultSet rs=stm.executeQuery(querry);
		while(rs.next())
		{
		 String address=rs.getString("Address");
		 String address1=rs.getString("Address2");
		 String city=rs.getString("City");
		 String state=rs.getString("State");
		 String zip=rs.getString("Postal_Code");
		 String phone=rs.getString("Work_Phone");
		 String fax=rs.getString("Fax_Number");
		 String email=rs.getString("Email_Address");
		 String dataupdated=rs.getString("DateModified");
		 String saleserson=rs.getString("LastModifiedBy_1");
		 String notes=rs.getString("Notes");
		 String cont1=rs.getString("CONT1");
		 String cont2=rs.getString("CONT2");
		 String cont3=rs.getString("CONT3");
		 String cont4=rs.getString("CONT4");
		 String cont5=rs.getString("CONT5");
		 String cont6=rs.getString("CONT6");
		 String cont7=rs.getString("CONT7");
		 String cont8=rs.getString("CONT8");
		 String cont9=rs.getString("CONT9");
		 String cont10=rs.getString("CONT10");
		 String contphn1=rs.getString("CONTPHN1");
		 String contphn2=rs.getString("CONTPHN2");
		 String contphn3=rs.getString("CONTPHN3");
		 String contphn4=rs.getString("CONTPHN4");
		 String contphn5=rs.getString("CONTPHN5");
		 String contphn6=rs.getString("CONTPHN6");
		 String contphn7=rs.getString("CONTPHN7");
		 String contphn8=rs.getString("CONTPHN8");
		 String contphn9=rs.getString("CONTPHN9");
		 String contphn10=rs.getString("CONTPHN10");
		 String contfax1=rs.getString("CONTFAX1");
		 String contfax2=rs.getString("CONTFAX2");
		 String contfax3=rs.getString("CONTFAX3");
		 String contfax4=rs.getString("CONTFAX4");
		 String contfax5=rs.getString("CONTFAX5");
		 String contfax6=rs.getString("CONTFAX6");
		 String contfax7=rs.getString("CONTFAX7");
		 String contfax8=rs.getString("CONTFAX8");
		 String contfax9=rs.getString("CONTFAX9");
		 String contfax10=rs.getString("CONTFAX10");
		 String email1=rs.getString("EMAIL1");
		 String email2=rs.getString("EMAIL2");
		 String email3=rs.getString("EMAIL3");
		 String email4=rs.getString("EMAIL4");
		 String email5=rs.getString("EMAIL5");
		 String email6=rs.getString("EMAIL6");
		 String email7=rs.getString("EMAIL7");
		 String email8=rs.getString("EMAIL8");
		 String email9=rs.getString("EMAIL9");
		 String email10=rs.getString("EMAIL10");
		 company=new DataBean(companyName,address,address1,city,state,zip,phone,fax,email,dataupdated,saleserson,notes,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10,contphn1,contphn2,contphn3,contphn4,contphn5,contphn6,contphn7,contphn8,contphn9,contphn10,contfax1,contfax2,contfax3,contfax4,contfax5,contfax6,contfax7,contfax8,contfax9,contfax10,email1,email2,email3,email4,email5,email6,email7,email8,email9,email10);
		 }
		conn.close();
		stm.close();
		}
		catch(Exception ex){com.clientdb.ErrorWriter.log(ex.getMessage());}
		return company;
	}
 }
