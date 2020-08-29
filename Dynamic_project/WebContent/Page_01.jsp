<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page_01</title>
</head>
<body>
    <h2>Welcome</h2>
    <%!
    
    public String sayHello(String name)
    {
    	return "Hello"+name;
    }
    
    %>
    
    Result of method call : <%= sayHello("Harsha") %><br>
    Result of an expression (5+3) : <%= 5+3 %><br>
    
    <% 
    for(int c=0 ; c<10 ; c++)
    {
    	%>
    	Value: <%= c %>  <br>
    	<%
    }
    %>
</body>
</html>