<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   Date d=new Date();
   SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
   String t=sdf.format(d);
   String copyrightMess="John版权左右 2010-"+t;
   %>
   <br/>
   <div align="center"><%=copyrightMess%></div>