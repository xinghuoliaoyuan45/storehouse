<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>

<head>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/storehouse/bootstrap3/css/bootstrap.min2.css" />
<script
	src="http://localhost:8080/storehouse/bootstrap3/js/jquery-1.7.2.min.js"></script>
<script
	src="http://localhost:8080/storehouse//bootstrap3/js/bootstrap.min2.4.js"></script>

</head>
<body class="row bg">

	<div ng-app="myApp">
		<div class="container">
			<h1 class="page-header">总体操作页面</h1>
			<div class="tabbable tabs-left">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#tab1" data-toggle="tab">查询所有商品</a></li>
					<li><a href="#tab2" data-toggle="tab"> 登录页面</a></li>
					<li><a href="#tab3" data-toggle="tab">修改价格</a></li>
					<li><a href="#tab4" data-toggle="tab">入库或者出库</a></li>
					<li><a href="#tab5" data-toggle="tab">添加商品</a></li>
					<li><a href="#tab6" data-toggle="tab">模糊查询</a></li>

				</ul>
				<div ng-controller="analyzestu">
					<div class="tab-content">
						<div class="tab-pane active" id="tab1">
							<a
								href="http://localhost:8080/storehouse/operate/findallgoods.action">
								查询所有商品</a>
						</div>
						<div class="tab-pane" id="tab2">
							<a href="http://localhost:8080/storehouse/login/login.html">
								登录页面 包括超级用户和普通用户
								</p>
						</div>
						<div class="tab-pane" id="tab3">
							<a
								href="http://localhost:8080/storehouse/operate/updateproductprice.jsp">
								修改价格</a>
						</div>
						<div class="tab-pane" id="tab4">
							<a
								href="http://localhost:8080/storehouse/operate/updateproductnumber.jsp">
								入库或者出库</a>
						</div>
						<div class="tab-pane" id="tab5">
							<a href="http://localhost:8080/storehouse/operate/addproduct.jsp">
								添加商品</a>
						</div>
						<div class="tab-pane" id="tab6">
							<a href="http://localhost:8080/storehouse/operate/findbyname.jsp">
								模糊查询</a>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>