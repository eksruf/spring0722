<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	request: <%=request.getAttribute("test") %><br>
	el:	${ test }<br>
	str: ${str[0] }, ${str[1] }, ${str[2] }
<hr>
	<c:forEach var="s" items="${str }">
		<b>${s }</b> <br>
	</c:forEach>
	
	
	<h3>로그인페이지입니다</h3>
	<a href="index">기본페이지</a>
	<a href="logout">로그아웃페이지</a><!-- 상대경로 로 설정한 것 (경로 이동시 마지막 하나만 바뀌니깐 오류발생할 수 있음)-->
</body>
</html>