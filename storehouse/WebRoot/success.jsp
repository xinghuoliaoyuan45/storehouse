<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="refresh" content="3;url= http://localhost:8080/storehouse/operate/operate.jsp ">
  	
  </head>
  
  <body>
	操作成功！3秒后自动跳转到操作页面！
	<br>
	<a href="http://localhost:8080/storehouse/operate/operate.jsp"  role="button">回到操作商品界面</a>
  </body>
</html>
