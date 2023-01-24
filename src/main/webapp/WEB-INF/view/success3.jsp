<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録成功</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="success" class="big-bg">
	<h3>下記の図書を登録しました</h3>
	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String writer = request.getParameter("writer");
	String pub = request.getParameter("pub");
	String isbn = request.getParameter("isbn");
	String login_id = request.getParameter("login_i");
	%>
	<p>図書名:<%=name %><br>
	<p>著者:<%=writer %><br>
	<p>出版社:<%=pub %><br>
	<p>ISBN:<%=isbn %><br></p>
	<p>login_id:<%=login_id %></p>
	<a href="./">戻る</a>
	</div>
</body>
</html>