<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/boot.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container">
	<div class="row">
		
		<table class="table table-hover">
			<tr class="danger">
				<td>번호</td>
				<td>이름</td>
				<td>국어</td>
				<td>영어</td>
				<td>수학</td>
				<td>총점</td>
				<td>평균</td>
			</tr>	
			
				<tr class="info">
					<td>${notice.num}</td>
					<td>${notice.name}</td>
					<td>${notice.kor}</td>
					<td>${notice.eng}</td>
					<td>${notice.math}</td>
					<td>${notice.total}</td>
					<td>${notice.avg}</td>
				</tr>
		
		</table>
		<a href="./pointMod?num=${dto.num}" class="btn btn-primary">Update</a>
		<a href="./pointDelete?num=${dto.num}" class="btn btn-danger">Delete</a>
			
	</div>
</div>
</body>
</html>