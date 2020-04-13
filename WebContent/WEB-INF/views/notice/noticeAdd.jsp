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
	<form action="./noticeAdd" method="post">
    <div class="form-group">
      <label for="pnum">번호:</label>
      <input type="text" class="form-control" id="pnum" placeholder="글 번호" name="pnum" readonly="readonly">
    </div>

    <div class="form-group">
      <label for="pname">제목:</label>
      <input type="text" class="form-control" id="pname" placeholder="제목을 입력하세요" name="pname">
    </div> 
       
    <div class="form-group">
      <label for="name">글쓴이:</label>
      <input type="text" class="form-control" id="name" placeholder="글쓴이" name="name" readonly="readonly">
    </div>  
    
    <div class="form-group">
      <label for="date">날짜:</label>
      <input type="text" class="form-control" id="date" placeholder="날짜" name="date" readonly="readonly">
    </div>  
    
    <div class="form-group">
      <label for="view">조회수:</label>
      <input type="text" class="form-control" id="view" placeholder="조회수" name="view" readonly="readonly">
    </div>  
    
    <div class="form-group">
      <label for="post">내용:</label>
      <input type="text" class="form-control" id="post" placeholder="내용" name="post">
    </div>          
   
    <button type="submit" class="btn btn-default">추가</button>
    
  </form>
	</div>
</div>

</body>
</html>