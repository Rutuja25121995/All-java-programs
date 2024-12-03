<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Record Created Successfully </h1>
<h5>Firstname:---->${FIRSTNAME }</h5>
<h5>Lastname:----->${LASTNAME }</h5>

<form action="getall">
<input type="submit"value="Get_All_Students">
</form>
</body>
</html>