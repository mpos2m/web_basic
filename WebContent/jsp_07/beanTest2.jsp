<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="std" class ="web_basic.jsp_07.Student" scope="page"/>
<jsp:setProperty property="*" name="std"/>
<%
 request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>정보 출력</h2>
	학생번호 : <%=std.getStdNo() %><br>
	학생이름 : <%=std.getStdName() %><br>
	국어점수 : <%=std.getKor() %><br>
	영어점수: <%=std.getEng() %><br>
	수학점수 : <%=std.getMath() %><br>
	점수총합 : <%=std.getTotal() %><br>
	점수 평균 : <%=std.getAvg() %><br>
</body>
</html>