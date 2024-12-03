<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>getallemp</title>
</head>
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
               <c:forEach  items="${EMP_LIST}" var="employee">
            <tr>
             <td><c:out value="${employee.id}" /></td>
                <td><c:out value="${employee.firstname}" /></td>
                <td><c:out value="${employee.lastname}" /></td>
                <td><c:out value="${employee.email}" /></td>
      		  <td><c:out value="${employee.phone}" /></td>

 <td>
                     <a href="editemp?id=<c:out value='${employee.id}' />">Edit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="deleteemp?id=<c:out value='${employee.id}' />">Delete</a>                     
                    </td> 
                    
                    
            </tr>
        </c:forEach>
    </tbody>
          </table>

</body>
</html>
