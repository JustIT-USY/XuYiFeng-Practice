<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>include指令演示</title>
   </head>
   <body>
      <%@include file="John.html" %>
      <br/>
      <div align="center">JSP include指令演示</div>
      <%@include file="copyright.jsp" %>
   </body>
</html>