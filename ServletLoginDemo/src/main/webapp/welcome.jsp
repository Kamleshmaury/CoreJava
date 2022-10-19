<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="logout" method="get"> 
  
        <h2> 
            Hello 
            <%=request.getParameter("usName")%>! 
        </h2> 
        <h3>Welcome to Login Logout Page..</h3> 
  
        <br> <input type="submit" value="Logout" /> 
    </form> 
      
</body>
</html>