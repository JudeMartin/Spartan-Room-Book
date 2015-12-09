<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>StartBooking</title>
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
								<li class="active"><a href="book-start">Book</a></li>
								<li class=""><a href="room">Login</a></li>
							</ul>
						</div>
						<!-- /.nav-collapse -->
					</div>
				</div>
				<!-- /navbar -->
			</div>
			<div class="row book-start">

				<div class="span12">
					<br /> <br />
					<h1>
						Book your room<br /> <small>When would you like to stay
							with us?</small>
					</h1>

					<div class="row">
						<div class="span9">

							<h3>
								<span>Check-in</span> date
							</h3>
							<div type="text" class="datepicker_from" name="from"></div>
							<h3>
								<span>Check-out</span> date
							</h3>
							<div type="text" class="datepicker_to" name="to"></div>
						</div>
						<div class="span3">
							<div class="row">
								<div class="span3">
									<h3>
										<span>select</span> your room
									</h3>
									<div class="room_selector" data-price="100" data-adults="1"
										data-kids="1">
										<h5>
											<a href="book-start#" class="pull-left"><i
												class="icon-chevron-left"></i></a>King Size<a
												href="book-start#" class="pull-right "><i
												class="icon-chevron-right"></i></a>
										</h5>
										<a href="listings.html"><img
											src="web-resources/css/images/rooms/single_room.jpg" alt="" /></a>
										<p>All King size rooms have one king size bed for one adult and a kid. A 25-inch TV is included.</p>
									</div>
									<div class="room_selector" data-price="200" data-adults="2"
										data-kids="1" style="display: none;">
										<h5>
											<a href="book-start#" class="pull-left "><i
												class="icon-chevron-left"></i></a>Queen Size Room<a
												href="book-start#" class="pull-right "><i
												class="icon-chevron-right"></i></a>
										</h5>
										<a href="listings.html"><img
											src="web-resources/css/images/rooms/double_room.jpg" alt="" /></a>
										<p>All Queen sized rooms have two queen size beds for two adults.A 50-inch TV is included.</p>
									</div>
									<div class="room_selector" data-price="300" data-adults="3"
										data-kids="2" style="display: none;">
										<h5>
											<a href="book-start#" class="pull-left "><i
												class="icon-chevron-left"></i></a>Triple Room<a
												href="book-start#" class="pull-right "><i
												class="icon-chevron-right"></i></a>
										</h5>
										<a href="listings.html"><img
											src="web-resources/css/images/rooms/triple_room.jpg" alt="" /></a>
										<p>All triple rooms have one double bed and a single bed
											and sleeps up to three people.</p>
									</div>
									<div class="room_selector" data-price="400" data-adults="4"
										data-kids="3" style="display: none;">
										<h5>
											<a href="book-start#" class="pull-left "><i
												class="icon-chevron-left"></i></a>Luxury Room<a
												href="book-start#" class="pull-right "><i
												class="icon-chevron-right"></i></a>
										</h5>
										<a href="listings.html"><img
											src="web-resources/css/images/rooms/luxury_room.jpg" alt="" /></a>
										<p>All rooms have two double beds and a balcony. Sleeps up
											to four adults.</p>
									</div>
									<div class="room_selector" data-price="500" data-adults="4"
										data-kids="3" style="display: none;">
										<h5>
											<a href="book-start#" class="pull-left "><i
												class="icon-chevron-left"></i></a>Private pool room<a
												href="book-start#" class="pull-right "><i
												class="icon-chevron-right"></i></a>
										</h5>
										<a href="listings.html"><img
											src="web-resources/css/images/rooms/private_pool.jpg" alt="" /></a>
										<p>A private pool, two double beds and a sea view. Sleeps
											up to four adults.</p>
									</div>
									<div class="room_selector" data-price="500" data-adults="5"
										data-kids="4" style="display: none;">
										<h5>
											<a href="book-start#" class="pull-left "><i
												class="icon-chevron-left"></i></a>Private villa<a
												href="book-start#" class="pull-right "><i
												class="icon-chevron-right"></i></a>
										</h5>
										<a href="listings.html"><img
											src="web-resources/css/images/rooms/private_villa.jpg" alt="" /></a>
										<p>All villas have an en-suite bathroom and sundeck.
											Sleeps up to five adults.</p>
									</div>
								</div>
							</div>
						</div>
						<br />
						<div class="row">

							<div class="span3">
								<h3>
									<span>Rooms</span> and people
								</h3>

								<div class="form-horizontal">

									<div class="control-group">
										<label class="control-label" for="inputEmail">Rooms</label>
										<div class="controls">
											<select class="span1 select_rooms">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option>
											</select>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="inputEmail">Adults
											per room</label>
										<div class="controls">
											<select class="span1 select_adults">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option>
											</select>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="inputEmail">Kids per
											room</label>
										<div class="controls">
											<select class="span1 select_kids">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option>
											</select>
										</div>
									</div>
									<div class="control-group"></div>

								</div>
							</div>
							<div class="row">
								<div class="span3">
									<h1 id="total_price">$ 700.00</h1>
									<a class="btn btn-primary btn-large book-now" href="book">Book
										now!</a>
								</div>
							</div>
						</div>
					</div>
					<br /> <br />
					<p>Please note: All single rooms have one single bed and sleeps
						one adult. A 25-inch TV is included. Duis aute irure dolor in
						reprehenderit in voluptate velit esse cillum dolore eu fugiat
						nulla pariatur. Excepteur sint occaecat cupidatat non proident,
						sunt in culpa qui.</p>
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