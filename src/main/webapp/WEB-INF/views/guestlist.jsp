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
<h3><a href="/Spring3HibernateApp/add.html">Add More Guest</a></h3>

<c:if test="${!empty guests}">
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

		<c:forEach items="${guests}" var="guest">
			<tr>
				<td><c:out value="${guest.guest_id}"/></td>	
				<td><c:out value="${guest.first_name}"/></td>
				<td><c:out value="${guest.last_name}"/></td>
				<td><c:out value="${guest.address}"/></td>
				<td><c:out value="${guest.email}"/></td>
				<td><c:out value="${guest.phone}"/></td>
				<td><c:out value="${guest.city}"/></td>
				<td><c:out value="${guest.country}"/></td>
				<td><c:out value="${guest.driver_license}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>