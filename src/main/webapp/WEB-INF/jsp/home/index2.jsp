<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="<%=request.getContextPath()%>/bootstrap/dist/css/bootstrap.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/bootstrap/css/dashboard.css"
	rel="stylesheet">
<link href="<%=request.getContextPath() %>/bootstrap/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
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
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-controls="navbar">
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
					<li><a class="sidebar-sub-toggle" href="#"><i
							class="ti-menu-alt"></i> 报表 <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul class="test">
							<li><a href="<%=request.getContextPath()%>/epireport/towaitforstore"
								target="main">面检待提交入库</a></li>
						</ul></li>
				</ul>
				
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<iframe class="J_iframe" name="main" width="100%" height="700px"
					src="<%=request.getContextPath()%>/center" frameborder="0"
					data-id="" seamless></iframe>
				<!-- <div class="table-responsive">
			            <table class="table table-striped">
			              <thead>
			                <tr>
			                  <th>#</th>
			                  <th>Header</th>
			                  <th>Header</th>
			                  <th>Header</th>
			                  <th>Header</th>
			                </tr>
			              </thead>
			              <tbody>
			                <tr>
			                  <td>1,001</td>
			                  <td>Lorem</td>
			                  <td>ipsum</td>
			                  <td>dolor</td>
			                  <td>sit</td>
			                </tr>
			                <tr>
			                  <td>1,002</td>
			                  <td>amet</td>
			                  <td>consectetur</td>
			                  <td>adipiscing</td>
			                  <td>elit</td>
			                </tr>
			                <tr>
			                  <td>1,003</td>
			                  <td>Integer</td>
			                  <td>nec</td>
			                  <td>odio</td>
			                  <td>Praesent</td>
			                </tr>
			                <tr>
			                  <td>1,003</td>
			                  <td>libero</td>
			                  <td>Sed</td>
			                  <td>cursus</td>
			                  <td>ante</td>
			                </tr>
			                <tr>
			                  <td>1,004</td>
			                  <td>dapibus</td>
			                  <td>diam</td>
			                  <td>Sed</td>
			                  <td>nisi</td>
			                </tr>
			                <tr>
			                  <td>1,005</td>
			                  <td>Nulla</td>
			                  <td>quis</td>
			                  <td>sem</td>
			                  <td>at</td>
			                </tr>
			                <tr>
			                  <td>1,006</td>
			                  <td>nibh</td>
			                  <td>elementum</td>
			                  <td>imperdiet</td>
			                  <td>Duis</td>
			                </tr>
			                <tr>
			                  <td>1,007</td>
			                  <td>sagittis</td>
			                  <td>ipsum</td>
			                  <td>Praesent</td>
			                  <td>mauris</td>
			                </tr>
			                <tr>
			                  <td>1,008</td>
			                  <td>Fusce</td>
			                  <td>nec</td>
			                  <td>tellus</td>
			                  <td>sed</td>
			                </tr>
			                <tr>
			                  <td>1,009</td>
			                  <td>augue</td>
			                  <td>semper</td>
			                  <td>porta</td>
			                  <td>Mauris</td>
			                </tr>
			                <tr>
			                  <td>1,010</td>
			                  <td>massa</td>
			                  <td>Vestibulum</td>
			                  <td>lacinia</td>
			                  <td>arcu</td>
			                </tr>
			                <tr>
			                  <td>1,011</td>
			                  <td>eget</td>
			                  <td>nulla</td>
			                  <td>Class</td>
			                  <td>aptent</td>
			                </tr>
			                <tr>
			                  <td>1,012</td>
			                  <td>taciti</td>
			                  <td>sociosqu</td>
			                  <td>ad</td>
			                  <td>litora</td>
			                </tr>
			                <tr>
			                  <td>1,013</td>
			                  <td>torquent</td>
			                  <td>per</td>
			                  <td>conubia</td>
			                  <td>nostra</td>
			                </tr>
			                <tr>
			                  <td>1,014</td>
			                  <td>per</td>
			                  <td>inceptos</td>
			                  <td>himenaeos</td>
			                  <td>Curabitur</td>
			                </tr>
			                <tr>
			                  <td>1,015</td>
			                  <td>sodales</td>
			                  <td>ligula</td>
			                  <td>in</td>
			                  <td>libero</td>
			                </tr>
			              </tbody>
			            </table>
          		</div> -->
			</div>
		</div>
	</div>

	<script
		src="<%=request.getContextPath()%>/bootstrap/js/jquery-1.12.4.js"></script>
	<!-- jquery vendor -->
	<script src="<%=request.getContextPath() %>/bootstrap/assets/js/lib/jquery.nanoscroller.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/menubar/sidebar.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
	  $("a.sidebar-toggle").click(function(){
	  $(".test").toggle();
	  });
	});
    </script>

</body>

</html>