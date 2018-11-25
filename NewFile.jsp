<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>JSP声明例子</title>
</head>
<%!
   int x,y=60,z;
   String name="John";
   Date date=new Date();
%>
<%!
   int add(int m,int n){
	int result=0;
	result=m+n;
	return result;
}
%>
<%!
   int chengji(int m,int n){
	int result=0;
	result=n*m;
	return result;
}
%>
<%!
   class Circle{//计算圆的面积
	double r;
	Circle(double r){
		super();//继承空的构造方法
		this.r=r;
	}double area(){//取整
		return Math.floor(Math.PI*r*r);
	}
}
%>
<body>
<%
   out.println("我的名字："+name);
   out.println("<br/>");
   out.println("x的值为："+x);
   out.println("<br/>");
   out.println("y的值为："+y);
   out.println("<br/>");
   out.println("z的值为："+z);
   out.println("<br/>");
   out.println("现在的时间为："+date);
   out.println("<br/>");
   out.println("10和20的和为"+add(10,20));
   out.println("<br/>");
   out.println("10和20的积为："+chengji(10,20));
%>
<br/>
<%
   Circle c=new Circle(6);
   out.println("半径为6的圆面积为"+c.area());
%>
</body>
</html>