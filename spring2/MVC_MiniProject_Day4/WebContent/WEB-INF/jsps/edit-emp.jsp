<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>edit-emp jsp</h1>

 

<form action="updateemp" method="post">

 ID <input type="text" name="id1" value="${Existing_EMP_Data.id}"></br></br> 
FirstName <input type="text" name="fname1" value="${Existing_EMP_Data.fname}"></br></br>
LastName <input type="text" name="lname1" value="${Existing_EMP_Data.lname}"></br></br>
Email <input type="text" name="email1" value="${Existing_EMP_Data.email}"></br></br>
Phone <input type="text" name="phone1" value="${Existing_EMP_Data.phone}"></br></br>
<input type="submit" value="Update_Employee">


</form>
</body>
</html>