<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List Guests</h1>


<c:if test="${!empty guest}">
	<table align="left" border="1">
		<tr>
			<th>Guest ID</th>
			<th>Guest First Name</th>
			<th>Guest Last Name</th>
			<th>Guest Address</th>
			<th>Guest Email</th>
			<th>Guest Phone</th>
			<th>Guest City</th>
			<th>Guest Country</th>
			<th>Guest DL</th>
		</tr>

		<c:forEach items="${guest}" var="guestData">
			<tr>
				<td><c:out value="${guestData.guest_id}"/></td>	
				<td><c:out value="${guestData.first_name}"/></td>
				<td><c:out value="${guestData.last_name}"/></td>
				<td><c:out value="${guestData.address}"/></td>
				<td><c:out value="${guestData.email}"/></td>
				<td><c:out value="${guestData.phone}"/></td>
				<td><c:out value="${guestData.city}"/></td>
				<td><c:out value="${guestData.country}"/></td>
				<td><c:out value="${guestData.driver_license}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>