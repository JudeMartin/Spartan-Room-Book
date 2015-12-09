<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Facilities</title>
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
								<li class=""><a href="home">Home</a></li>
								<li class=""><a href="rooms">Rooms</a></li>
								<li class="active"><a href="facilities">Facilities</a></li>
								<li class=""><a href="gallery">Gallery</a></li>
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
					<h1>facilities and services</h1>

					<div class="row">

						<div class="span6">
							<h3>
								<span>Fitness</span> Center
							</h3>
							<a href="general.html"><img
								src="web-resources/css/images/facilities/gym.jpg" alt="" /></a>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit
								esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
								occaecat cupidatat non proident, sunt in culpa qui.</p>
						</div>

						<div class="span6">
							<h3>
								<span>Spa </span> &amp; Massage
							</h3>
							<a href="general.html"><img
								src="web-resources/css/images/facilities/massage.jpg" alt="" /></a>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit
								esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
								occaecat cupidatat non proident, sunt in culpa qui.</p>
						</div>

						<div class="span6">
							<h3>
								<span>fun</span> &amp; sports
							</h3>
							<a href="general.html"><img
								src="web-resources/css/images/facilities/golf.jpg" alt="" /></a>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit
								esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
								occaecat cupidatat non proident, sunt in culpa qui.</p>
						</div>

						<div class="span6">
							<h3>
								<span>Swimming </span> pool
							</h3>
							<a href="general.html"><img
								src="web-resources/css/images/facilities/swimming_pool.jpg"
								alt="" /></a>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit
								esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
								occaecat cupidatat non proident, sunt in culpa qui.</p>
						</div>

						<div class="span6">
							<h3>
								<span>Water</span> sports
							</h3>
							<a href="general.html"><img
								src="web-resources/css/images/facilities/scuba.jpg" alt="" /></a>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit
								esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
								occaecat cupidatat non proident, sunt in culpa qui.</p>
						</div>

						<div class="span6">
							<h3>
								<span>Food </span> &amp; drink
							</h3>
							<a href="general.html"><img
								src="web-resources/css/images/facilities/restaurant.jpg" alt="" /></a>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit
								esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
								occaecat cupidatat non proident, sunt in culpa qui.</p>
						</div>

					</div>




				</div>

			</div>

			<div class="row">
				<div class="span12 what_people_say">
					<div id="quotes">
						<blockquote class="textItem" style="display: none;">
							<p>This is the best hotel I've ever been to.</p>
							<small>Someone famous <cite title="Source Title">Source
									Title</cite></small>
						</blockquote>

						<blockquote class="textItem" style="display: none;">
							<p>The food is incredible.</p>
							<small>Someone famous <cite title="Source Title">Source
									Title</cite></small>
						</blockquote>

						<blockquote class="textItem" style="display: none;">
							<p>Beyond All Expectations</p>
							<small>Someone famous <cite title="Source Title">Source
									Title</cite></small>
						</blockquote>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/scripts.jsp" />
</body>
</html>