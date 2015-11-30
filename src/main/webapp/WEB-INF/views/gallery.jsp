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
	<div class="row">
		<div class="span12">
			<br /> <br />
			<h1>The gallery</h1>
			<br />
		</div>

		<div class="span12">
			<div class="row">
				<div class="span6 offset3">
					<ul class="nav nav-pills gallery-pills" id="gallery_links">
						<li><a href="gallery.html#all" data-id="all">All</a></li>
						<li><a href="gallery.html#resort" data-id="resort">The
								resort</a></li>
						<li><a href="gallery.html#rooms" data-id="rooms">Rooms</a></li>
						<li><a href="gallery.html#dining" data-id="dining">Dining</a></li>
						<li><a href="gallery.html#attractions" data-id="attractions">Attractions</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="span12">
			<ul class="thumbnails" id="gallery">
				<li class="span4 aa-resort" data-id="resort0" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_1.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort1" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_2.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort2" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_3.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort3" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_4.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort4" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_5.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort5" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_6.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort6" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_7.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-resort" data-id="resort7" data-type="resort">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/resort_8.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-rooms" data-id="rooms0" data-type="rooms">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/rooms_1.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-rooms" data-id="rooms1" data-type="rooms">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/rooms_2.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-rooms" data-id="rooms2" data-type="rooms">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/rooms_3.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-rooms" data-id="rooms3" data-type="rooms">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/rooms_4.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-rooms" data-id="rooms4" data-type="rooms">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/rooms_5.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-dining" data-id="dining0" data-type="dining">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/dining_1.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-dining" data-id="dining1" data-type="dining">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/dining_2.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-dining" data-id="dining2" data-type="dining">
					<a href="gallery.html#" class="thumbnail"> <img
						src="web-resources/css/images/gallery/dining_3.jpg" alt="">
				</a>
				</li>
				<li class="span4 aa-attractions" data-id="attractions0"
					data-type="attractions"><a href="gallery.html#"
					class="thumbnail"> <img
						src="web-resources/css/images/gallery/attractions_1.jpg" alt="">
				</a></li>
				<li class="span4 aa-attractions" data-id="attractions1"
					data-type="attractions"><a href="gallery.html#"
					class="thumbnail"> <img
						src="web-resources/css/images/gallery/attractions_2.jpg" alt="">
				</a></li>
				<li class="span4 aa-attractions" data-id="attractions2"
					data-type="attractions"><a href="gallery.html#"
					class="thumbnail"> <img
						src="web-resources/css/images/gallery/attractions_3.jpg" alt="">
				</a></li>
				<li class="span4 aa-attractions" data-id="attractions3"
					data-type="attractions"><a href="gallery.html#"
					class="thumbnail"> <img
						src="web-resources/css/images/gallery/attractions_4.jpg" alt="">
				</a></li>
				<li class="span4 aa-attractions" data-id="attractions4"
					data-type="attractions"><a href="gallery.html#"
					class="thumbnail"> <img
						src="web-resources/css/images/gallery/attractions_5.jpg" alt="">
				</a></li>
			</ul>
		</div>

	</div>
	<div></div>
	<!-- /container -->
	<jsp:include page="footer.jsp" />
	<script src="../../../maps.google.com/maps/api/js?sensor=false"
		type="text/javascript"></script>
	<script type="text/javascript"
		src="web-resources/css/Scripts/jquery.js"></script>
	<script type="text/javascript"
		src="web-resources/css/Scripts/jquery-ui.js"></script>
	<script type="text/javascript"
		src="web-resources/css/Scripts/bootstrap.js"></script>
	<script type="text/javascript"
		src="web-resources/css/Scripts/jquery.nivo.slider.js"></script>
	<script type="text/javascript"
		src="web-resources/css/Scripts/socialcount.min.js"></script>
	<script src="web-resources/css/Scripts/jquery.quicksand.js"
		type="text/javascript"></script>

	<script type="text/javascript"
		src="web-resources/css/Scripts/global.js"></script>
</body>
</html>