<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="../css/reset.css" />
	<link rel="stylesheet" href="../css/content.css" />
<title>用户管理页</title>
<script type="text/javascript" >
	
	function del(obj)
	{	
		
		var tr = obj.parentNode.parentNode;
		var user_id = tr.cells[0].innerHTML;
		alert(user_id);
		tr.parentNode.deleteRow(tr.index+1);
		location="http://localhost:8080/news_project/user/deluser?id="+user_id;
	}
	function update(obj)
	{	
		
		var tr = obj.parentNode.parentNode;
		var user_id = tr.cells[0].innerHTML;
		location="http://localhost:8080/news_project/user/updateuser?id="+user_id;
	}
	
</script>
</head>
<body marginwidth="0" marginheight="0" onload="load()">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">管理首页</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>用户信息管理</h3>
			</div>
			<div class="public-content-cont">
				<table class="public-cont-table">
					<tr>
						<th style="width:20%">编号</th>
						<th style="width:20%">账号</th>
						<th style="width:20%">姓名</th>
						<th style="width:20%">权限</th>
						<th style="width:20%">操作</th>
					</tr>
					
					<c:forEach items="${userlist}" var="user">
  					<tr>
    					<td align="center">${user.id }</td>
    					<td align="center">${user.account }</td>
    					<td align="center">${user.username }</td>
    					<td align="center">${user.auth }</td>
    					<td align="center"><a onclick="update(this)">修改</a><br><a onclick="del(this)">删除</a> </td>
				  	</tr>
  					</c:forEach>
					
					
					
				</table>
				<span>${msg }</span>
				<div class="page">
					<form action="" method="get">
						<a href="">首页</a>
						<a href="">上一页</a>
						<a href="">下一页</a>
						第<span style="color:red;font-weight:600"></span>页
						共<span style="color:red;font-weight:600"></span>页
						<input type="text" class="page-input" name="paging">
						<input type="submit" class="page-btn" value="跳转">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>