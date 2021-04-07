<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="./template/bootStrap.jsp"></c:import>

<link rel="stylesheet" href="./resources/css/test.css">
<title>Home</title>
<style type="text/css">
	#d1 {
		width: 200px;
		height: 200px;
		background-color: red;
		overflow: hidden;
	}
	
	#d2 {
		width: 50px;
		height: 50px;
		background-color: yellow;
		margin: 75px auto;
	}
</style>
</head>
<body>
	
<c:import url="./template/header.jsp"></c:import>

<button class="b">BUTTON</button>
<button id="btn" class="b">CLICK</button>
<button id="btn2" class="b">CLICK2</button>
<h1 id="t">version 3</h1>
<ol id="result">
	<li>A</li>
</ol>
	
<select id="mon">
	
</select>	

<div id="d1">
	<div id="d2"></div>
</div>


<script type="text/javascript">
	$("#btn2").click(function() {
		$("#result").prepend('<li>GO</li>');
	});
	
	
		
	for(let i=1;i<13;i++){
		$("#mon").append("<option>"+i+"</option>");
	}
	
	$("#d1").click(function(){
		console.log("parent");
	});
	
	$("#d2").click(function() {
		console.log("child");
	});
		
		
	
	
</script>




</body>
</html>
<!--  //btn.onclick=go; //함수 바깥에서는 누르지않아도 바로 실행되서 이벤트 쓸거면 가로 안쓰고 저렇게 입력
/*	btn.onclick = function() {
		alert("익명함수");
		go();
	}
	
	function go(){
		alert("hello");
	}*/-->	
