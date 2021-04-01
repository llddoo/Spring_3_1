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
</head>
<body>
	
	<c:import url="./template/header.jsp"></c:import>
	
<button onclick="go()">BUTTON</button>
<button id="btn">CLICK</button>
<button id="btn2">CLICK2</button>

<h1>version 3</h1>

<script type="text/javascript">
	let btn = document.getElementById("btn");
	let btn2 = document.getElementById("btn2");
	
	btn2.addEventListener("click", function() {
		alert("btn2");
		go();
	});
	
	//btn.onclick=go; //함수 바깥에서는 누르지않아도 바로 실행되서 이벤트 쓸거면 가로 안쓰고 저렇게 입력
	btn.onclick = function() {
		alert("익명함수");
		go();
	}
	
	function go(){
		alert("hello");
	}
</script>

</body>
</html>