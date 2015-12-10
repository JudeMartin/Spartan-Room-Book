<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="actionUrl" value="/bookpay" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Book</title>
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
			<div class="row booking_summary">

				<div class="span12">

					<div class="row">
						<div class="span9">
							<form class="form-horizontal" action="${actionUrl}" method="POST"
								id="form2">

								<fieldset>
									<br /> <br />
									<h1>
										Guest information <br /> <small>Fill out the form to
											complete your reservation. </small>
									</h1>
									<br />
									<div class="row">

										<div class="span8">
											<legend>
												<span>Your</span> name
											</legend>
										</div>

										<div class="span3">
											<label> <select>
													<option>Mr.</option>
													<option>Mrs.</option>
													<option>Miss.</option>
											</select>
											</label>
										</div>

										<div class="span3">
											<label> <input name="first_name" type="text"
												placeholder="First Name..." class="stored">
											</label>
										</div>

										<div class="span3">
											<label> <input name="last_name" type="text"
												placeholder="Last Name..." id="last_name" class="stored">
											</label>
										</div>

									</div>
									<br />
									<div class="row">
										<div class="span8">
											<legend>
												<span>Your</span> contact details
											</legend>
										</div>
										<div class="span3">
											<label>Email address <input name="email" type="email">
											</label>
										</div>

										<div class="span3">
											<label>Email address confirmation <input type="email"
												class="stored" id="email" name="email">
											</label>
										</div>

										<div class="span3">
											<label>Telephone number <input name="phone"
												id="phone" class="stored" type="text"
												placeholder="(+##)-###-###-####">
											</label>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="span8">
											<legend>
												<span>Your</span> address
											</legend>
										</div>

										<div class="span3">
											<label>Address <input type="text" name="address"
												class="stored" id="address" />
											</label> <label>ZIP/Postal <input name="zip" type="text"
												id="zip" class="stored">
											</label>
										</div>

										<div class="span3">
											<label>City <input type="text" class="stored"
												id="city" name="city">
											</label>
											<label>State/Province <input type="text" id="state"
												name="state" class="stored">
											</label>
										</div>

										<div class="span3">
											</label> <label>Country <select name="country" id="country"
												name="country" class="stored">
													<option value="null">Select</option>
													<option value="US">United States</option>
													<option value="AD">Andorra</option>
													<option value="AE">United Arab Emirates</option>
													<option value="AF">Afghanistan</option>
													<option value="AG">Antigua and Barbuda</option>
													<option value="AI">Anguilla</option>
													<option value="AL">Albania</option>
													<option value="AM">Armenia</option>
													<option value="AN">Netherlands Antilles</option>
													<option value="AO">Angola</option>
													<option value="AQ">Antarctica</option>
													<option value="AR">Argentina</option>
													<option value="AS">American Samoa</option>
													<option value="AT">Austria</option>
													<option value="AU">Australia</option>
													<option value="AW">Aruba</option>
													<option value="AX">Åland Islands</option>
													<option value="AZ">Azerbaijan</option>
													<option value="BA">Bosnia and Herzegovina</option>
													<option value="BB">Barbados</option>
													<option value="BD">Bangladesh</option>
													<option value="BE">Belgium</option>
													<option value="BF">Burkina Faso</option>
													<option value="BG">Bulgaria</option>
													<option value="BH">Bahrain</option>
													<option value="BI">Burundi</option>
													<option value="BJ">Benin</option>
													<option value="BL">Saint Barthélemy</option>
													<option value="BM">Bermuda</option>
													<option value="BN">Brunei</option>
													<option value="BO">Bolivia</option>
													<option value="BQ">British Antarctic Territory</option>
													<option value="BR">Brazil</option>
													<option value="BS">Bahamas</option>
													<option value="BT">Bhutan</option>
													<option value="BV">Bouvet Island</option>
													<option value="BW">Botswana</option>
													<option value="BY">Belarus</option>
													<option value="BZ">Belize</option>
													<option value="CA">Canada</option>
													<option value="CC">Cocos [Keeling] Islands</option>
													<option value="CD">Congo - Kinshasa</option>
													<option value="CF">Central African Republic</option>
													<option value="CG">Congo - Brazzaville</option>
													<option value="CH">Switzerland</option>
													<option value="CI">Côte d’Ivoire</option>
													<option value="CK">Cook Islands</option>
													<option value="CL">Chile</option>
													<option value="CM">Cameroon</option>
													<option value="CN">China</option>
													<option value="CO">Colombia</option>
													<option value="CR">Costa Rica</option>
													<option value="CS">Serbia and Montenegro</option>
													<option value="CT">Canton and Enderbury Islands</option>
													<option value="CU">Cuba</option>
													<option value="CV">Cape Verde</option>
													<option value="CX">Christmas Island</option>
													<option value="CY">Cyprus</option>
													<option value="CZ">Czech Republic</option>
													<option value="DD">East Germany</option>
													<option value="DE">Germany</option>
													<option value="DJ">Djibouti</option>
													<option value="DK">Denmark</option>
													<option value="DM">Dominica</option>
													<option value="DO">Dominican Republic</option>
													<option value="DZ">Algeria</option>
													<option value="EC">Ecuador</option>
													<option value="EE">Estonia</option>
													<option value="EG">Egypt</option>
													<option value="EH">Western Sahara</option>
													<option value="ER">Eritrea</option>
													<option value="ES">Spain</option>
													<option value="ET">Ethiopia</option>
													<option value="FI">Finland</option>
													<option value="FJ">Fiji</option>
													<option value="FK">Falkland Islands</option>
													<option value="FM">Micronesia</option>
													<option value="FO">Faroe Islands</option>
													<option value="FQ">French Southern and Antarctic
														Territories</option>
													<option value="FR">France</option>
													<option value="FX">Metropolitan France</option>
													<option value="GA">Gabon</option>
													<option value="GB">United Kingdom</option>
													<option value="GD">Grenada</option>
													<option value="GE">Georgia</option>
													<option value="GF">French Guiana</option>
													<option value="GG">Guernsey</option>
													<option value="GH">Ghana</option>
													<option value="GI">Gibraltar</option>
													<option value="GL">Greenland</option>
													<option value="GM">Gambia</option>
													<option value="GN">Guinea</option>
													<option value="GP">Guadeloupe</option>
													<option value="GQ">Equatorial Guinea</option>
													<option value="GR">Greece</option>
													<option value="GS">South Georgia and the South
														Sandwich Islands</option>
													<option value="GT">Guatemala</option>
													<option value="GU">Guam</option>
													<option value="GW">Guinea-Bissau</option>
													<option value="GY">Guyana</option>
													<option value="HK">Hong Kong SAR China</option>
													<option value="HM">Heard Island and McDonald
														Islands</option>
													<option value="HN">Honduras</option>
													<option value="HR">Croatia</option>
													<option value="HT">Haiti</option>
													<option value="HU">Hungary</option>
													<option value="ID">Indonesia</option>
													<option value="IE">Ireland</option>
													<option value="IL">Israel</option>
													<option value="IM">Isle of Man</option>
													<option value="IN">India</option>
													<option value="IO">British Indian Ocean Territory</option>
													<option value="IQ">Iraq</option>
													<option value="IR">Iran</option>
													<option value="IS">Iceland</option>
													<option value="IT">Italy</option>
													<option value="JE">Jersey</option>
													<option value="JM">Jamaica</option>
													<option value="JO">Jordan</option>
													<option value="JP">Japan</option>
													<option value="JT">Johnston Island</option>
													<option value="KE">Kenya</option>
													<option value="KG">Kyrgyzstan</option>
													<option value="KH">Cambodia</option>
													<option value="KI">Kiribati</option>
													<option value="KM">Comoros</option>
													<option value="KN">Saint Kitts and Nevis</option>
													<option value="KP">North Korea</option>
													<option value="KR">South Korea</option>
													<option value="KW">Kuwait</option>
													<option value="KY">Cayman Islands</option>
													<option value="KZ">Kazakhstan</option>
													<option value="LA">Laos</option>
													<option value="LB">Lebanon</option>
													<option value="LC">Saint Lucia</option>
													<option value="LI">Liechtenstein</option>
													<option value="LK">Sri Lanka</option>
													<option value="LR">Liberia</option>
													<option value="LS">Lesotho</option>
													<option value="LT">Lithuania</option>
													<option value="LU">Luxembourg</option>
													<option value="LV">Latvia</option>
													<option value="LY">Libya</option>
													<option value="MA">Morocco</option>
													<option value="MC">Monaco</option>
													<option value="MD">Moldova</option>
													<option value="ME">Montenegro</option>
													<option value="MF">Saint Martin</option>
													<option value="MG">Madagascar</option>
													<option value="MH">Marshall Islands</option>
													<option value="MI">Midway Islands</option>
													<option value="MK">Macedonia</option>
													<option value="ML">Mali</option>
													<option value="MM">Myanmar [Burma]</option>
													<option value="MN">Mongolia</option>
													<option value="MO">Macau SAR China</option>
													<option value="MP">Northern Mariana Islands</option>
													<option value="MQ">Martinique</option>
													<option value="MR">Mauritania</option>
													<option value="MS">Montserrat</option>
													<option value="MT">Malta</option>
													<option value="MU">Mauritius</option>
													<option value="MV">Maldives</option>
													<option value="MW">Malawi</option>
													<option value="MX">Mexico</option>
													<option value="MY">Malaysia</option>
													<option value="MZ">Mozambique</option>
													<option value="NA">Namibia</option>
													<option value="NC">New Caledonia</option>
													<option value="NE">Niger</option>
													<option value="NF">Norfolk Island</option>
													<option value="NG">Nigeria</option>
													<option value="NI">Nicaragua</option>
													<option value="NL">Netherlands</option>
													<option value="NO">Norway</option>
													<option value="NP">Nepal</option>
													<option value="NQ">Dronning Maud Land</option>
													<option value="NR">Nauru</option>
													<option value="NT">Neutral Zone</option>
													<option value="NU">Niue</option>
													<option value="NZ">New Zealand</option>
													<option value="OM">Oman</option>
													<option value="PA">Panama</option>
													<option value="PC">Pacific Islands Trust Territory</option>
													<option value="PE">Peru</option>
													<option value="PF">French Polynesia</option>
													<option value="PG">Papua New Guinea</option>
													<option value="PH">Philippines</option>
													<option value="PK">Pakistan</option>
													<option value="PL">Poland</option>
													<option value="PM">Saint Pierre and Miquelon</option>
													<option value="PN">Pitcairn Islands</option>
													<option value="PR">Puerto Rico</option>
													<option value="PS">Palestinian Territories</option>
													<option value="PT">Portugal</option>
													<option value="PU">U.S. Miscellaneous Pacific
														Islands</option>
													<option value="PW">Palau</option>
													<option value="PY">Paraguay</option>
													<option value="PZ">Panama Canal Zone</option>
													<option value="QA">Qatar</option>
													<option value="RE">Réunion</option>
													<option value="RO">Romania</option>
													<option value="RS">Serbia</option>
													<option value="RU">Russia</option>
													<option value="RW">Rwanda</option>
													<option value="SA">Saudi Arabia</option>
													<option value="SB">Solomon Islands</option>
													<option value="SC">Seychelles</option>
													<option value="SD">Sudan</option>
													<option value="SE">Sweden</option>
													<option value="SG">Singapore</option>
													<option value="SH">Saint Helena</option>
													<option value="SI">Slovenia</option>
													<option value="SJ">Svalbard and Jan Mayen</option>
													<option value="SK">Slovakia</option>
													<option value="SL">Sierra Leone</option>
													<option value="SM">San Marino</option>
													<option value="SN">Senegal</option>
													<option value="SO">Somalia</option>
													<option value="SR">Suriname</option>
													<option value="ST">São Tomé and Príncipe</option>
													<option value="SU">Union of Soviet Socialist
														Republics</option>
													<option value="SV">El Salvador</option>
													<option value="SY">Syria</option>
													<option value="SZ">Swaziland</option>
													<option value="TC">Turks and Caicos Islands</option>
													<option value="TD">Chad</option>
													<option value="TF">French Southern Territories</option>
													<option value="TG">Togo</option>
													<option value="TH">Thailand</option>
													<option value="TJ">Tajikistan</option>
													<option value="TK">Tokelau</option>
													<option value="TL">Timor-Leste</option>
													<option value="TM">Turkmenistan</option>
													<option value="TN">Tunisia</option>
													<option value="TO">Tonga</option>
													<option value="TR">Turkey</option>
													<option value="TT">Trinidad and Tobago</option>
													<option value="TV">Tuvalu</option>
													<option value="TW">Taiwan</option>
													<option value="TZ">Tanzania</option>
													<option value="UA">Ukraine</option>
													<option value="UG">Uganda</option>
													<option value="UM">U.S. Minor Outlying Islands</option>
													<option value="US">United States</option>
													<option value="UY">Uruguay</option>
													<option value="UZ">Uzbekistan</option>
													<option value="VA">Vatican City</option>
													<option value="VC">Saint Vincent and the
														Grenadines</option>
													<option value="VD">North Vietnam</option>
													<option value="VE">Venezuela</option>
													<option value="VG">British Virgin Islands</option>
													<option value="VI">U.S. Virgin Islands</option>
													<option value="VN">Vietnam</option>
													<option value="VU">Vanuatu</option>
													<option value="WF">Wallis and Futuna</option>
													<option value="WK">Wake Island</option>
													<option value="WS">Samoa</option>
													<option value="YD">People's Democratic Republic of
														Yemen</option>
													<option value="YE">Yemen</option>
													<option value="YT">Mayotte</option>
													<option value="ZA">South Africa</option>
													<option value="ZM">Zambia</option>
													<option value="ZW">Zimbabwe</option>
													<option value="ZZ">Unknown or Invalid Region</option>
											</select>
											</label> <label>Driver License <input type="text"
												id="driver_license" name="driver_license" class="stored">
											</label>
										</div>
										<div class="span3">
											
										</div>
									</div>
									<br />
									<div class="row">
										<div class="span9">
											<legend>
												<span>Any</span> special requests?
											</legend>
											<textarea class="span9" rows="3" cols=""></textarea>
										</div>

									</div>

									<div class="row">
										<div class="span9">
											<br />
											<!-- a href="book-pay"
												class="btn btn-primary btn-large book-now pull-right">Continue</a-->
											<!-- input class="btn btn-primary btn-large book-now" type="submit" value="Submit"/-->
											<input type="submit" value="Continue"
												class="btn btn-primary btn-large book-now" id="checkAvail" />
											<br /> <br />
										</div>
									</div>

									<input name="checkInDate"
										value="<%=request.getParameter("checkInDate")%>" type="hidden" />
									<input name="checkOutDate"
										value="<%=request.getParameter("checkOutDate")%>"
										type="hidden" /> <input name="rooms"
										value="<%=request.getParameter("rooms")%>" type="hidden" /> <input
										name="adults" value="<%=request.getParameter("adults")%>"
										type="hidden" /> <input name="children"
										value="<%=request.getParameter("children")%>" type="hidden" />
									<input name="roomId"
										value="<%=request.getParameter("roomId")%>" type="hidden" />
									<input name="totalPrice"
										value="<%=request.getParameter("totalPrice")%>" type="hidden" />



								</fieldset>
							</form>




						</div>

						<div class="span3">
							<br /> <br />
							<h3>
								<span>Your</span> summary
							</h3>
							<p>Your choosen dates are:</p>
							<div class="pull-left">
								Arrival : <i><em><%=request.getParameter("checkInDate")%> </em></i>
							</div>
							<br />
							<div class="pull-left">
								Departure : <i><%=request.getParameter("checkOutDate")%></i>
							</div>
							<br /> <br /> Your choosen room is:
							<div class="pull-left">
								<i>A Luxury Room for <%=request.getParameter("adults")%>
									adults and <%=request.getParameter("children")%> child
								</i>
							</div>
							<br /> <br /> <br /> <br />
							<p></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/scripts.jsp" />
	<script type="text/javascript">
		$("#checkAvail").click(function(event) {
			console.log("checkAvail");
			$.ajax({
				type : 'POST',
				url : "bookpay",
				context : document.body,
				data : $("#form2").serialize(),
				async : false,
				success : function(result) {
					console.log("success");
					/*var res = result;
					var roomId = result["result"];
					if(roomId > 0){
						console.log("At " + JSON.stringify(result));
						jq(".roomAvailable").css("visibility", "visible");
						jq(".roomNotAvailable").css("visibility", "hidden");
						//setting the value of the room id which is available for booking and 
						//assigned to the user by default based on his selection criteria
						document.getElementById('roomId').value = roomId;
					}else{
						//throw new Error("not available");
						jq(".roomAvailable").css("visibility", "hidden");
						jq(".roomNotAvailable").css("visibility", "visible");
					}*/
				},
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("error");
					//jq(".roomAvailable").css("visibility", "hidden");
					//jq(".roomNotAvailable").css("visibility", "visible");
					//console.log(jqXHR.status + " " + jqXHR.responseText);
				}
			});
			//event.preventDefault();
		});

		alert("Hello");
		$(document).ready(function() {
			function init() {
				if (localStorage["first_name"]) {
					$('#first_name').val(localStorage["first_name"]);
				}
				if (localStorage["last_name"]) {
					$('#last_name').val(localStorage["last_name"]);
				}
				if (localStorage["address"]) {
					$('#address').val(localStorage["address"]);
				}
				if (localStorage["email"]) {
					$('#email').val(localStorage["email"]);
				}
				if (localStorage["city"]) {
					$('#city').val(localStorage["city"]);
				}
				if (localStorage["state"]) {
					$('#state').val(localStorage["state"]);
				}
				if (localStorage["country"]) {
					$('#country').val(localStorage["country"]);
				}
				if (localStorage["driver_license"]) {
					$('#driver_license').val(localStorage["driver_license"]);
				}
				if (localStorage["email"]) {
					$('#email').val(localStorage["email"]);
				}
				if (localStorage["country"]) {
					$('#country').val(localStorage["country"]);
				}
				if (localStorage["zip"]) {
					$('#zip').val(localStorage["zip"]);
				}
			}
			init();
		});
		$('.stored').change(function() {
			localStorage[$(this).attr('name')] = $(this).val();
		});
		$('#localStorageTest').submit(function() {
			localStorage.clear();
		});
	</script>
</body>
</html>