<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#loginFormArea{
		text-align : center;
		width : 300px;
		margin : auto;
		border : solid 1px red;
	}
	
	h1{
		text-align : center;
	}
</style>

</head>
<body>
	<h1>로그인</h1>
	<section id = "loginFormArea">
		<form action = "sessionlogin" method = "post">
			<label id = "id">아이디 :</label><input type = "text" name = "id" id = "id"/><br>
			<label id = "passwd">비밀번호 :</label><input type = "password" name = "pass" id = "passwd"/><br><br>
			<input type = "submit" value = "로그인"/>
		</form>
	</section>
</body>
</html>