<!DOCTYPE html>
<html>
<head>
<title>Page Title</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js">
	
</script>
</head>
<body>
	<h1>This is a Heading</h1>
	<p>This is a paragraph.</p>
	<button id="guestListButton" onclick="listGuestPost();">List
		Guests</button>
	<button id="paymentListButton" onclick="listPaymentPost();">List
		Payments</button>
	<button id="checkAvailableRoomsButton" onclick="availablePost();">Check
		Available Rooms</button>
	<button id="checkBookedRoomsButton" onclick="bookedPost();">Check
		Booked Rooms</button>

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
