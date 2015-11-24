<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List Guests</h1>
		<table border="1" style="width:100%">
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
          <tbody>
            <c:forEach items="${guests}" var="guestData">
             <tr>
                 <td>${guestData.guest_id}</td>
                 <td>${guestData.first_name}</td>
                 <td>${guestData.last_name}</td>
                 <td>${guestData.address}</td>
   	     	 	 <td>${guestData.email}</td>
           	     <td>${guestData.phone}</td>
				 <td>${guestData.city}</td>
                 <td>${guestData.country}</td>
                 <td>${guestData.driver_license}</td>
             </tr>
            </c:forEach>
           </tbody>
</table>
</body>
</html>