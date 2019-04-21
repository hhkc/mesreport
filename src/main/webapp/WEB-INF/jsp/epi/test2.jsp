<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/chartist/chartist.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/font-awesome.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/themify-icons.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/owl.carousel.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/owl.theme.default.min.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/weather-icons.css" rel="stylesheet" />
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/unix.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/style.css" rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/bootstrap/dist/css/bootstrap.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/bootstrap/css/dashboard.css"
	rel="stylesheet">
  <link href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/bootstrap/assets/css/lib/themify-icons.css" rel="stylesheet">
</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">

				<ul class="nav nav-sidebar">
					<li class="active"><a
						href="<%=request.getContextPath()%>/center" target="main">首页
							<span class="sr-only">(current)</span>
					</a></li>
					<!--     <li><a href="#">Analytics</a></li>
		            <li><a href="#">Export</a></li> -->
				</ul>
				<ul class="nav nav-sidebar">
					<li><a class="sidebar-toggle" href="#"><i
							class="ti-menu-alt"></i> 报表 <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul class="test">
							<li><a href="<%=request.getContextPath()%>/epireport/towaitforstore"
								target="main">面检待提交入库</a></li>
						</ul></li>
						
						 <li class="active"><a class="sidebar-sub-toggle"><i class="ti-home"></i> Dashboard <span class="sidebar-collapse-icon ti-angle-down"></span></a>
                        <ul>
                            <li><a href="index.html">Dashboard 1</a></li>
                            <li><a href="index-v1.html">Dashboard 2</a></li>
                            <li><a href="index-school.html">Dashboard 3</a></li>
                            <li><a href="index-restaurant.html">Dashboard 4</a></li>
                        </ul>
                    </li>
				</ul>
				
			</div>
		</div>
		</div>
		
	<!-- <div class="header">
        <div class="pull-left">
            <div class="logo"><a href="index.html"><img src="assets/images/logo.png" alt="" /><span>Adminity</span></a></div>
            <div class="hamburger sidebar-toggle">
                <span class="line"></span>
                <span class="line"></span>
                <span class="line"></span>
            </div>
        </div> -->


	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/jquery.min.js"></script>
	<!-- jquery vendor -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/jquery.nanoscroller.min.js"></script>
	<!-- nano scroller -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/menubar/sidebar.js"></script>
	<%-- <script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/preloader/pace.min.js"></script> --%>
	<!-- sidebar -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/bootstrap.min.js"></script>
	<!-- bootstrap -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/weather/jquery.simpleWeather.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/weather/weather-init.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/circle-progress/circle-progress.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/circle-progress/circle-progress-init.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/chartist/chartist.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/chartist/chartist-init.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/sparklinechart/jquery.sparkline.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/sparklinechart/sparkline.init.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/owl-carousel/owl.carousel.min.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/owl-carousel/owl.carousel-init.js"></script>
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/scripts.js"></script>



</body>
</html>