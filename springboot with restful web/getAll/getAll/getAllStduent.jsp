
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> <%@taglib prefix="c"
 
 
uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>getallemp</title> </head>
<body>
<h1>Get all data from db</h1>
<table border=1>
    <thead>
        <tr>
         <th>ID</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Email</th>
            <th>Phone</th>
           <th>Action </th>
      </tr>
</thead>
<tbody>
<c:forEach items="${s_list}"
     var="student">
            <tr>
                 /></td>
/></td>
/></td>
/></td>
<td>
<td><c:out value="${student.id}" /></td> <td><c:out value="${student.fname}"
<td><c:out value="${student.lname}"
<td><c:out value="${student.email}" <td><c:out value="${student.phone}"
                        
<a href="edit?id=<c:out value='${student.id}' />">Edit</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="delete?id=<c:out value='${student.id}' />">Delete</a>
</td>
            </tr>
        </c:forEach>
    </tbody>
          </table>
</body>
</html>