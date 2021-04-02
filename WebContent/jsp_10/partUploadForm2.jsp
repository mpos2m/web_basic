<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다중 파일 업로드 테스트</title>
</head>
<body>
	<h1>다중 파일 업로드 테스트</h1>
	<form action="partUploadPro2" method="post" enctype="multipart/form-data">
		<label for = "writer">작성자 : </label>
		<input type = "text" name = "writer" id = "writer"><br>
		<label for = "uploadFile1">업로드 파일1</label>
		<input type = "file" name = "uploadFile1" id = "uploadFile1"><br>
		<label for = "uploadFile2">업로드 파일2</label>
		<input type = "file" name = "uploadFile2" id = "uploadFile2"><br>
		<input type = "submit" value = "다중 업로드"/>
	</form>
</body>
</html>