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
			<form class="form-horizontal" action="updateprice.action">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">需要修改价格的商品id</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="updateid"
							placeholder="123456">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">新的价格</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="updateprice"
							placeholder="如100">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">修改价格</button>
					</div>
				</div>
			</form>
			<a href="http://localhost:8080/storehouse/operate/operate.jsp" role="button">回到操作商品界面</a>
		</div>

	</center>
</body>
</html>
