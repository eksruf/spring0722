<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="mvc_index">index</a>

<table border="1">
	<tr>
	<th>이름</th> <th>나이</th> <th>주소</th>
	</tr>
	
	<c:forEach var="s" items="${list }">
	<tr>
	<td>${s.name} &nbsp; </td> <td>${s.age } </td> <td>${s.addr } </td>
	</tr>
	</c:forEach>
</table>
</body>
</html>