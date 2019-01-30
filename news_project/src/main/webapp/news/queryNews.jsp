<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html">
<html>
<head>
<meta >
<base href="<%=basePath %>">
<title>查询新闻信息</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/content.css" />
<script type="text/javascript" src="../js/jquery-1.8.1.min.js"></script>

<script type="text/javascript">
function detail(obj)
{	
	var tr = obj.parentNode.parentNode;
	var News_id = tr.cells[0].innerHTML;
	location="http://localhost:8080/news_project/show_detail?id="+News_id;
}
</script>

</head>
<body marginwidth="0" marginheight="0">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="http://localhost:8080/news_project/newsManager">管理首页</a>><a>查询新闻信息</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>查询新闻记录</h3>
			</div>
			<div class="public-content-cont">
				
				
				<div class="form-group">
				<form action="news/queryNews">
				  <input class="form-input-txt" type="text" name="param"/>
				  <input class="form-input-txt" type="submit" value="查询"/>
				</form>
				</div>
			</div>
			<hr>
			<div class="public-content-cont">
				<table class="public-cont-table" id="select">
					<tr>
						<th style="width:20%">编号</th>
						<th style="width:20%">标题</th>
						<th style="width:20%">描述</th>
						<th style="width:20%">创建时间</th>
						<th style="width:20%">操作</th>
					</tr>
					
					<c:forEach items="${newsList}" var="news">
  					<tr>
    					<td align="center">${news.id }</td>
    					<td align="center">${news.title }</td>
    					<td align="center">${news.description }</td>
    					<td align="center">${news.createtime }</td>
    					<td><a onclick="detail(this)">详细内容</a></td>
				  	</tr>
  					</c:forEach>
				</table>
				
			</div>
		</div>
	</div>
<script src="../kingediter/kindeditor-all-min.js"></script>
<script>
	 KindEditor.ready(function(K) {
                window.editor = K.create('#editor_id');
        });
</script>
</body>
</html>