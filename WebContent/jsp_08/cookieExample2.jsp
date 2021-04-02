<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("language", request.getParameter("language"));
	cookie.setMaxAge(300);
	response.addCookie(cookie);
%>
<script>
	location.href="cookieExample1.jsp"
</script>