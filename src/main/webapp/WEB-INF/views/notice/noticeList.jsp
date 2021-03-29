<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container">
		<h2>Notice List</h2>
	
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th>NUM</th>
				<th>TITLE</th>
				<th>WRITER</th>
				<th>DATE</th>
				<th>HIT</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="dto" >
			<tr>
				<td>${dto.num}</td>
				<td><a href="./noticeSelect?num=${dto.num}">${dto.title}</a></td>
				<td>${dto.writer}</td>
				<td>${dto.regDate}</td>
				<td>${dto.hit}</td>
			</tr>
		</c:forEach>
		</tbody>
	
	</table>
</div>

<div class="container">
  <ul class="pagination">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
   
   <c:forEach begin="${startNum}" end="${pager.lastNum}" var="i">
    <li class="page-item"><a class="page-link" href="./noticeList?curPage=${i}">${i}</a></li>
   </c:forEach>
   
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</div>

</body>
</html>