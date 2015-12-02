<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>RoomManagement</title>
<jsp:include page="includes/header.jsp" />
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<!-- start header -->
			<jsp:include page="menu.jsp" />
			<!-- end header -->
			<div class="span6 pull-right main_menu">
				<div class="navbar">
					<div class="container">
						<a class="btn btn-navbar" data-toggle="collapse"
							data-target=".nav-collapse"> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
						</a>
						<div class="nav-collapse">
							<ul class="nav nav-pills">
								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">ROOMS <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="#">Amenities</a></li>
										<li><a href="#">Bed Types</a></li>
										<li><a href="#">Room Type</a></li>
									</ul></li>
								<li class=""><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">GUEST <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="#">Check in/out</a></li>
										<li><a href="#">Change Reservation</a></li>
									</ul></li>
							</ul>
						</div>

						<!-- /.nav-collapse -->
					</div>
				</div>
				<!-- /navbar -->
			</div>
			<div class="row">
				<div class="span12">
					<br /> <br />
					<h1>Room Management</h1>
					<br />
					<div id="roomDialog" style="display: none;">
						<%@ include file="roomForm.jsp"%>
					</div>
					<button class="btn btn-primary btn-large book-now"
						onclick="addBook()">
						<i class="fa fa-plus"></i> Add
					</button>
				</div>
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th width="4%">ROOM NO</th>
							<th width="24%">ROOM STATUS</th>
							<th width="24%">ROOM TYPE</th>
							<th width="24%">SMOKING/NON-SMOKING</th>
							<th width="1%" align="center">ACTIONS</th>
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
										<i class="fa fa-pencil"></i> EDIT
									</button>
								</td>
								<td>
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
		</div>
	</div>
	<!-- /container -->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/scripts.jsp" />
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