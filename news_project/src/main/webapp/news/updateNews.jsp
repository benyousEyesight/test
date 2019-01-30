<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>修改新闻</title>
	<link rel="stylesheet" href="../css/reset.css" />
	<link rel="stylesheet" href="../css/content.css" />
</head>
<body marginwidth="0" marginheight="0">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">管理首页</a>></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>修改网站配置</h3>
			</div>
			<div class="public-content-cont">
			<form action="/news_project/saveUpdateNews" method="post">
				<div class="form-group">
					<label for="">新闻编号</label>
					<input class="form-input-txt" type="text" name="news_id" value="${News.id }" />
				</div>
				<div class="form-group">新闻标题
				  <input class="form-input-txt" type="text" name="title" value="${News.title }" />
				</div>
				<div class="form-group">创建时间
				  <input class="form-input-txt" type="text" name="createtime" value="${News.createtime }" />
				</div>
				
				<div class="form-group">简述
				  <input class="form-input-txt" type="text" name="description" value="${News.description }" />
				</div>
				
				<div class="form-group">作者编号
				  <input class="form-input-txt" type="text" name="author" value="${News.author }" />
				</div>
				
				<div class="form-group">
					<label for="">新闻的分类</label>
					
                   <select class="form-input-txt" name="type" value="${News.type }">
                   	<option value="ty" >体育</option>
                   	<option value="yl" >娱乐</option>
                   	<option value="sz" >时政</option>
                   	<option value="gj" >国际</option>
                   	<option value="ms" >民生</option>
                   	<option value="nba" >NBA</option>
                   	<option value="life" >生活</option>
                   </select>
				</div>
		
			
<!-- 					<div class="file"><input type="file" class="form-input-file" />选择文件</div> -->
<!-- 					<div class="file"><input type="submit" class="form-input-file"/>上传</div> -->
					
				</div>
				
				<div class="clearfix"></div>
		
				
				<div class="form-group">
					<label for="">新闻的内容</label>
					<textarea id="editor_id" name="content"  class="form-input-textara" style="width:700px;height:300px;" value="${News.content }" >
					</textarea> 
				</div>
				<div class="form-group" style="margin-left:150px;">
					<input type="submit" class="sub-btn" value="提  交" />
					<input type="reset" class="sub-btn" value="重  置" />
				</div>
				</form>
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