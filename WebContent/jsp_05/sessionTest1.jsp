<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.setMaxInactiveInterval(10);
%>
<html>
<head>
<meta charset="UTF-8">
<title>세션테스트</title>
</head>
<body>
	<h2>세션테스트</h2>
	is.new():<%=session.isNew() %><br>
	생성시간 : <%=session.getCreationTime() %><br>
	최종 접속시간 : <%=session.getLastAccessedTime() %><br>
	세션 ID : <%=session.getId() %><br>
</body>
</html>