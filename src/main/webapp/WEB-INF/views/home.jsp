<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="header.jsp" />
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="row-fluid slideshow-row">
		<div class="span12 slideshow">
			<div class="slider-wrapper theme-default">
				<div class="ribbon"></div>
				<div id="nivoslider-125" class="nivoSlider">
					<img src="web-resources/css/images/slide-1.png" alt="" /> <img
						src="web-resources/css/images/slide-2.png" alt="" /> <img
						src="web-resources/css/images/slide-3.png" alt="" />
				</div>
			</div>
			<div id="nivoslider-125-caption-0" class="nivo-html-caption">You
				can add captions too&#8230;</div>
		</div>

	</div>
	<div class="row-fluid home">
		<div class="span12">
			<h2>
				start <span>Booking your room</span><br> select your dates and
				options below
			</h2>
		</div>
	</div>
	<form class="form-inline" action="">
		<div class="row-fluid home">
			<div class="span3">
				<div class="room_selector" data-price="34" data-adults="1"
					data-kids="1">
					<h5>
						<a href="home" class="pull-left"><i class="icon-chevron-left"></i></a>Queen
						Sized room<a href="home" class="pull-right "><i
							class="icon-chevron-right"></i></a>
					</h5>
					<a href="listings.html"><img
						src="web-resources/css/images/rooms/single_room.jpg" alt="" /></a>
					<p>All queen sized rooms have one single queen sized bed and
						sleeps one adult. A 25-inch TV is included.</p>
				</div>
				<div class="room_selector" data-price="48" data-adults="2"
					data-kids="1" style="display: none;">
					<h5>
						<a href="home" class="pull-left "><i class="icon-chevron-left"></i></a>King
						Sized Room<a href="home" class="pull-right "><i
							class="icon-chevron-right"></i></a>
					</h5>
					<a href="listings.html"><img
						src="web-resources/css/images/rooms/double_room.jpg" alt="" /></a>
					<p>All king sized rooms have a single king sized bed and sleeps
						two adults & a kid.A 50-inch TV is included</p>
				</div>
				<div class="room_selector" data-price="62" data-adults="3"
					data-kids="2" style="display: none;">
					<h5>
						<a href="home" class="pull-left "><i class="icon-chevron-left"></i></a>Triple
						Room<a href="home" class="pull-right "><i
							class="icon-chevron-right"></i></a>
					</h5>
					<a href="listings.html"><img
						src="web-resources/css/images/rooms/triple_room.jpg" alt="" /></a>
					<p>All triple rooms have one double bed and a single bed and
						sleeps up to three people.</p>
				</div>
				<div class="room_selector" data-price="72" data-adults="4"
					data-kids="3" style="display: none;">
					<h5>
						<a href="home" class="pull-left "><i class="icon-chevron-left"></i></a>Luxury
						Room<a href="home" class="pull-right "><i
							class="icon-chevron-right"></i></a>
					</h5>
					<a href="listings.html"><img
						src="web-resources/css/images/rooms/luxury_room.jpg" alt="" /></a>
					<p>All rooms have two double beds and a balcony. Sleeps up to
						four adults.</p>
				</div>
				<div class="room_selector" data-price="97" data-adults="4"
					data-kids="3" style="display: none;">
					<h5>
						<a href="home" class="pull-left "><i class="icon-chevron-left"></i></a>Private
						pool room<a href="home" class="pull-right "><i
							class="icon-chevron-right"></i></a>
					</h5>
					<a href="listings.html"><img
						src="web-resources/css/images/rooms/private_pool.jpg" alt="" /></a>
					<p>A private pool, two double beds and a sea view. Sleeps up to
						four adults.</p>
				</div>
				<div class="room_selector" data-price="128" data-adults="5"
					data-kids="4" style="display: none;">
					<h5>
						<a href="home" class="pull-left "><i class="icon-chevron-left"></i></a>Private
						villa<a href="home" class="pull-right "><i
							class="icon-chevron-right"></i></a>
					</h5>
					<a href="listings.html"><img
						src="web-resources/css/images/rooms/private_villa.jpg" alt="" /></a>
					<p>All villas have an en-suite bathroom and sundeck. Sleeps up
						to five adults.</p>
				</div>
			</div>
			<div class="span3 home_calendar">
				<div class="form-horizontal">
					<div class="control-group">
						<label class="control-label pull-left" for="inputEmail">Arrive</label>
						<div class="controls">
							<input type="text" value="" class="span2 check-in-date"
								value="2012/11/22" />
						</div>
					</div>
				</div>
				<div class="datepicker_from"></div>
			</div>
			<div class="span3 home_calendar">
				<div class="form-horizontal">
					<div class="control-group">
						<label class="control-label pull-left" for="inputEmail">Depart</label>
						<div class="controls">
							<input type="text" value="" class="span2 check-out-date"
								value="2012/11/22" />
						</div>
					</div>
				</div>
				<div class="datepicker_to"></div>
			</div>

			<div class="span3">
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
						<label class="control-label" for="inputEmail">Adults per
							room</label>
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
					<div class="control-group">
						<label class="control-label" for="inputEmail">Amenities</label>
						<div class="controls" style="margin-left: 122px;">
							<select class="span1 select_kids" style="width: 125px;">
								<option>Smoking</option>
								<option>Non-Smoking</option>
							</select>
						</div>
					</div>

				</div>
				<div id="total_price" class="price">128.00 GBP</div>
				<a class="btn btn-primary btn-large book-now" href="book">Book
					now!</a>
			</div>
		</div>
	</form>
	<hr />
	<div class="row-fluid">

		<div class="span3">
			<h3>
				<span>R</span>ooms
			</h3>
			<a href="rooms"><img src="web-resources/css/images/rooms.jpg"
				alt="" /></a>
			<p>View our range of availiable rooms and options</p>
		</div>
		<div class="span3">
			<h3>
				<span>S</span>ervices
			</h3>
			<a href="facilities"><img
				src="web-resources/css/images/services.png" alt="" /></a>
			<p>We have a gym, swimming pool, golf course, and much more</p>
		</div>
		<div class="span3">
			<h3>
				<span>P</span>romotions
			</h3>
			<a href="promotions"><img
				src="web-resources/css/images/promotions.png" alt="" /></a>
			<p>
				Stay five nights and get one night totally <b>FREE</b>!
			</p>
		</div>
		<div class="span3">
			<h3>
				<span>L</span>ocation
			</h3>
			<a href="map"><img src="web-resources/css/images/location.jpg"
				alt="" /></a>
			<p>We're easily accessible - go anywhere quickly.</p>
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
	<div></div>
	<!-- /container -->

	<jsp:include page="footer.jsp" />

	<script src="../../../maps.google.com/maps/api/js?sensor=false"
		type="text/javascript"></script>
	<script type="text/javascript" src="web-resources/js/Scripts/jquery.js"></script>
	<script type="text/javascript"
		src="web-resources/js/Scripts/jquery-ui.js"></script>
	<script type="text/javascript"
		src="web-resources/js/Scriptsbootstrap.js"></script>
	<script type="text/javascript"
		src="web-resources/js/Scripts/jquery.nivo.slider.js"></script>
	<script type="text/javascript"
		src="web-resources/js/Scripts/socialcount.min.js"></script>
	<script src="web-resources/js/Scripts/jquery.quicksand.js"
		type="text/javascript"></script>

	<script type="text/javascript" src="web-resources/js/Scripts/global.js"></script>
</body>
</html>
