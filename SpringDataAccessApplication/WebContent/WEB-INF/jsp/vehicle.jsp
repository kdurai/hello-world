<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
.divider{
    width:10px;
    display:inline-block;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Registration</title>
</head>
<body>
	<form action="add" method="POST">
	<table>
		<tr>
			<td>Vehicle Number</td>
			<td><input type="text" name="vehicleNo" value="${param.vehicleNo}"/></td>			
		</tr>
		<tr>
			<td>Color</td>
			<td><input type="text" name="color" value="${param.color}"/></td>			
		</tr>
		<tr>
		<tr>
			<td>Wheels</td>
			<td><input type="text" name="wheels" value="${param.wheels}"/></td>			
		</tr>
		<tr>
			<td>Seat</td>
			<td><input type="text" name="seat" value="${param.seat}"/></td>			
		</tr>

		<tr>
			<td colspan="2">
				<input type="submit" value="Add"/>
				<div class="divider"/></div>
				<input type="submit" value="Find">
				<div class="divider"/></div>
				<input type="submit" value="List">				
				<div class="divider"/></div>
				<input type="submit" value="Update">
				<div class="divider"/></div>
				<input type="submit" value="Delete">			
			</td>
			<td colspan="2"></td>
		</tr>
	</table>
	
	<table border="1">
		<tr>
			<th>Vehicle Number</th>
			<th>Color</th>
			<th>Wheels</th>
			<th>Seat</th>
		</tr>
		<c:forEach vehicle="${ }"
	</table>
</form>	
</body>
</html>