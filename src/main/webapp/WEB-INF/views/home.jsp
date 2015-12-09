<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="actionUrl" value="book" />

<!DOCTYPE html>
<html lang="en">
<head>
<!-- meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8"-->
<title>Home</title>
<!-- script type="text/javascript"
	src='https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js'></script-->

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
								<li class="active"><a href="home">Home</a></li>
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
						start <span>Booking your room</span><br> select your dates
						and options below
					</h2>
				</div>
			</div>
			<form method="POST" action="${actionUrl}" class="form-inline"
				id="form1">
				<div class="row-fluid home">
					<div class="span3">
						<div class="room_selector" data-type="1" data-price="100"
							data-adults="1" data-kids="1">
							<h5>
								<a href="home" class="pull-left"><i
									class="icon-chevron-left"></i></a>Queen Sized room<a href="home"
									class="pull-right "><i class="icon-chevron-right"></i></a>
							</h5>
							<a href="listings.html"><img
								src="web-resources/css/images/rooms/single_room.jpg" alt="" /></a>
							<p>All queen sized rooms have one single queen sized bed and
								sleeps one adult. A 25-inch TV is included.</p>
						</div>
						<div class="room_selector" data-type="2" data-price="200"
							data-adults="2" data-kids="1" style="display: none;">
							<h5>
								<a href="home" class="pull-left "><i
									class="icon-chevron-left"></i></a>King Sized Room<a href="home"
									class="pull-right "><i class="icon-chevron-right"></i></a>
							</h5>
							<a href="listings.html"><img
								src="web-resources/css/images/rooms/double_room.jpg" alt="" /></a>
							<p>All king sized rooms have a single king sized bed and
								sleeps two adults & a kid.A 50-inch TV is included</p>
						</div>
						<div class="room_selector" data-type="3" data-price="300"
							data-adults="3" data-kids="2" style="display: none;">
							<h5>
								<a href="home" class="pull-left "><i
									class="icon-chevron-left"></i></a>Triple Room<a href="home"
									class="pull-right "><i class="icon-chevron-right"></i></a>
							</h5>
							<a href="listings.html"><img
								src="web-resources/css/images/rooms/triple_room.jpg" alt="" /></a>
							<p>All triple rooms have one double bed and a single bed and
								sleeps up to three people.</p>
						</div>
						<div class="room_selector" data-type="4" data-price="400"
							data-adults="4" data-kids="3" style="display: none;">
							<h5>
								<a href="home" class="pull-left "><i
									class="icon-chevron-left"></i></a>Luxury Room<a href="home"
									class="pull-right "><i class="icon-chevron-right"></i></a>
							</h5>
							<a href="listings.html"><img
								src="web-resources/css/images/rooms/luxury_room.jpg" alt="" /></a>
							<p>All rooms have two double beds and a balcony. Sleeps up to
								four adults.</p>
						</div>
						<div class="room_selector" data-type="5" data-price="500"
							data-adults="4" data-kids="3" style="display: none;">
							<h5>
								<a href="home" class="pull-left "><i
									class="icon-chevron-left"></i></a>Private pool room<a href="home"
									class="pull-right "><i class="icon-chevron-right"></i></a>
							</h5>
							<a href="listings.html"><img
								src="web-resources/css/images/rooms/private_pool.jpg" alt="" /></a>
							<p>A private pool, two double beds and a sea view. Sleeps up
								to four adults.</p>
						</div>
						<div class="room_selector" data-type="6" data-price="600"
							data-adults="5" data-kids="4" style="display: none;">
							<h5>
								<a href="home" class="pull-left "><i
									class="icon-chevron-left"></i></a>Private villa<a href="home"
									class="pull-right "><i class="icon-chevron-right"></i></a>
							</h5>
							<a href="listings.html"><img
								src="web-resources/css/images/rooms/private_villa.jpg" alt="" /></a>
							<p>All villas have an en-suite bathroom and sundeck. Sleeps
								up to five adults.</p>
						</div>
					</div>
					<div class="span3 home_calendar">
						<div class="form-horizontal">
							<div class="control-group">
								<label class="control-label pull-left" for="inputEmail">Arrive</label>
								<div class="controls">
									<input name="checkInDate" type="datetime"
										class="span2 check-in-date" value="" />
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
									<input type="datetime" name="checkOutDate" value=""
										class="span2 check-out-date" />
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
									<select class="span1 select_rooms" name="rooms">
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</select>
								</div>
							</div>


							<div class="control-group">
								<label class="control-label" for="inputEmail">Adults per
									room</label>
								<div class="controls">
									<select name="adults" class="span1 select_adults">
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</select>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inputEmail">Kids per
									room</label>
								<div class="controls">
									<select name="children" class="span1 select_kids">
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</select>
								</div>
							</div>



						</div>
						<div id="total_price" class="price">128.00 $</div>
						<input type="submit" value="Check availability"
							class="btn btn-primary btn-large book-now" id="checkAvail" /> <input
							name="roomId" id="roomId" type="hidden" value="" /> <input
							name="roomType" id="roomType" type="hidden" value="" /> <input
							name="totalPrice" id="totalPrice" type="hidden" value="" />

						<div class="roomAvailable" id="roomAvailable" style="visibility: hidden">
							<input path="id" type="hidden" /> <input
								class="btn btn-primary btn-large book-now" type="submit"
								value="Book a room !!" />
							<p>Room is available!! Please book</p>
						</div>
						<div class="roomNotAvailable" id="roomNotAvailable" style="visibility: hidden">
							<p>Room not available!! Please try other options</p>
						</div>



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
		</div>
	</div>
	<!-- /container -->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/scripts.jsp" />
	<script type="text/javascript">
		//var jq = jQuery.noConflict();
	</script>

	<script type="text/javascript">
		$(document).ready(function() {
			$("#checkAvail").click(function(event) {
				console.log("checkAvail");
				$.ajax({
					type : 'GET',
					url : "book/availability",
					context : document.body,
					data : $("#form1").serialize(),
					async : true,
					dataType: "json",
					success : function(result) {
						var res = result;
						var roomId = result["result"];
						if (roomId > 0) {
							console.log("At " + JSON.stringify(result));
							document.getElementById("roomAvailable").style.visibility = "visible";
							document.getElementById("roomNotAvailable").style.visibility = "hidden";
							
							//jq(".roomAvailable").css("visibility", "visible");
							//jq(".roomNotAvailable").css("visibility", "hidden");
							//setting the value of the room id which is available for booking and 
							//assigned to the user by default based on his selection criteria
							document.getElementById('roomId').value = roomId;
						} else {
							//throw new Error("not available");
							//jq(".roomAvailable").css("visibility", "hidden");
							//jq(".roomNotAvailable").css("visibility", "visible");
							document.getElementById("roomNotAvailable").style.visibility = "visible";
							document.getElementById("roomAvailable").style.visibility = "hidden";
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						//jq(".roomAvailable").css("visibility", "hidden");
						//jq(".roomNotAvailable").css("visibility", "visible");
						//console.log(jqXHR.status + " " + jqXHR.responseText);
						document.getElementById("roomNotAvailable").style.visibility = "visible";
						document.getElementById("roomAvailable").style.visibility = "hidden";
					}
				});
				event.preventDefault();
			});
		});
	</script>
</body>
</html>
