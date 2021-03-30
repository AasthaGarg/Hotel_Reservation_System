<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div{
padding-top:10%;
padding-left:35%;
}
table,tr,td{
border: 1px solid green;
border-collapse:collapse;
padding: 30px;
}
button{
position: absolute;
height: 40px;
width: 70px;
border:2px solid green;
background-color: #91ED91;
border-radius: 40px;
padding-top: 7px;
top: 350px;
}
#btn1{
left: 710px;
}
#btn2{
left:620px;
}
</style>
</head>
<body>
<div>

<table>
<tr>
<td>Room Type</td>
<td>Price</td>
<td>GST</td>
<td>Total</td>
</tr>
<tr>
<c:forEach var="cityhotel" items="${list}">
<td>${cityhotel.room_type}</td>
<td>${cityhotel.price}</td>
<td>${cityhotel.gst}</td>
<td>${cityhotel.price + cityhotel.gst}</td>
</c:forEach>
</tr>
</table>
<a href="MakeReservation"><button type="button" id="btn1">Confirm</button></a>
<a href="SearchHotel"><button type="button" id="btn2">Back</button></a>
</div>

</body>
</html>
