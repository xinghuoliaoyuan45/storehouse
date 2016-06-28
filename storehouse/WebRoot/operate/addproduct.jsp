<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/storehouse/bootstrap3/css/bootstrap.min.css" />

</head>

<body>
	<center>
		<div class="container">
			<form class="form-horizontal" action="addgoods.action" method="post">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">商品id</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="goodsid"
							placeholder="123456">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">商品名称</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="goodsname"
							placeholder="哈密瓜">
					</div>
				</div>
				
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">商品数量</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="goodsnumber"
							placeholder="如100">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">商品价格</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="goodsprice"
							placeholder="36.5">
					</div>
				</div>
			
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">商品的描述信息</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="goodsdesc"
							placeholder="这个商品是海南产的">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">添加商品</button>
					</div>
				</div>
			</form>
			<a href="http://localhost:8080/storehouse/operate/operate.jsp"  role="button">回到操作商品界面</a>
		</div>

	</center>
</body>
</html>
