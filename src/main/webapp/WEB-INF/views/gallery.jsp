<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="header.jsp" />
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
						<li class="active"><a href="gallery">Gallery</a></li>
						<li class=""><a href="map">Map</a></li>
						<li class=""><a href="book-start">Book</a></li>
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
	</div>
	</div>
	<!-- /container -->
	<jsp:include page="footer.jsp" />
<jsp:include page="includes/scripts.jsp" />
</body>
</html>