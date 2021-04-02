<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>property 테스트</title>
</head>
<body>
	<h1> property = "*"테스트</h1>
	<fieldset>
	<form action="beanTest2.jsp">
		<table>
			<tr>
				<td>번호</td>
				<td><input type= "text" name = "stdNo" id = "stdNo"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type = "text" name = "stdName" id = "stdName"></td>
			</tr>
			<tr>
				<td>국어점수</td>
				<td><input type = "text" name = "kor" id = "kor"></td>
			</tr>
			<tr>
				<td>영어점수</td>
				<td><input type = "text" name ="eng" id = "eng"></td>
			</tr>
			<tr>
				<td>수학점수</td>
				<td><input type = "text" name = "math" id = "math"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="전송 "></td>
			</tr>
		</table>
	</form>
	</fieldset>
</body>
</html>