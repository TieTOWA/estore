<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>上传</title>
</head>
<body>
	<center>
		<form action="http://localhost:8080" method="post" enctype="multipart/form-data">
		<input type="file" name="filename"><p>
		<input type="submit" value="提交">
		</form>
	</center>
</body>
</html>