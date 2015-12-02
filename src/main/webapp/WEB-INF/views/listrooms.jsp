<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Rooms</title>
<link rel="stylesheet"
	href='<c:url value="/web-resources/css/pure-0.4.2.css"/>'>
<link rel="stylesheet"
	href='<c:url value="/web-resources/css/font-awesome-4.0.3/css/font-awesome.css"/>'>
<link rel="stylesheet"
	href='<c:url value="/web-resources/css/jquery-ui-1.10.4.custom.css"/>'>

<style type="text/css">
th {
	text-align: left
}
</style>
</head>
<body>
	<div style="width: 95%; margin: 0 auto;">
		<h1>Spartan Room Book - Hotel booking service</h1>
		<h2>List Rooms</h2>
		<div id="roomDialog" style="display: none;">
			<%@ include file="roomForm.jsp"%>
		</div>
		<button class="pure-button pure-button-primary" onclick="addBook()">
			<i class="fa fa-plus"></i> Add Book
		</button>
		<br>

		<table class="pure-table pure-table-bordered pure-table-striped"
			border="1">
			<thead>
				<tr>
					<th width="4%">No.</th>
					<th width="24%">Room Status</th>
					<th width="24%">Room Type</th>
					<th width="24%">Other Type</th>
					<th width="24%">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roomList}" var="room">
					<tr>
						<td><c:out value="${room.id}" /></td>
						<td><c:choose>
								<c:when test="${room.statusId == 1}">Available</c:when>
								<c:when test="${room.statusId == 2}">Reserved</c:when>
								<c:when test="${room.statusId == 3}">In use</c:when>
								<c:otherwise>None!!</c:otherwise>
							</c:choose>
						<td><c:choose>
								<c:when test="${room.roomTypeId == 1}">2 Queen Bed</c:when>
								<c:when test="${room.roomTypeId == 2}">1 King Bed</c:when>
								<c:otherwise>None!!</c:otherwise>
							</c:choose>
						<td><c:choose>
								<c:when test="${room.otherTypeId == 1}">Smoking</c:when>
								<c:when test="${room.otherTypeId == 2}">Non Smoking</c:when>
								<c:otherwise>None!!</c:otherwise>
							</c:choose></td>
						<td>
							<button onclick="editRoom(${room.id});"
								class="pure-button pure-button-primary">
								<i class="fa fa-pencil"></i> Edit
							</button>
							<form action="<c:url value='${room.id}'/>" method="POST">
								<input type="hidden" name="_method" value="DELETE"
									class="pure-button pure-button-primary"> <input
									type="submit"
									class="pure-button pure-button-primary fa fa-times"
									value="DELETE">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery-ui-1.10.4.custom.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/lib/jquery.ui.datepicker.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/js-for-listRooms.js"/>'></script>
</body>
</html>