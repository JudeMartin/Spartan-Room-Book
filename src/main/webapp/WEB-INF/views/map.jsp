
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en"><head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Hotel - Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	

	<link rel="stylesheet" href="web-resources/css/bootstrap/css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="web-resources/css/bootstrap/css/bootstrap-responsive.min.css" type="text/css">
	<link rel="stylesheet" href="web-resources/css/hotel.css" type="text/css">
	<link rel="stylesheet" href="web-resources/css/hotel-responsive.css" type="text/css">

		<link rel="stylesheet" href="web-resources/js/slider/default.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="web-resources/css/nivo-slider.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="web-resources/css/socialcount-with-icons.css" type="text/css" media="screen" />
	
	<style>
		div.ui-datepicker{
			font-size:11px;
		}
	</style>
		
    <!--[if lt IE 9]>
		<link rel="stylesheet" href="css/bootstrap_ie7.css" type="text/css">
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	
</head>

<body>
	
		<div class="container-fluid">
			<div class="row"><!-- start header -->
				<div class="span5 logo">
					<a href="index.html">
					<div class="row">
						<div class="span3 logo">
							<h1>Bootstrap<span>Hotel</span></h1>
							<p>&#9733;&#9733;&#9733;&#9733;&#9734;</p>
						</div>
					</div>
					</a>
				</div>		
				<div class="span6 pull-right main_menu">
					<div class="navbar">
						<div class="container">
							 <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</a>

							<div class="nav-collapse">
								<ul class="nav nav-pills">
									<li class=""><a href="home">Home</a></li>
									<li class=""><a href="rooms">Rooms</a></li>
									<li class=""><a href="facilities">Facilities</a></li>
									<li class=""><a href="gallery">Gallery</a></li>
									<li class="active"><a href="map">Map</a></li>
									<li class=""><a href="book-start">Book</a></li>
								</ul>
							</div><!-- /.nav-collapse -->
						</div>
					</div><!-- /navbar -->
				</div>
			</div><!-- end header --><div class="row">
	<div class="span12">	
   <br /><br /><h1>Map and local attractions</h1><br />
 </div>
 <div class="span3 sidebar">

  
  <ul class="nav">
    <li><a class="active" href="map.html"><span>Area</span> Overview</a></li>
    <li><a href="general.html"><span>Popular</span> attractions</a></li>
    <li><a href="general.html"><span>services</span> and facilities</a></li>
    <li><a href="general.html"><span>nearby</span> shops</a></li>
    <li><a href="general.html"><span>food &amp;</span> drink</a></li>
    <li><a href="typography.html"><span>How to </span>get here</a></li>
  </ul>	
  <br />
  <form class="form-inline mini">
    <div class="row">
      <div class="span3">
        <h4>When would you like to stay with us?</h4>

        <div class="row">
          <div class="span3">               
            <div class="control-group">
              <label for="focusedInput" class="control-label">Arrive</label>
              <div class="controls">
                <input type="text" class="span3 global-datepicker-from check-in-date" value="11/01/2013"/> 
                <a href="map.html#" id="global-datepicker-from"><i class="icon-calendar"></i></a>
              </div>
            </div>
          </div>

          <div class="span3 "> 
           <div class="control-group">
            <label for="focusedInput" class="control-label">Depart</label>
            <div class="controls">
              <input type="text" class="span3 global-datepicker-to check-out-date" value="12/01/2013"/>
              <a href="map.html#" id="global-datepicker-to"><i class="icon-calendar"></i></a>
            </div>
          </div>    
        </div>    
      </div>  

      <a class="btn btn-primary btn-large book-now" href="book-start.html">Check availability</a>

      
    </div>
  </div>

</form><br />
</div>

<div class="span9">	
  <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vitae hendrerit odio. Nam sit amet mi pretium nulla cursus euismod. Pellentesque non nisl quis erat blandit egestas. Fusce tincidunt feugiat posuere. Quisque auctor gravida tortor a hendrerit. Sed id justo urna, sit amet pretium eros. Duis eleifend, urna eget pulvinar laoreet, lacus turpis convallis massa, eget pharetra ante urna accumsan nisl. Ut nec tortor ante, sed dictum urna. In cursus orci sit amet ligula scelerisque vitae iaculis lacus tempus. Nunc pretium tortor vestibulum diam consectetur blandit. Duis at bibendum elit. Donec luctus sem vel erat aliquet tincidunt. </p>

  <div id="map_canvas"></div>


  <div class="row">
   <div class="span4">
    <h3>
      Arts &amp; Culture
    </h3>
    <ul>
      <li>Colosseum/Il Colosseo <small>6.4 km/4.0 miles</small>
      </li>
      <li>Navona Square/Piazza Navona 6.4 km/4.0 miles
      </li>
      <li>Trevi Fountain/Fontana di Trevi 6.4 km/4.0 miles
      </li>
      <li>Capitoline Museums 6.4 km/4.0 miles
      </li>
      <li>Pantheon 6.4 km/4.0 miles
      </li>
      <li>Etruscan Museum 8.0 km/5.0 miles
      </li>
      <li>Gallery of Modern Art 8.0 km/5.0 miles
      </li>
      <li>Spanish Steps/Piazza di Spagna 8.0 km/5.0 miles
      </li>
      <li>Galleria Borghese Museum 8.0 km/5.0 miles
      </li>
      <li>Castel Saint Angelo (Hadrian's Mausoleum) 8.0 km/5.0 miles
      </li>
      <li>Palazzo Al Temps Museum 8.1 km/5.0 miles
      </li>
      <li>Palazzo Massimo Museum 8.1 km/5.0 miles
      </li>
      <li>Vatican Museums 8.1 km/5.0 miles
      </li>
      <li>Tivoli (Roman Villas) 51.0 km/31.7 miles
      </li>
    </ul>
  </div>
  <div class="span4 offset1">
    
    <h3>
      Golf
    </h3>
    <ul>
      <li>Golf Club Parco De' Medici 3.2 km/2.0 miles
      </li>
    </ul>
    <h3>
      Government Offices
    </h3>
    <ul>
      <li>French Embassy 6.0 km/3.7 miles
      </li>
      <li>Embassy of the United States of America 8.0 km/5.0 miles
      </li>
      <li>British Embassy 8.0 km/5.0 miles
      </li>
      <li>Japanese Embassy 8.0 km/5.0 miles
      </li>
      <li>Australian Embassy 10.0 km/6.2 miles
      </li>
      <li>Canadian Embassy 10.0 km/6.2 miles
      </li>
      <li>German Embassy 12.0 km/7.5 miles
      </li>
    </ul>
    <h3>
      Local Attractions
    </h3>
    <ul>
      <li>Trastevere 4.8 km/3.0 miles
      </li>
      <li>Sistine Chapel 6.4 km/4.0 miles
      </li>
      <li>Civita Vecchia 71.0 km/44.1 miles
      </li>
    </ul>
  </div>

</div>
<br /><br />




</div>

</div></div> <!-- /container -->

<footer>
	<div class="container">
	<div class="row footer_section_pre">

	<div class="span4">
		<h4>Bootstrap Hotel<span class="line"></span></h4>

		<p>2247 Copperhead Road, Hartford, CT 06103</p>
		<p>Tel: +860-631-7795<br />Fax: +860-631-7796  <br />Email: admin@appsarea.com  </p>

		<ul data-facebook-action="recommend" data-url="#" class="socialcount socialcount-small recommend grade-a">
			<li class="facebook"><a title="Share on Facebook" href="https://www.facebook.com/sharer/sharer.php?u=#"><span class="social-icon icon-facebook"></span><span class="count"></span></a></li>
			<li class="twitter"><a title="Share on Twitter" href="https://twitter.com/intent/tweet?text=#"><span class="social-icon icon-twitter"></span><span class="count"></span></a></li>
			<li class="googleplus"><a title="Share on Google Plus" href="https://plus.appsarea.com/share?url=#"><span class="social-icon icon-googleplus"></span><span class="count"></span></a></li>
		</ul>
		<br />
		<p class="copy">All content &copy; 2013 <a href="http://appsarea.com/">AppsArea</a></p>

	</div>
	<div class="span4">
		<h4>Special offers<span class="line"></span></h4>
		<p><b>FREE</b> Breakfast, <b>FREE</b> Internet, <b>FREE</b> Tour = Savings!</p>
		<p>Stay five nights and get one night totally <b>FREE</b>!</p>
		<p>Save up to <b>20% OFF</b> our Best Available Rate by booking with us in advance.</p>
	</div>
	<div class="span4">
		<h4>Sponsors<span class="line"></span></h4>
		    <ul class="thumbnails">
				<li class="span2">
					<div class="thumbnail">
						<img src="web-resources/css/images/airlines/virgin4.gif" alt="">
					</div>
				</li>				
				<li class="span2">
					<div class="thumbnail">
						<img src="web-resources/css/images/airlines/ba2.gif" alt="">
					</div>
				</li>				
				<li class="span2">
					<div class="thumbnail">
						<img src="web-resources/css/images/airlines/delta3.gif" alt="">
					</div>
				</li>										
				<li class="span2">
					<div class="thumbnail">
						<img src="web-resources/css/images/airlines/ac_white.jpg" alt="">
					</div>
				</li>
				

			</ul>
	</div>
	</div>
	
	</div>
	
	
</footer>

	<script src="../../../maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="web-resources/js/Scripts/jquery.js"></script>
	<script type="text/javascript" src="web-resources/js/Scripts/jquery-ui.js"></script>
	<script type="text/javascript" src="web-resources/js/Scripts/bootstrap.js"></script>
	<script type="text/javascript" src="web-resources/js/Scripts/jquery.nivo.slider.js"></script>
	<script type="text/javascript" src="web-resources/js/Scripts/socialcount.min.js"></script>
	<script src="web-resources/js/jquery.quicksand.js" type="text/javascript"></script>

	<script type="text/javascript" src="web-resources/js/Scripts/global.js"></script>
</body>
</html>