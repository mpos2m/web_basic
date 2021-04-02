<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="join" class = "web_basic.jsp_07.Join" scope="page"/>
<jsp:setProperty property="*" name = "join"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 입력 정보 확인</title>
</head>
<body>
	아이디 : <%=join.getId() %><br>
	비밀번호 : <%=join.getPass() %><br>
	이름 : <%=join.getName() %><br>
	성별 : <%=join.getGender() %><br>
	나이 : <%=join.getAge() %><br>
	이메일 : <%=join.getEmail() %><br>
</body>
</html>