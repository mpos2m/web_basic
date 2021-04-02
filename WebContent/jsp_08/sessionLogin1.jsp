<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Login</title>
</head>
<body>
	<section id = "loginArea">
	<form action = "sessionLogin2.jsp" method= "post">
		<table>
			<tr>
				<td><label for = "id">아이디 : </label></td>
				<td><input type= "text" name = "id" id = "id"></td>	
			</tr>
			<tr>
				<td><ladel for = "pass">비밀번호 : </ladel></td>
				<td><input type = "password" name= "pass" id = "pass"></td>
			</tr>
			<tr>
				<td colspan="2"><input type= "submit" value="로그인"><input type = "reset" value = "다시작성">
			</tr>
		</table>
	</form>
	</section>
</body>
</html>