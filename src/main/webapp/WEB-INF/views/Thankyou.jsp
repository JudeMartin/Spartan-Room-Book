<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Thank You</title>
<jsp:include page="includes/header.jsp" />
</head>
<body>
	<div class="container-fluid" style="min-height: 550px;">
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
						<li class=""><a href="home">Home</a></li>
						<li class=""><a href="rooms">Rooms</a></li>
						<li class=""><a href="facilities">Facilities</a></li>
						<li class=" "><a href="gallery">Gallery</a></li>
						<li class=""><a href="map">Map</a></li>
						<li class=""><a href="book-start">Book</a></li>
						<li class=""><a href="room">Login</a></li>
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
			<h3>Thank You </h3>
			<p>For choosing Hotel Sparta</p>
		</div>
	</div>
	</div>
	</div>
	</br>
	<!-- /container -->
	<jsp:include page="includes/footer.jsp" />
<jsp:include page="includes/scripts.jsp" />
</body>
</html>