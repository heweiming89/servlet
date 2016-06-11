<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
<script type="text/javascript" src="webjars/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		// 		alert("hello");
	})
</script>
</head>
<body>
	<img alt="图片" src="common">

	<c:forEach begin="1" end="10" varStatus="s">
		<input type="button" value="按钮${s.index }" />
		<br />
	</c:forEach>

	<input type="text" name="" id="" />
</body>
</html>