<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="css/reset.css" />
	<link rel="stylesheet" href="css/content.css" />
<title>新闻管理页</title>
<script type="text/javascript" >
	function load(){
		
	}
	
	function del(obj)
	{	
		
		var tr = obj.parentNode.parentNode;
		var News_id = tr.cells[0].innerHTML;
		tr.parentNode.deleteRow(tr.index);
		location="http://localhost:8080/news_project/delNews?id="+News_id;
	}
	function update(obj)
	{	
		
		var tr = obj.parentNode.parentNode;
		var News_id = tr.cells[0].innerHTML;
		location="http://localhost:8080/news_project/updateNews?id="+News_id;
	}
	function detail(obj)
	{	
		
		var tr = obj.parentNode.parentNode;
		var News_id = tr.cells[0].innerHTML;
		location="http://localhost:8080/news_project/show_detail?id="+News_id;
	}
	
</script>
</head>
<body marginwidth="0" marginheight="0" onload="load()">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">管理首页</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>新闻信息管理</h3>
			</div>
			<div class="public-content-cont">
				<table class="public-cont-table">
					<tr>
						<th style="width:16%">编号</th>
						<th style="width:16%">标题</th>
						<th style="width:16%">描述</th>
						<th style="width:16%">创建时间</th>
						<th style="width:16%">作者</th>
						<th style="width:20%">操作</th>
					</tr>
					
					<c:forEach items="${page.data }" var="news">
  					<tr>
    					<td align="center">${news.id }</td>
    					<td align="center">${news.title }</td>
    					<td align="center">${news.description }</td>
    					<td align="center">${news.createtime }</td>
    					<td align="center">${news.user.username }</td>
    					<td><a onclick="update(this)">修改</a><a onclick="del(this)">删除</a><a onclick="detail(this)">详细内容</a></td>

				  	</tr>
  					</c:forEach>
					
					
					
				</table>
				<div class="page">
					<form action="newsManager" method="get">
						<a href="newsManager?paging=1">首页</a>
						<a href="newsManager?paging=${page.currentPage-1 }">上一页</a>
						<a href="newsManager?paging=${page.currentPage+1 }">下一页</a>
						第<span style="color:red;font-weight:600">${page.currentPage }</span>页
						共<span style="color:red;font-weight:600">${page.size }</span>页
						<input type="text" class="page-input" name="paging">
						<input type="submit" class="page-btn" value="跳转">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>