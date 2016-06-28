<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="refresh" content="3;url= http://localhost:8080/storehouse/manager/manager.html ">
  	
  </head>
  
  <body>
	操作成功！3秒后自动跳转到管理页面！
	<br>
	<a href="http://localhost:8080/storehouse/manager/manager.html"  role="button">回到管理界面</a>
  </body>
</html>
