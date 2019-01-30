<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻详细内容</title>
</head>
<body>
	<div align="center">
	<h2 align="center">${news_detail.title }</h2>
	<span align="center">作者${news_user.username }</span><br>
	<span align="center">时间${news_detail.createtime }</span>
	</div>
	<div align="center" width="80%">
	<p align="center">${news_detail.content }</p>
	
	</div>
	
	
	
</body>
</html>