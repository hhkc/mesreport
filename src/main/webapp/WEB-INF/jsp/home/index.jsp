<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>综合管理系统</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<%=request.getContextPath()%>/bootstrap/images/icon/favicon.ico" type="image/x-icon">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/chartist/chartist.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/font-awesome.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/themify-icons.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/owl.carousel.min.css"
	rel="stylesheet" />
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/owl.theme.default.min.css"
	rel="stylesheet" />
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/weather-icons.css"
	rel="stylesheet" />
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/menubar/sidebar.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/unix.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/style.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/dist/css/bootstrap.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/bootstrap/css/dashboard.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/font-awesome.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/themify-icons.css"
	rel="stylesheet">
<style type="text/css">
.navbar-inverse {
	background-color: #87CEEB;
	border-color: #080808;
}
</style>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2">
				<div class="navbar navbar-inverse navbar-fixed-top">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse" data-target="#navbar"
								aria-controls="navbar">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#">综合管理系统</a>
						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<ul class="nav navbar-nav navbar-right">
								<li><a href="#">设置</a></li>
								<li><a href="#">简介</a></li>
								<li><a href="#">帮助</a></li>
							</ul>
							<form class="navbar-form navbar-right">
								<input type="text" class="form-control" placeholder="Search...">
							</form>
						</div>
					</div>
				</div>
				<div
					class="sidebar sidebar-hide-to-smallsidebar-shrink sidebar-gestures ">
					<div class="nano">
						<div class="nano-content">
							<ul>
								<li class="label">外延</li>
								<li class="active"><a class="sidebar-sub-toggle"><i
										class="ti-layout-grid4-alt"></i>外延报表 <span
										class="sidebar-collapse-icon ti-angle-down"></span></a>
									<ul>
										<!-- <li><a href="index.html">外延报表</a></li> -->
										<li><a
											href="<%=request.getContextPath()%>/epireport/towaitforstore"
											target="main">面检待入库报表</a>
										</li>
										<li><a
											href="<%=request.getContextPath()%>/epireport/toinventory"
											target="main">仓库待入库报表</a>
										</li>
										<li><a
											href="<%=request.getContextPath()%>/epireport/tooddpiece"
											target="main">零头片库存报表</a>
										</li>
										<li><a
											href="<%=request.getContextPath()%>/epireport/toworkin"
											target="main">在制品库存报表</a>
										</li>
									</ul>
								</li>
								<li>
									<a class="sidebar-sub-toggle"><i
										class="ti-layout-grid4-alt"></i>外延清洗 <span
										class="sidebar-collapse-icon ti-angle-down"></span></a>
										<ul>
											<li><a
											href="<%=request.getContextPath()%>/epireport/towaitforstore"
											target="main">货架绑定</a>
											</li>
										</ul>
								</li>
							</ul>

						</div>
					</div>
				</div>

			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<iframe class="J_iframe" name="main" width="100%" height="700px"
					src="<%=request.getContextPath()%>/center" frameborder="0"
					data-id="" seamless></iframe>
			</div>

		</div>
	</div>

	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/jquery.min.js"></script>
	<!-- jquery vendor -->
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/jquery.nanoscroller.min.js"></script>
	<!-- nano scroller -->
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/menubar/sidebar.js"></script>
	<%-- <script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/preloader/pace.min.js"></script> --%>
	<!-- sidebar -->
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/bootstrap.min.js"></script>
	<!-- bootstrap -->
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/weather/jquery.simpleWeather.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/weather/weather-init.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/circle-progress/circle-progress.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/circle-progress/circle-progress-init.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/chartist/chartist.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/chartist/chartist-init.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/sparklinechart/jquery.sparkline.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/sparklinechart/sparkline.init.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/scripts.js"></script>

</body>

</html>