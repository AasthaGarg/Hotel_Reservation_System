<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2{
color:green;}
#btn1{
border:2px solid green;
background-color: #91ED91;
border-radius: 40px;
}
</style>
</head>
<body>
    <div align="center">
	<h2>Hotel Reservation System</h2>
	<br>
	
	<form:form id="searchForm" modelAttribute="cityhotel" action="SearchResult">
	
		<table style="border:1px solid green; padding:15px">
		<h3>Search Hotel</h3>
			<tr>
				<td> <form:label path="city"> City : </form:label></td>
				<td> <form:select path="city">
				     <c:forEach var="list" items="${lists}">
				     <form:option value="${list.city}"/>
				     </c:forEach>
				     </form:select>
				</td>
			</tr>
			<tr>
			    <td> <form:label path="hotel"> Hotel : </form:label></td>
				<td> <form:select path="hotel">
				     <c:forEach var="list" items="${lists}">
				     <form:option value="${list.hotel}"/>
				     </c:forEach>
				     </form:select>
				</td>
				
			</tr>
			<tr>
			    <td> <form:label path="dates"> Date : </form:label></td>
				<td> <form:input path="dates" type="date" required="required"/></td>
			</tr>
			<tr></tr>
			<tr>    
	          <td> </td>    
	          <td><input type="submit" id="btn1" value="Check Availability" /></td>    
	         </tr>
		</table>
	</form:form>
	
	</div>
</body>
</html>
