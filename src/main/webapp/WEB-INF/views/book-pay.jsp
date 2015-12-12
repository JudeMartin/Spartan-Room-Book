<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Pay</title>
<jsp:include page="includes/header.jsp" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
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
			<div class="row book-pay">
				<div class="span12">
					<br /> <br />
					<h1>Review your selection</h1>
					<br />

					<div class="row">
						<div class="span12">
							<div class="row">

								<div class="span6">
									<h3>
										<span>Your</span> chosen rooms
									</h3>

									<div class="pull-left strong">Room type</div>
									<div class="pull-right ">Classic Room</div>
									<br />
									<div class="pull-left strong">Arrival date</div>
									<div class="pull-right">Thu 10, January 2013</div>
									<br />
									<div class="pull-left strong">Departure date</div>
									<div class="pull-right">Fri 11, January 2013</div>
									<br />
									<div class="pull-left strong">Duration</div>
									<div class="pull-right">1 night,1 room</div>
									<br /> <br />

									<div class="pull-left strong">Guests</div>
									<div class="pull-right">2 adults and 1 child</div>
									<br />
								</div>

								<div class="span3 pull-right">
									<p>Base price</p>
									<span class="price" id="base_price">$ 100</span>
								</div>

							</div>

						</div>
					</div>
					<br />
					<hr />

					<div class="row">
						<div class="span12">

							<div class="row">

								<div class="span7">
									<h3>
										<span>Customize</span> your stay
									</h3>
									<div class="row">
										<div class="span3">
											<div class="custom_container">
												<div class="pull-left strong">Breakfast Buffet</div>
												<div class="pull-right">
													<input type="checkbox" checked="checked" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Wi-Fi</div>
												<div class="pull-right">
													<input type="checkbox" checked="checked" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Non-smoking</div>
												<div class="pull-right">
													<input type="checkbox" checked="checked" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Newspaper</div>
												<div class="pull-right">
													<input type="checkbox" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Luggage storage</div>
												<div class="pull-right">
													<input type="checkbox" />
												</div>
											</div>
										</div>
										<div class="span3 offset1">
											<div class="custom_container">
												<div class="pull-left strong">Parking</div>
												<div class="pull-right">
													<input type="checkbox" checked="checked" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Limo service</div>
												<div class="pull-right">
													<input type="checkbox" checked="checked" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Air conditioning</div>
												<div class="pull-right">
													<input type="checkbox" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Hair dryer</div>
												<div class="pull-right">
													<input type="checkbox" />
												</div>
											</div>
											<div class="custom_container">
												<div class="pull-left strong">Sea view</div>
												<div class="pull-right">
													<input type="checkbox" />
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="span3 pull-right">
									<p>Extras</p>
									<span class="price" id="extras_price">0.00 GBP</span>
								</div>
							</div>

						</div>
					</div>
					<br />
					<hr />

					<div class="row">
						<div class="span12">

							<div class="row">
								<div class="span8">
									<h3>
										<span>Payment</span> information
									</h3>

									<!-- 	<form class="form-horizontal" id="form1" action="/bill/saveData"  method="post"> -->
									<div class="control-group">
										<label for="inputWarning" class="control-label pay strong">Card
											Type</label>
										<div class="controls">
											<select class="span4"><option value="0">Select</option>
												<option value="VISA">Visa</option>
												<option value="Master">MasterCard</option>
												<option value="Diners">DinersClub</option>
												<option value="AMEX">AmEx</option>
											</select>
										</div>
									</div>
									<div class="control-group">
										<label for="inputError" class="control-label pay strong">Card
											Number</label>
										<div class="controls">
											<input type="text" class="span3"> <strong>CVV</strong>
											<input type="text" class="span1 cvv2" placeholder="">
										</div>
									</div>
									<div class="control-group">
										<label for="inputInfo" class="control-label pay strong">Expiration
											Date</label>
										<div class="controls">
											<select class="span2 month_picker"><option value="0">Month</option>
												<option value="1">January</option>
												<option value="2">February</option>
												<option value="3">March</option>
												<option value="4">April</option>
												<option value="5">May</option>
												<option value="6">June</option>
												<option value="7">July</option>
												<option value="8">August</option>
												<option value="9">September</option>
												<option value="10">October</option>
												<option value="11">November</option>
												<option value="12">December</option></select> <select
												class="span2 year_picker"><option value="0">Year</option>
												<option value="2013">2013</option>
												<option value="2014">2014</option>
												<option value="2015">2015</option>
												<option value="2016">2016</option>
												<option value="2017">2017</option>
												<option value="2018">2018</option>
												<option value="2019">2019</option>
												<option value="2020">2020</option>
												<option value="2021">2021</option>
												<option value="2022">2022</option>
												<option value="2023">2023</option></select>
										</div>
									</div>
									<div class="control-group">
										<label for="inputSuccess" class="control-label pay strong">Cardholder
											full name</label>
										<div class="controls">
											<input type="text" class="span4 card_holder">
										</div>
									</div>
									<!-- </form> -->
								</div>


								<div class="span3 pull-right">
									<p>
										<strong>Total price</strong>
									</p>
									<span class="price strong" id="total_price">$ 100.00 </span>
								</div>

								<div class="span12">
									<a href="Thankyou">
										<button class="btn btn-primary btn-large book-now pull-right"
											onclick="postData();">Submit payment</button>
									</a>> <br /> <br />
								</div>

							</div>
							<br />

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		$(document).ready(

		function() {

			var base_price = localStorage.getItem("base_price");
			var edited_base_price = base_price.slice(1);
			$('#base_price').html("$ " + edited_base_price);
		});

		$(document).ready(
				function() {
					$(":checkbox").change(
							function() {
								console.log("Changed");
								var extras = $('input:checked').length;
								var extras_price = (extras * 15);

								var total_price = base_price + extras_price;

								localStorage.setItem("extras_price",
										extras_price);
								var base_priceValue = JSON
										.stringify(localStorage
												.getItem("base_price"));

								var b = base_priceValue.slice(1,
										base_priceValue.length);
								var total_price = b + extras_price;
								$('#extras_price').html(
										"$ " + extras_price.toFixed(2));
							});
				});

		function postData() {

			//console.log(JSON.stringify(localStorage));
			$.ajax({
				type : 'POST',
				url : "bill/saveData",
				contentType : 'application/json; charset=utf-8',
				data : JSON.stringify(localStorage),
				dataType : "json",
				success : function(result) {
				}
			});
			localStrorage.clear();
		}
	</script>
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/scripts.jsp" />
</body>
</html>