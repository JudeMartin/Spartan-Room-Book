<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Login</title>
<jsp:include page="includes/header.jsp" />
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
h3{

text-align:center;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>

		<div class="container-fluid" style="min-height: 550px;">
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
						<li class=" "><a href="gallery">Gallery</a></li>
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
<div id="login-box" >

		<h3>LOGIN </h3>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
			action="<c:url value='/j_spring_security_check' />" method='POST' >

			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='username'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password' /></td>
				</tr>
				<tr>
					<td id=btn colspan='2'><input name="submit" class="btn btn-primary btn-large book-now" type="submit"
						value="submit" /></td>
				</tr>
			</table>

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />

		</form>
	</div>
	</div>
	</div>
	<!-- /container -->
	<jsp:include page="includes/footer.jsp" />
<jsp:include page="includes/scripts.jsp" />
	

</body>
</html>