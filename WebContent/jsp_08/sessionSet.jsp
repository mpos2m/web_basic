<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.setAttribute("name", "SessionTest!!");
session.setAttribute("id", "SessionId!!");

session.setMaxInactiveInterval(120);
%>
<script>
	location.href="sessionTest.jsp";
</script>