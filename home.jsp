<%-- 
    Document   : home.jsp
    Created on : 6 Apr, 2024, 11:45:09 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%
           String username=(String)session.getAttribute("username");
           System.out.println(username);
           if(username==null)
           {
              response.sendRedirect("login.html");         
           }
           
        %>
        <a href="logout.jsp">Sign Out</a>
        <h1>Hello User...!!</h1>
    </body>
</html>
