<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Login successful for user : ${USER}</h1>

<form action="createEmp" method="post">
FirstName<input type="text" name="fname"></br></br>
LastName<input type="text" name="lname"></br></br>
Email<input type="text" name="email"></br></br>
Phone<input type="text" name="phone"></br></br>
<input type="submit" value="CREATE_EMP">
</form>
</body>
</html>