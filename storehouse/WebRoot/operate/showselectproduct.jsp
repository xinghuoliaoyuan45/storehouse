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
		<table class="table">
			<thead>
				<tr>
					<th>商品id:</th>
					<th>商品Name:</th>
					<th>商品现在数量</th>
					<th>商品价格</th>
					<th>商品描述:</th>
				</tr>				
					<c:forEach var="goods" items="${goods}">
					<tr>
						<td>${goods.goods_id}</td>
						<td>${goods.goods_name}</td>
						<td>${goods.goods_number}</td>
						<td>${goods.goods_price }</td>
						<td>${goods.goods_description}</td>
					</c:forEach>
				</tr>
		</table>
		<br>
		<h2>
			<a href="http://localhost:8080/storehouse/operate/operate.jsp"  role="button">回到操作商品界面</a>
			<a href="http://localhost:8080/storehouse/operate/findbyname.jsp" role="button">继续查询</a>
			
		</h2>
		
		</div>
		

	</center>
</body>
</html>
