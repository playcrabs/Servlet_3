<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					<td>제목</td>
					<td>글쓴이</td>
					<td>내용</td>
				</tr>
				<tr class="info">
					<td>${dto.pname}</td>
					<td>${dto.name}</td>
					<td>${dto.post}</td>
				</tr>

			</table>
			<c:if test="${name == admin}">
				<a href="./noticeUpdate?pnum=${dto.pnum}" class="btn btn-primary"
					id="update">글 수정</a>
				<a href="./noticeDelete?pnum=${dto.pnum}" class="btn btn-danger"
					id="delete">글 삭제</a>
			</c:if>
		</div>
	</div>
	<script type="text/javascript">
		$("#update").click(function() {
			location.href="./noticeUpdate";
		});
		$("#delete").click(function() {
			var result = confirm("삭제 하겠습니까?");
			if (result) {
				location.href="./noticeDelete";	
			}
		});
	</script>
</body>
</html>