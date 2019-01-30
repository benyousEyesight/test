<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="css/reset.css" />
	<link rel="stylesheet" href="css/content.css" />
<title>用户管理页</title>
<script type="text/javascript" >
	
	
</script>
</head>
<body marginwidth="0" marginheight="0" onload="load()">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">用户管理</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>添加用户信息</h3>
			</div>
			<div class="public-content-cont">
				<table class="public-cont-table">
					<tr>
						<th style="width:20%">编号</th>
						<th style="width:20%">账号</th>
						<th style="width:20%">密码</th>
						<th style="width:20%">姓名</th>
						<th style="width:20%">权限</th>
					</tr>
					
					<form action="usermanager/saveUser" method="post">
  					<tr>
    					<td align="center"><input type="text" name="id" value="${u_user.id }"></td>
    					<td align="center"><input type="text" name="account" value="${u_user.account }"></td>
    					<td align="center"><input type="password" name="password" value="${u_user.password }" ></td>
    					<td align="center"><input type="text" name="username" value="${u_user.username }" ></td>
    					<td align="center">
    					
    						<select class="form-input-txt" name="auth" value="${u_user.auth }">
    							<option value="admin">admin</option>
                   				<option value="0" >体育</option>
                   				<option value="1" >娱乐</option>
                   				<option value="2" >时政</option>
                   				<option value="3" >国际</option>
                   				<option value="4" >民生</option>
                   				<option value="5" >NBA</option>
                   				<option value="6" >生活</option>
                   			</select>
    					
    					</td>
				  	</tr>
				  	<tr><input type="submit" value="保存"></tr>
					</form>
					
					
				</table>
					<span>${msg }</span>
			</div>
		</div>
	</div>
</body>
</html>