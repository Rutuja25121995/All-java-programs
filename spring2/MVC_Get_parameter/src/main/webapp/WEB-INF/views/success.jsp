<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>success page</h1>
 ${USERNAME}
<form action="create">
firstname<input type="text" name="fname"><br><br>
lastname<input type="text" name="lname"><br><br>
<input type="submit" value="create">
</form>
</body>
</html>