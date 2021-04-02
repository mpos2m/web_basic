<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="con" value="${JndiDs.getConnection() }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연동 테스트</title>
<style>
	li{
		list-style: none;
	}
</style>
</head>
<body>
	<c:out value="${con }"></c:out><br>
	<fieldset>
		<legend>ERP</legend>
		<ul>
			<li><a href = "TitleServlet">직책 관리</a></li>
			<li><a href = "TitleServlet">부서 관리</a></li>
			<li><a href = "TitleServlet">사원 관리</a></li>
		</ul>
	</fieldset>
</body>
</html>