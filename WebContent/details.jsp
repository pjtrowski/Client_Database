<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%String type=(String)session.getAttribute("currentSessionUserType");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<c:set var="userType" value="<%=type %>"/>
	<div class='inline' style="background-color:#c6c6c6;display:flex;">
		<h4 class='companyName' id='modalCompany'>${companyInfo.companyName}</h4>
		<c:choose>
		<c:when test="${userType=='Admin'||userType=='Write'}">
		<button type='button' class='btn btn-defult btn-sm EditCompanyBtn' onClick='editCompany()' data-toggle='modal' data-target='#editCompany'>EDIT INFO & NOTES</button>
		</c:when>
		<c:otherwise></c:otherwise>
		</c:choose>
	</div>
	<p><strong>Address: </strong><span id='modalStreet'>${companyInfo.address}</span></p><p><span id='modalCity'>${companyInfo.city}</span>,<span id='modalState'>${companyInfo.state}</span>, <span id='modalZip'>${companyInfo.zip}</span></p>
	<p><strong>Company Phone: </strong><span id='modalPhone'>${companyInfo.phone}</span></p>
	<p><strong>Company Fax: </strong><span id='modalFax'>${companyInfo.fax}</span></p>
	<p><strong>Company Email: </strong><span id='modalEmail'>${companyInfo.email_company}</span></p>
	<p id='modalLastUpdated'><strong>LastUpdated:  </strong>${companyInfo.dateupdated}<strong>  by  </strong> ${companyInfo.salesperson}</p>
	<p><strong>Notes:</strong><br><span id='modalNotes' style="white-space:pre-wrap">${companyInfo.notes}</span></p>

<table class="table">
	<thead style="background-color:#c6c6c6;">
	<tr>
      <th>Contact</th>
      <th>Phone</th>
      <th>Email</th>
      <c:choose>
		<c:when test="${userType=='Admin'||userType=='Write'}">
      <th><button type='button' class='btn btn-defult btn-sm EditContactsBtn' onClick='editContacts()' data-toggle='modal' data-target='#editContacts'>EDIT CONTACTS</button></th>
		</c:when>
		<c:otherwise></c:otherwise>
		</c:choose>      
	</tr>
	</thead>
	<tbody>
	<tr>
		<td><span id="cont1"><c:out value="${companyInfo.cont1}"/></span></td>
		<td><span id="contphn1"><c:out value="${companyInfo.contphn1}"/></span></td>
		<td><span id="email1"><c:out value="${companyInfo.email1}"/></span></td>
	</tr>
	<tr>
		<td><span id="cont2"><c:out value="${companyInfo.cont2}"/></span></td>
		<td><span id="contphn2"><c:out value="${companyInfo.contphn2}"/></span></td>
		<td><span id="email2"><c:out value="${companyInfo.email2}"/></span></td>
	</tr>
	<tr>
		<td><span id="cont3"><c:out value="${companyInfo.cont3}"/></span></td>
		<td><span id="contphn3"><c:out value="${companyInfo.contphn3}"/></span></td>
		<td><span id="email3"><c:out value="${companyInfo.email3}"/></span></td>
	</tr>
	<tr>
		<td><span id="cont4"><c:out value="${companyInfo.cont4}"/></span></td>
		<td><span id="contphn4"><c:out value="${companyInfo.contphn4}"/></span></td>
		<td><span id="email4"><c:out value="${companyInfo.email4}"/></span></td>
	</tr>
	<tr>
		<td><span id="cont5"><c:out value="${companyInfo.cont5}"/></span></td>
		<td><span id="contphn5"><c:out value="${companyInfo.contphn5}"/></span></td>
		<td><span id="email5"><c:out value="${companyInfo.email5}"/></span></td>
	</tr>
	<tr>
		<td><c:out value="${companyInfo.cont6}"/></td>
		<td><c:out value="${companyInfo.contphn6}"/></td>
		<td><c:out value="${companyInfo.email6}"/></td>

	</tr>
<tr>
	<td><c:out value="${companyInfo.cont7}"/></td>
	<td><c:out value="${companyInfo.contphn7}"/></td>
	<td><c:out value="${companyInfo.email7}"/></td>

</tr>
<tr>
	<td><c:out value="${companyInfo.cont8}"/></td>
	<td><c:out value="${companyInfo.contphn8}"/></td>
	<td><c:out value="${companyInfo.email8}"/></td>

</tr>
<tr>
	<td><c:out value="${companyInfo.cont9}"/></td>
	<td><c:out value="${companyInfo.contphn9}"/></td>
	<td><c:out value="${companyInfo.email9}"/></td>

</tr>
<tr>
	<td><c:out value="${companyInfo.cont10}"/></td>
	<td><c:out value="${companyInfo.contphn10}"/></td>
	<td><c:out value="${companyInfo.email10}"/></td>

</tr>

</tbody>
</table>
<button type='button' class='btn btn-defult' onClick="printDiv('info')" style="width:100%; margin-bottom:1%;">PRINT COMPANY</button>
</body>
</html>