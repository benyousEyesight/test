<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>主页</title>
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/public.css">
</head>
<body>
	<div class="public-header-warrp">
	<div class="public-header">
		<div class="content">
			<div class="public-header-logo"><a href=""><i>LOGO</i>
			<h3>BENYOU</h3></a></div>
			<div class="public-header-admin fr">
				<p class="admin-name">${user.username } 您好！</p>
				<div class="public-header-fun fr">
					<a href="" class="public-header-man">管理</a>
					<a href="logout" class="public-header-loginout">安全退出</a>	
				</div>
			</div>
		</div>
	</div>
</div>
<div class="clearfix"></div>
<!-- 内容展示 -->
<div class="public-ifame mt20">
	<div class="content">
	<!-- 内容模块头 -->
		
		<div class="clearfix"></div>
		<!-- 左侧导航栏 -->
		<div class="public-ifame-leftnav">
			<div class="public-title-warrp">
				<div class="public-ifame-title ">
					<a href="">首页</a>
				</div>
			</div>
			<ul class="left-nav-list">
				<li class="public-ifame-item">
					<a href="">系统管理</a>
					<div class="ifame-item-sub">
						<ul>
							<li class="active"><a href="usermanager/adduser.jsp" target="content">添加用户</a></li>
							<li><a href="usermanager/show" target="content">用户管理</a></li>
							<li><a href="usermanager/queryUser.jsp" target="content">用户的查询</a></li>
						</ul>
					</div>
				</li>
				<li class="public-ifame-item">
					<a href="">新闻管理</a>
					<div class="ifame-item-sub">
						<ul>
							<li><a href="news/addNews.jsp" target="content">新闻的添加</a>|</li>
							<li><a href="main.jsp" target="content">新闻管理</a></li>
                            <li><a href="news/queryNews.jsp" target="content">新闻查询</a></li>
						</ul>
					</div>
				</li>
				
				
			</ul>
		</div>
		<!-- 右侧内容展示部分 -->
		<div class="public-ifame-content">
		<iframe name="content" src="newsManager" frameborder="0" id="mainframe" scrolling="yes" marginheight="0" marginwidth="0" width="100%" style="height: 700px;"></iframe>
		</div>
	</div>
</div>
<script src="js/jquery.min.js"></script>
<script>
$().ready(function(){
	var item = $(".public-ifame-item");

	for(var i=0; i < item.length; i++){
		$(item[i]).on('click',function(){
			$(".ifame-item-sub").hide();
			if($(this.lastElementChild).css('display') == 'block'){
				$(this.lastElementChild).hide()
				$(".ifame-item-sub li").removeClass("active");
			}else{
				$(this.lastElementChild).show();
				$(".ifame-item-sub li").on('click',function(){
					$(".ifame-item-sub li").removeClass("active");
					$(this).addClass("active");
				});
			}
		});
	}
});
</script>
	
	
</body>
</html>