<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Promotions</title>
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
								<li class=""><a href="facilities">Facilities</a></li>
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
					<h1>Special offers</h1>
					<br />
				</div>
				<div class="span3">

					<form class="form-inline mini" action="">
						<div class="row">
							<div class="span3">
								<h4>When would you like to stay with us?</h4>

								<div class="row">
									<div class="span3">
										<div class="control-group">
											<label for="focusedInput" class="control-label">Arrive</label>
											<div class="controls">
												<input type="text"
													class="span2 global-datepicker-from check-in-date" value="" />
												<a href="#" id="global-datepicker-from"><i
													class="icon-calendar"></i></a>
											</div>
										</div>
									</div>

									<div class="span3 ">
										<div class="control-group">
											<label for="focusedInput" class="control-label">Depart</label>
											<div class="controls">
												<input type="text"
													class="span2 global-datepicker-to check-out-date" value="" />
												<a href="#" id="global-datepicker-to"><i
													class="icon-calendar"></i></a>
											</div>
										</div>
									</div>
								</div>

								<a class="btn btn-primary btn-large book-now"
									href="book-start.html">Check availability</a>


							</div>
						</div>

					</form>
				</div>

				<div class="span9 promotions">

					<div class="row">
						<div class="span3">
							<img alt="" src="web-resources/css/images/location.jpg">
						</div>

						<div class="span6">
							<h3>
								<span>Save 15-40%</span> at BootstrapHotel resort
							</h3>
							<p>Book your stay by January 31, and save 15-40% on weekend
								stays through December 31, at participating Hotels and Resorts.</p>
						</div>
					</div>
					<hr />
					<div class="row">
						<div class="span3">
							<img alt="" src="web-resources/css/images/services.png">
						</div>

						<div class="span6">
							<h3>
								<span>FREE</span> Breakfast, <span>FREE</span> Internet, <span>FREE</span>
								Tour
							</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Donec vitae hendrerit odio. Nam sit amet mi pretium nulla cursus
								euismod. Pellentesque non nisl quis erat blandit egestas.</p>
						</div>
					</div>
					<hr />
					<div class="row">
						<div class="span3">
							<img alt="" src="web-resources/css/images/promotions.png">
						</div>

						<div class="span6">
							<h3>
								Stay five nights and get <span>one night FREE!</span>
							</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Donec vitae hendrerit odio. Nam sit amet mi pretium nulla cursus
								euismod. Pellentesque non nisl quis erat blandit egestas.</p>
						</div>
					</div>
					<hr />
					<div class="row">
						<div class="span3">
							<img alt="" src="web-resources/css/images/rooms.jpg">
						</div>

						<div class="span6">
							<h3>
								<span>Save 20% OFF</span> by booking with us in advance.
							</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Donec vitae hendrerit odio. Nam sit amet mi pretium nulla cursus
								euismod. Pellentesque non nisl quis erat blandit egestas.</p>
						</div>
					</div>
					<br /> <br />

				</div>

			</div>
		</div>
		</div>
		<!-- /container -->
		<jsp:include page="includes/footer.jsp" />
		<jsp:include page="includes/scripts.jsp" />
</body>
</html>