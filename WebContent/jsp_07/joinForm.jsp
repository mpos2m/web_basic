<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<form action="joinChk.jsp" method="post">
		<table>
			<tr>
				<td><h2>회원정보 입력</h2><br></td>
			</tr>
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name ="id" id = "id"><br></td>
			</tr>
			<tr>
				<td>비밀번호 :</td>
				<td><input type="password" name ="pass" id = "pass"><br></td>
			</tr>
			<tr>
				<td>이름 :</td>
				<td><input type="text" name ="name" id = "name"><br></td>
			</tr>
			<tr>
				<td>나이 :</td>
				<td><input type="text" name ="age" id = "age"><br></td>
			</tr>
			<tr>
				<td>성별 :</td>
				<td><input type="radio" name ="gender" id = "gender" value = "1" checked>남
					<input type ="radio" name ="gender" id="gender" value ="2">여
				</td>
			</tr>
			<tr>
				<td>이메일 주소 :</td>
				<td> <input type="email" name ="email" id = "email"><br></td>
			</tr> 
			<tr>
				<td>
					<input type = "submit" value="가입하기">
					<input type = "reset" value = "다시작성">
				</td>
			</tr>
		</table>
	</form>
</fieldset>
</body>
</html>