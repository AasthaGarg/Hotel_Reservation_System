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
h3{
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
	
	<form:form id="reservationForm" action="ConfirmReservation">
	
		<table style="border:1px solid green; padding:15px">
		<h3>Reservation Form</h3>
			<tr>
				<td>Guest Name : </td>
				<td><input type="text" name="name" required="required" /></td>
				
			</tr>
			<tr>
			    <td>Gender : </td>
				<td> <select>
				     <option value="Male">Male</option>
				     <option value="Female">Female</option>
				     </select>
				</td>
				
			</tr>
			<tr>
			    <td>Age : </td>
				<td> <input type="number" name="age"/></td>
			</tr>
			<tr>
			    <td>Email Id : </td>
				<td> <input type ="email" name="email" required="required"/></td>
			</tr>
			<tr>
			    <td>Mobile No. : </td>
				<td> <input type ="text" name="number" required="required"/></td>
			</tr>
			<tr></tr>
			<tr>    
	          <td> </td>    
	          <td><input type="submit" id="btn1" value="Reserve" /></td>    
	         </tr>
		</table>
	</form:form>
	
	</div>

</body>
</html>
