<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>
<title>Page Title</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<style>
body {
	padding: 80px;
}
</style>
<script>
	$(document).ready(function() {
		$("#dialog1").hide();
		$("#dialog2").hide();
		$("#dialog3").hide();
		$("#dialog4").hide();
	});
	function btnClick1() {
		$("#dialog1").show();
		$("#dialog2").hide();
		$("#dialog3").hide();
		$("#dialog4").hide();
	}
	function btnClick2() {
		$("#dialog2").show();
		$("#dialog1").hide();
		$("#dialog3").hide();
		$("#dialog4").hide();
	}
	function btnClick3() {
		$("#dialog3").show();
		$("#dialog2").hide();
		$("#dialog1").hide();
		$("#dialog4").hide();
	}
	function btnClick4() {
		$("#dialog4").show();
		$("#dialog2").hide();
		$("#dialog3").hide();
		$("#dialog1").hide();
	}
</script>
</head>
<body>

	<button id="guestListButton" onclick="btnClick1();">List
		Guests</button>
	<button id="paymentListButton" onclick="btnClick2();">List
		Payments</button>
	<button id="checkAvailableRoomsButton" onclick="btnClick3();">Check
		Available Rooms</button>
	<button id="checkBookedRoomsButton" onclick="btnClick4();">
		Check Booked Rooms</button>
	<div id="dialog1" class="web_dialog"
		style="width: 100%; padding-top: 40px;">
		<!-- <table style="width: 100%; border: 0px;" cellpadding="3"> <td>${guestData.guest_id}</td>-->
		<table class="table" border="1" style="width: 100%">
			<tr>
				<th>Guest ID</th>
				<th>Guest First Name</th>
				<th>Guest Last Name</th>
				<th>Guest Address</th>
				<th>Guest Email</th>
				<th>Guest Phone</th>
				<th>Guest City</th>
				<th>Guest Country</th>
				<th>Guest DL</th>
			</tr>
			<tbody>
				<c:forEach items="${guests}" var="guestData">
					<tr>
						<td>${guestData.guest_id}</td>
						<td>${guestData.first_name}</td>
						<td>${guestData.last_name}</td>
						<td>${guestData.address}</td>
						<td>${guestData.email}</td>
						<td>${guestData.phone}</td>
						<td>${guestData.city}</td>
						<td>${guestData.country}</td>
						<td>${guestData.driver_license}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div id="dialog2" class="web_dialog"
		style="width: 100%; padding-top: 40px;">
		<!-- <table style="width: 100%; border: 0px;" cellpadding="3"> -->
		<table class="table" border="1" style="width: 100%">
			<tr>
				<th>Payment ID</th>
				<th>Reservation ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Base Pay</th>
				<th>Discounts</th>
				<th>Total Rooms</th>
				<th>Total Amount</th>
				<th>Guest ID</th>
			</tr>
			<tbody>
				<c:forEach items="${paymentList}" var="paymentData">
					<tr>
						<td>${paymentData.payment_id}</td>
						<td>${paymentData.reservation}</td>
						<td>${paymentData.first_name}</td>
						<td>${paymentData.last_name}</td>
						<td>${paymentData.base}</td>
						<td>${paymentData.discount}</td>
						<td>${paymentData.rooms}</td>
						<td>${paymentData.total_payment}</td>
						<td>${paymentData.guest}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div id="dialog3" class="web_dialog"
		style="width: 100%; padding-top: 40px;">
		<!-- <table style="width: 100%; border: 0px;" cellpadding="3"> -->
		<table class="table" border="1" style="width: 100%">
			<tr>
				<th>Room ID</th>
				<th>Room Amenity Type Id</th>
				<th>Other Room type</th>
				<th>Status</th>
			</tr>
			<tbody>
				<c:forEach items="${roomAvalibleList}" var="roomAvblData">
					<tr>
						<td>${roomAvblData.id}</td>
						<td>${roomAvblData.roomTypeId == '1' ? "1 Queen Bed":"2 King Beds"}</td>
						<td>${roomAvblData.otherTypeId == '1' ? "Smoking":"Non Smoking"}</td>
						<td>${roomAvblData.statusId == '1' ? "Available":"N/A"}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div id="dialog4" class="web_dialog"
		style="width: 100%; padding-top: 40px;">
		<!-- <table style="width: 100%; border: 0px;" cellpadding="3"> -->
		<table class="table" border="1" style="width: 100%">
			<tr>
				<th>Room ID</th>
				<th>Room Amenity Type Id</th>
				<th>Other Room type</th>
				<th>Status</th>
			</tr>
			<tbody>
				<c:forEach items="${roomNotAvalibleList}" var="roomNOTAvblData">
					<tr>
						<td>${roomNOTAvblData.id}</td>
						<td>${roomNOTAvblData.roomTypeId  == '1' ? "1 Queen Bed":"2 King Beds"}</td>
						<td>${roomNOTAvblData.otherTypeId == '1' ? "Smoking":"Non Smoking"}</td>
						<td>${roomNOTAvblData.statusId == '2' ? "Booked":"N/A"}</td>


					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script>
	function listGuestPost() {
		console.log("listPost");
		$.ajax({
			type : 'GET',
			url : "guests",
			contentType : 'application/json; charset=utf-8',
			//data : JSON.stringify(localStorage),
			//dataType : "json",
			success : function(result) {
			}
		});
	}
	function availablePost() {
		console.log("availablePost");
		$.ajax({
			type : 'GET',
			url : "	/avaliable",
			contentType : 'application/json; charset=utf-8',
			//data : JSON.stringify(localStorage),
			//dataType : "json",
			success : function(result) {
			}
		});
	}
	function bookedPost() {
		console.log("bookedPost");
		$.ajax({
			type : 'GET',
			url : "rooms/unavaliable",
			contentType : 'application/json; charset=utf-8',
			//data : JSON.stringify(localStorage),
			//dataType : "json",
			success : function(result) {
			}
		});
	}
	function listPaymentPost() {
		console.log("listPaymentPost");
		$.ajax({
			type : 'GET',
			url : "rooms/payments",
			contentType : 'application/json; charset=utf-8',
			//data : JSON.stringify(localStorage),
			//dataType : "json",
			success : function(result) {
			}
		});
	}
</script>
</html>
