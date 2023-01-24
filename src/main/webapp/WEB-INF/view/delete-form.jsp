<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書削除</title>
</head>
<body>
	<form action="DeleteActionServlet" method="post">
	<p>削除する図書のIDを入力してください</p>
	<input type="text" name="delid">
	<input type="submit">
	</form>
</body>
</html>