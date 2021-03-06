<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Map</title>
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
						<li class="active"><a href="map">Map</a></li>
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
				<br />
				<br />
				<h1>Map and local attractions</h1>
				<br />
			</div>
			<div class="span3 sidebar">


				<ul class="nav">
					<li><a class="active" href="map"><span>Area</span>
							Overview</a></li>
					<li><a href="facilities"><span>Popular</span>
							attractions</a></li>
					<li><a href="facilities"><span>services</span> and
							facilities</a></li>
					<li><a href="facilities"><span>nearby</span> shops</a></li>
					<li><a href="facilities"><span>food &amp;</span> drink</a></li>
					<li><a href="facilities"><span>How to </span>get here</a></li>
				</ul>
				<br />
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
												class="span3 global-datepicker-from check-in-date"
								value="11/01/2013" /> <a href="map"
												id="global-datepicker-from"><i class="icon-calendar"></i></a>
										</div>
									</div>
								</div>

								<div class="span3 ">
									<div class="control-group">
										<label for="focusedInput" class="control-label">Depart</label>
										<div class="controls">
											<input type="text"
												class="span3 global-datepicker-to check-out-date"
												value="12/01/2013" /> <a href="map"
												id="global-datepicker-to"><i class="icon-calendar"></i></a>
										</div>
									</div>
								</div>
							</div>

							<a class="btn btn-primary btn-large book-now"
								href="book-start">Check availability</a>
						</div>
					</div>

				</form>
				<br />
			</div>

			<div class="span9">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Donec vitae hendrerit odio. Nam sit amet mi pretium nulla cursus
					euismod. Pellentesque non nisl quis erat blandit egestas. Fusce
					tincidunt feugiat posuere. Quisque auctor gravida tortor a
					hendrerit. Sed id justo urna, sit amet pretium eros. Duis eleifend,
					urna eget pulvinar laoreet, lacus turpis convallis massa, eget
					pharetra ante urna accumsan nisl. Ut nec tortor ante, sed dictum
					urna. In cursus orci sit amet ligula scelerisque vitae iaculis
					lacus tempus. Nunc pretium tortor vestibulum diam consectetur
					blandit. Duis at bibendum elit. Donec luctus sem vel erat aliquet
					tincidunt.</p>

				<div id="map_canvas"></div>


				<div class="row">
					<div class="span4">
						<h3>Arts &amp; Culture</h3>
						<ul>
							<li>Colosseum/Il Colosseo <small>6.4 km/4.0 miles</small>
							</li>
							<li>Navona Square/Piazza Navona 6.4 km/4.0 miles</li>
							<li>Trevi Fountain/Fontana di Trevi 6.4 km/4.0 miles</li>
							<li>Capitoline Museums 6.4 km/4.0 miles</li>
							<li>Pantheon 6.4 km/4.0 miles</li>
							<li>Etruscan Museum 8.0 km/5.0 miles</li>
							<li>Gallery of Modern Art 8.0 km/5.0 miles</li>
							<li>Spanish Steps/Piazza di Spagna 8.0 km/5.0 miles</li>
							<li>Galleria Borghese Museum 8.0 km/5.0 miles</li>
							<li>Castel Saint Angelo (Hadrian's Mausoleum) 8.0 km/5.0
								miles</li>
							<li>Palazzo Al Temps Museum 8.1 km/5.0 miles</li>
							<li>Palazzo Massimo Museum 8.1 km/5.0 miles</li>
							<li>Vatican Museums 8.1 km/5.0 miles</li>
							<li>Tivoli (Roman Villas) 51.0 km/31.7 miles</li>
						</ul>
					</div>
					<div class="span4 offset1">

						<h3>Golf</h3>
						<ul>
							<li>Golf Club Parco De' Medici 3.2 km/2.0 miles</li>
						</ul>
						<h3>Government Offices</h3>
						<ul>
							<li>French Embassy 6.0 km/3.7 miles</li>
							<li>Embassy of the United States of America 8.0 km/5.0 miles
							</li>
							<li>British Embassy 8.0 km/5.0 miles</li>
							<li>Japanese Embassy 8.0 km/5.0 miles</li>
							<li>Australian Embassy 10.0 km/6.2 miles</li>
							<li>Canadian Embassy 10.0 km/6.2 miles</li>
							<li>German Embassy 12.0 km/7.5 miles</li>
						</ul>
						<h3>Local Attractions</h3>
						<ul>
							<li>Trastevere 4.8 km/3.0 miles</li>
							<li>Sistine Chapel 6.4 km/4.0 miles</li>
							<li>Civita Vecchia 71.0 km/44.1 miles</li>
						</ul>
					</div>
				</div>
				<br />
				<br />
			</div>
		</div>
	</div>
</div>
	<!-- /container -->
	<jsp:include page="includes/footer.jsp" />
<jsp:include page="includes/scripts.jsp" />
</body>
</html>