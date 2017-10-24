package com.data;

public class DataBean {
	
	private String companyName;
	private String address;
	private String address1;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String fax;
	private String email_company;
	private String dateupdated;
	private String salesperson;
	private String notes;
	
	private String cont1;
	private String cont2;
	private String cont3;
	private String cont4;
	private String cont5;
	private String cont6;
	private String cont7;
	private String cont8;
	private String cont9;
	private String cont10;
	
	private String contphn1;
	private String contphn2;
	private String contphn3;
	private String contphn4;
	private String contphn5;
	private String contphn6;
	private String contphn7;
	private String contphn8;
	private String contphn9;
	private String contphn10;
	
	private String contfax1;
	private String contfax2;
	private String contfax3;
	private String contfax4;
	private String contfax5;
	private String contfax6;
	private String contfax7;
	private String contfax8;
	private String contfax9;
	private String contfax10;
	
	private String email1;
	private String email2;
	private String email3;
	private String email4;
	private String email5;
	private String email6;
	private String email7;
	private String email8;
	private String email9;
	private String email10;
	private String sessionuser;
	
	//constructor for company info update DataBean.updateCompany
	public DataBean(String companyName, String address, String address1, String city, String state, String zip,
			String phone, String fax, String email_company,String notes)
	{
		this.companyName = companyName;
		this.address = address;
		this.address1=address1;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.fax = fax;
		this.email_company=email_company;
		this.notes = notes;
	}
	//Constructor for COMPANY INFO methods
	public DataBean(String companyName1, String address1, String address11, String city1, String state1, String zip1,
			String phone1, String fax1, String email_company, String dateupdated1, String saleserson1, String notes1,String cont1, String cont2, String cont3, String cont4, String cont5, String cont6, String cont7,
			String cont8, String cont9, String cont10, String contphn1, String contphn2, String contphn3,
			String contphn4, String contphn5, String contphn6, String contphn7, String contphn8, String contphn9,
			String contphn10, String contfax1, String contfax2, String contfax3, String contfax4, String contfax5,
			String contfax6, String contfax7, String contfax8, String contfax9, String contfax10, String email1,
			String email2, String email3, String email4, String email5, String email6, String email7, String email8,
			String email9, String email10) {
		this.companyName = companyName1;
		this.address = address1;
		this.address1=address11;
		this.city = city1;
		this.state = state1;
		this.zip = zip1;
		this.phone = phone1;
		this.fax = fax1;
		this.email_company=email_company;
		this.dateupdated=dateupdated1;
		this.salesperson=saleserson1;
		this.notes = notes1;
	
		this.cont1=cont1;
		this.cont2=cont2;
		this.cont3=cont3;
		this.cont4=cont4;
		this.cont5=cont5;
		this.cont6=cont6;
		this.cont7=cont7;
		this.cont8=cont8;
		this.cont9=cont9;
		this.cont10=cont10;
		
		this.contphn1=contphn1;
		this.contphn2=contphn2;
		this.contphn3=contphn3;
		this.contphn4=contphn4;
		this.contphn5=contphn5;
		this.contphn6=contphn6;
		this.contphn7=contphn7;
		this.contphn8=contphn8;
		this.contphn9=contphn9;
		this.contphn10=contphn10;
		
		this.contfax1=contfax1;
		this.contfax2=contfax2;
		this.contfax3=contfax3;
		this.contfax4=contfax4;
		this.contfax5=contfax5;
		this.contfax6=contfax6;
		this.contfax7=contfax7;
		this.contfax8=contfax8;
		this.contfax9=contfax9;
		this.contfax10=contfax10;
		
		this.email1=email1;
		this.email2=email2;
		this.email3=email3;
		this.email4=email4;
		this.email5=email5;
		this.email6=email6;
		this.email7=email7;
		this.email8=email8;
		this.email9=email9;
		this.email10=email10;	
	}
	// Constructor for creating new entry(DataDOA.createdata))
	public DataBean(String companyName1, String address1, String address11, String city1, String state1, String zip1,
			String phone1, String fax1, String email_company, String dateupdated1, String saleserson1, String notes1,String cont1, String cont2, String cont3, String cont4, String cont5, String cont6, String cont7,
			String cont8, String cont9, String cont10, String contphn1, String contphn2, String contphn3,
			String contphn4, String contphn5, String contphn6, String contphn7, String contphn8, String contphn9,
			String contphn10, String contfax1, String contfax2, String contfax3, String contfax4, String contfax5,
			String contfax6, String contfax7, String contfax8, String contfax9, String contfax10, String email1,
			String email2, String email3, String email4, String email5, String email6, String email7, String email8,
			String email9, String email10 ,String sessionuser)
		{
		this.companyName = companyName1;
		this.address = address1;
		this.address1=address11;
		this.city = city1;
		this.state = state1;
		this.zip = zip1;
		this.phone = phone1;
		this.fax = fax1;
		this.email_company=email_company;
		this.dateupdated=dateupdated1;
		this.salesperson=saleserson1;
		this.notes = notes1;
	
		this.cont1=cont1;
		this.cont2=cont2;
		this.cont3=cont3;
		this.cont4=cont4;
		this.cont5=cont5;
		this.cont6=cont6;
		this.cont7=cont7;
		this.cont8=cont8;
		this.cont9=cont9;
		this.cont10=cont10;
		
		this.contphn1=contphn1;
		this.contphn2=contphn2;
		this.contphn3=contphn3;
		this.contphn4=contphn4;
		this.contphn5=contphn5;
		this.contphn6=contphn6;
		this.contphn7=contphn7;
		this.contphn8=contphn8;
		this.contphn9=contphn9;
		this.contphn10=contphn10;
		
		this.contfax1=contfax1;
		this.contfax2=contfax2;
		this.contfax3=contfax3;
		this.contfax4=contfax4;
		this.contfax5=contfax5;
		this.contfax6=contfax6;
		this.contfax7=contfax7;
		this.contfax8=contfax8;
		this.contfax9=contfax9;
		this.contfax10=contfax10;
		
		this.email1=email1;
		this.email2=email2;
		this.email3=email3;
		this.email4=email4;
		this.email5=email5;
		this.email6=email6;
		this.email7=email7;
		this.email8=email8;
		this.email9=email9;
		this.email10=email10;
		
		this.sessionuser=sessionuser;
	}

	public DataBean() {} //Default constructor
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getEmail_company() {
		return email_company;
	}

	public void setEmail_company(String email_company) {
		this.email_company = email_company;
	}
	public String getDateupdated() {
		return dateupdated;
	}
	public void setDateupdated(String dateupdated) {
		this.dateupdated = dateupdated;
	}	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStreet() {
		return address;
	}
	public void setStreet(String street) {
		this.address = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getCont1() {
		return cont1;
	}
	public void setCont1(String cont1) {
		this.cont1 = cont1;
	}
	public String getCont2() {
		return cont2;
	}
	public void setCont2(String cont2) {
		this.cont2 = cont2;
	}
	public String getCont3() {
		return cont3;
	}
	public void setCont3(String cont3) {
		this.cont3 = cont3;
	}
	public String getCont4() {
		return cont4;
	}
	public void setCont4(String cont4) {
		this.cont4 = cont4;
	}
	public String getCont5() {
		return cont5;
	}
	public void setCont5(String cont5) {
		this.cont5 = cont5;
	}
	public String getCont6() {
		return cont6;
	}
	public void setCont6(String cont6) {
		this.cont6 = cont6;
	}
	public String getCont7() {
		return cont7;
	}
	public void setCont7(String cont7) {
		this.cont7 = cont7;
	}
	public String getCont8() {
		return cont8;
	}
	public void setCont8(String cont8) {
		this.cont8 = cont8;
	}
	public String getCont9() {
		return cont9;
	}
	public void setCont9(String cont9) {
		this.cont9 = cont9;
	}
	public String getCont10() {
		return cont10;
	}
	public void setCont10(String cont10) {
		this.cont10 = cont10;
	}
	public String getContphn1() {
		return contphn1;
	}
	public void setContphn1(String contphn1) {
		this.contphn1 = contphn1;
	}
	public String getContphn2() {
		return contphn2;
	}
	public void setContphn2(String contphn2) {
		this.contphn2 = contphn2;
	}
	public String getContphn3() {
		return contphn3;
	}
	public void setContphn3(String contphn3) {
		this.contphn3 = contphn3;
	}
	public String getContphn4() {
		return contphn4;
	}
	public void setContphn4(String contphn4) {
		this.contphn4 = contphn4;
	}
	public String getContphn5() {
		return contphn5;
	}
	public void setContphn5(String contphn5) {
		this.contphn5 = contphn5;
	}
	public String getContphn6() {
		return contphn6;
	}
	public void setContphn6(String contphn6) {
		this.contphn6 = contphn6;
	}
	public String getContphn7() {
		return contphn7;
	}
	public void setContphn7(String contphn7) {
		this.contphn7 = contphn7;
	}
	public String getContphn8() {
		return contphn8;
	}
	public void setContphn8(String contphn8) {
		this.contphn8 = contphn8;
	}
	public String getContphn9() {
		return contphn9;
	}
	public void setContphn9(String contphn9) {
		this.contphn9 = contphn9;
	}
	public String getContphn10() {
		return contphn10;
	}
	public void setContphn10(String contphn10) {
		this.contphn10 = contphn10;
	}
	
	public String getContfax1() {
		return contfax1;
	}
	public void setContfax1(String contfax1) {
		this.contfax1 = contfax1;
	}
	public String getContfax2() {
		return contfax2;
	}
	public void setContfax2(String contfax2) {
		this.contfax2 = contfax2;
	}
	public String getContfax3() {
		return contfax3;
	}
	public void setContfax3(String contfax3) {
		this.contfax3 = contfax3;
	}
	public String getContfax4() {
		return contfax4;
	}
	public void setContfax4(String contfax4) {
		this.contfax4 = contfax4;
	}
	public String getContfax5() {
		return contfax5;
	}
	public void setContfax5(String contfax5) {
		this.contfax5 = contfax5;
	}
	public String getContfax6() {
		return contfax6;
	}
	public void setContfax6(String contfax6) {
		this.contfax6 = contfax6;
	}
	public String getContfax7() {
		return contfax7;
	}
	public void setContfax7(String contfax7) {
		this.contfax7 = contfax7;
	}
	public String getContfax8() {
		return contfax8;
	}
	public void setContfax8(String contfax8) {
		this.contfax8 = contfax8;
	}
	public String getContfax9() {
		return contfax9;
	}
	public void setContfax9(String contfax9) {
		this.contfax9 = contfax9;
	}
	public String getContfax10() {
		return contfax10;
	}
	public void setContfax10(String contfax10) {
		this.contfax10 = contfax10;
	} 
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEmail3() {
		return email3;
	}
	public void setEmail3(String email3) {
		this.email3 = email3;
	}
	public String getEmail4() {
		return email4;
	}
	public void setEmail4(String email4) {
		this.email4 = email4;
	}
	public String getEmail5() {
		return email5;
	}
	public void setEmail5(String email5) {
		this.email5 = email5;
	}
	public String getEmail6() {
		return email6;
	}
	public void setEmail6(String email6) {
		this.email6 = email6;
	}
	public String getEmail7() {
		return email7;
	}
	public void setEmail7(String email7) {
		this.email7 = email7;
	}
	public String getEmail8() {
		return email8;
	}
	public void setEmail8(String email8) {
		this.email8 = email8;
	}
	public String getEmail9() {
		return email9;
	}
	public void setEmail9(String email9) {
		this.email9 = email9;
	}
	public String getEmail10() {
		return email10;
	}
	public void setEmail10(String email10) {
		this.email10 = email10;
	}
	public String getSessionUser()
	{
		return sessionuser;
	}
	public void setSessionUser(String sessionuser) {
		this.sessionuser=sessionuser;
	}
}
