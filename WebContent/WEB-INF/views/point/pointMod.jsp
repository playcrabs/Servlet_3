<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a
					href="${pageContext.request.contextPath}/">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a
					href="${pageContext.request.contextPath}/point/pointList">Point</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>
	<!-- Nav -->

	<div class="container">
		<div class="jumbotron">
			<h1>point Mod form</h1>
			<p>Bootstrap is the most popular HTML, CSS, and JS framework for
				developing responsive, mobile-first projects on the web.</p>
		</div>
	</div>
	<div style="padding: 0 20%;">
		<h1>point Mod form</h1>
		<form action="./pointMod" method="post">
			<div class="form-group">
				<label for="Name">Name:</label> <input type="text"
					class="form-control" id="name" placeholder="Enter Name" name="name"
					value="${dto.name}">
			</div>

			<div class="form-group">
				<label for="Kor">Kor:</label> <input type="text"
					class="form-control" id="kor" placeholder="Enter Kor" name="kor"
					value="${dto.kor}">
			</div>

			<div class="form-group">
				<label for="Num">Eng:</label> <input type="text"
					class="form-control" id="eng" placeholder="Enter Eng" name="eng"
					value="${dto.eng}">
			</div>

			<div class="form-group">
				<label for="Math">Math:</label> <input type="text"
					class="form-control" id="math" placeholder="Enter Math" name="math"
					value="${dto.math}">

				<div class="form-group">
					<label for="Num"></label> <input type="hidden" class="form-control"
						id="num" placeholder="Enter Num" name="num" value="${dto.num}" readonly="readonly">
				</div>
			</div>

			<!-- a태그는 주소 이동이고, button은 파라미터 넘기기 -->
			<input type="submit" class="btn btn-success">
			<!-- <button type="submit" class="btn btn-success">Submit</button> -->
			<%-- <a href="./pointAdd?num=${dto.num}" class="btn btn-success">Submit</a> --%>
		</form>

	</div>
</body>
</html>