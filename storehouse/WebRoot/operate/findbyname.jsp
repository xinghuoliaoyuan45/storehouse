<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    
    <title>查询商品和模糊查询商品</title>
    <link rel="stylesheet" type="text/css"
	href="http://localhost:8080/storehouse/bootstrap3/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
    <form action="selectlikename.action" method="post">
        <div class="form-group">
            <input type="text" class="form-control" name="selectlikegoodsname" placeholder="哈密瓜或哈密">
        </div>
        <button type="submit" class="btn btn-success" >查询</button>
    </form>
</div>

</body>
</html>