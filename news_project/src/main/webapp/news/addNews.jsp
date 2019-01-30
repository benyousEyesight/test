<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>添加新闻</title>
	<link rel="stylesheet" href="../css/reset.css" />
	<link rel="stylesheet" href="../css/content.css" />
</head>
<body marginwidth="0" marginheight="0">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="http://localhost:8080/news_project/newsManager">管理首页></a><a>添加新闻信息</a></a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>修改网站配置</h3>
			</div>
			<div class="public-content-cont">
			<form action="/news_project/addNews" method="post">
				<div class="form-group">
					<label for="">新闻编号</label>
					<input class="form-input-txt" type="text" name="news_id" value="" />
				</div>
				<div class="form-group">新闻标题
				  <input class="form-input-txt" type="text" name="title" value="" />
				</div>
				<div class="form-group">创建时间
				  <input class="form-input-txt" type="text" name="createtime"  />
				</div>
				
				<div class="form-group">简述
				  <input class="form-input-txt" type="text" name="description"  />
				</div>
				
				<div class="form-group">作者编号
				  <input class="form-input-txt" type="text" name="author" value="${user.id}" />
				</div>
				
				<div class="form-group">
					<label for="">新闻的分类</label>
					
                   <select class="form-input-txt" name="type">
                   	<option value="0" >体育</option>
                   	<option value="1" >娱乐</option>
                   	<option value="2" >时政</option>
                   	<option value="3" >国际</option>
                   	<option value="4" >民生</option>
                   	<option value="5" >NBA</option>
                   	<option value="6" >生活</option>
                   </select>
				</div>
		
			
<!-- 					<div class="file"><input type="file" class="form-input-file" />选择文件</div> -->
<!-- 					<div class="file"><input type="submit" class="form-input-file"/>上传</div> -->
					
				</div>
				
				<div class="clearfix"></div>
		
				
				<div class="form-group">
					<label for="">新闻的内容</label>
					<textarea id="editor_id" name="content"  class="form-input-textara" style="width:700px;height:300px;">
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