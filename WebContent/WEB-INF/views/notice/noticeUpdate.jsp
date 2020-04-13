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
	<form action="./noticeUpdate" method="post">
    
    <div class="form-group">
      <label for="post">내용:</label>
      <input type="text" value="${dto.post}" class="form-control" id="post" placeholder="Enter Eng" name="post" value="${member.post}">
    </div>  
    
    <div class="form-group">
      <label for="date">시간:</label>
      <input type="text" value="${dto.date}" class="form-control" id="date" placeholder="Enter Math" name="date">
    </div>          
   
    <button type="submit" class="btn btn-default">수정</button>
    
  </form>
	</div>
</div>

</body>
</html>