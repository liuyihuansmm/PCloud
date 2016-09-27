<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>左侧导航</title>
<head>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	overflow-x: hidden;
}

html, body {
	height: 100%;
}

img {
	border: none;
}

* {
	font-family: '微软雅黑';
	font-size: 12px;
	color: #626262;
}

dl, dt, dd {
	display: block;
	margin: 0;
}

a {
	text-decoration: none;
}

#bg {
	background-image: url(images/content/dotted.png);
}

.container {
	width: 160px;
	height: 100%;
	margin: auto;
}

/*left*/
.leftsidebar_box {
	width: 160px;
	height: auto !important;
	overflow: visible !important;
	position: fixed;
	height: 100% !important;
	background-color: #3992d0;
}

.line {
	height: 2px;
	width: 100%;
	background-image: url(images/left/line_bg.png);
	background-repeat: repeat-x;
}

.leftsidebar_box dt {
	padding-left: 40px;
	padding-right: 10px;
	background-repeat: no-repeat;
	background-position: 10px center;
	color: #f5f5f5;
	font-size: 14px;
	position: relative;
	line-height: 48px;
	cursor: pointer;
}

.leftsidebar_box dd {
	background-color: #317eb4;
	padding-left: 40px;
}

.leftsidebar_box dd a {
	color: #f5f5f5;
	line-height: 20px;
}

.leftsidebar_box dt img {
	position: absolute;
	right: 10px;
	top: 20px;
}

.system_log dt {
	background-image: url(images/left/system.png)
}

.custom dt {
	background-image: url(images/left/custom.png)
}

.channel dt {
	background-image: url(images/left/channel.png)
}

.app dt {
	background-image: url(images/left/app.png)
}

.cloud dt {
	background-image: url(images/left/cloud.png)
}

.syetem_management dt {
	background-image: url(images/left/syetem_management.png)
}

.source dt {
	background-image: url(images/left/source.png)
}

.statistics dt {
	background-image: url(images/left/statistics.png)
}

.leftsidebar_box dl dd:last-child {
	padding-bottom: 10px;
}
</style>

</head>

<body id="bg">

	<div class="container">

		<div class="leftsidebar_box">
			<div class="line"></div>
			<dl class="system_log">
				<dt onClick="changeImage()">
					组织管理<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">党组织管理</a>
				</dd>
				<dd>
					<a href="#" target="right">党员信息管理</a>
				</dd>
			</dl>

			<dl class="custom">
				<dt onClick="changeImage()">
					组织发展模块<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">申请人管理</a>
				</dd>
				<dd>
					<a href="#" target="right">党课培训</a>
				</dd>
			</dl>

			<dl class="channel">
				<dt>
					党费管理<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">党费管理</a>
				</dd>
				<dd>
					<a href="#" target="right">党费生成</a>
				</dd>
				<dd>
					<a href="#" target="right">党费统计</a>
				</dd>
			</dl>

			<dl class="app">
				<dt onClick="changeImage()">
					组织管理<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">三会一课记录</a>
				</dd>
				<dd>
					<a href="#" target="right">三会一课记录统计</a>
				</dd>
				<dd>
					<a href="#" target="right">专题活动</a>
				</dd>
			</dl>

			<dl class="cloud">
				<dt>
					党建知识库<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">知识库</a>
				</dd>
			</dl>

			<dl class="syetem_management">
				<dt>
					信息沟通<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">新闻</a>
				</dd>
				<dd>
					<a href="#" target="right">通知</a>
				</dd>
				<dd>
					<a href="#" target="right">党建信箱</a>
				</dd>
			</dl>

			<dl class="source">
				<dt>
					系统管理<img src="images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#" target="right">权限管理</a>
				</dd>
				<dd>
					<a href="#" target="right">角色管理</a>
				</dd>
				<dd>
					<a href="#" target="right">密码修改</a>
				</dd>
			</dl>

		</div>

	</div>

	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript">
		$(".leftsidebar_box dt").css({
			"background-color" : "#3992d0"
		});
		$(".leftsidebar_box dt img").attr("src", "images/left/select_xl01.png");
		$(function() {
			$(".leftsidebar_box dd").hide();
			$(".leftsidebar_box dt").click(
					function() {
						$(".leftsidebar_box dt").css({
							"background-color" : "#3992d0"
						})
						$(this).css({
							"background-color" : "#317eb4"
						});
						$(this).parent().find('dd').removeClass("menu_chioce");
						$(".leftsidebar_box dt img").attr("src",
								"images/left/select_xl01.png");
						$(this).parent().find('img').attr("src",
								"images/left/select_xl.png");
						$(".menu_chioce").slideUp();
						$(this).parent().find('dd').slideToggle();
						$(this).parent().find('dd').addClass("menu_chioce");
					});
		})
	</script>

	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei';">
		<p>ICP备案：蜀ICP备05030931号 技术支持：国药控股四川医药股份有限公司信息部</p>
	</div>
</body>
</html>