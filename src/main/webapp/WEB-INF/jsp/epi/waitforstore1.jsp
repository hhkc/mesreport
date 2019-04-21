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
<link
	href="<%=request.getContextPath()%>/bootstrap/dist/css/bootstrap.css"
	rel="stylesheet">

<link
	href="<%=request.getContextPath()%>/bootstrap/css/bootstrap-table.css"
	rel="stylesheet">
<script
	src="<%=request.getContextPath()%>/bootstrap/js/jquery-1.12.4.js"></script>
<script
	src="<%=request.getContextPath()%>/bootstrap/assets/js/lib/bootstrap.min.js"></script>
<script
	src="<%=request.getContextPath()%>/bootstrap/js/bootstrap-table.js"></script>
<script
	src="<%=request.getContextPath()%>/bootstrap/js/bootstrap-table-zh-CN.js"></script>
<%-- <script
	src="<%=request.getContextPath()%>/bootstrap/js/bootstrap-table-export-1.11.0.min.js"></script> --%>
	<script
	src="<%=request.getContextPath()%>/bootstrap/js/tableExport.js"></script>
</head>
<body>
	

	<div class="table-container">
		<div class="row">
			<div class="col-sm-10 col-md-11">
				<form class="well form-search" action="<%=request.getContextPath()%>/epireport/waitForStore" method="get">
					<!-- <label for="name">选择内容</label> -->
					    <select class="input-medium search-query" name="reportName">
					      <option value="1">在制品查询</option>
					      <option value="2">面检待入库查询</option>
					      <option value="3">仓库待入库</option>
					      <option value="4">零头库存查询</option>
					    </select>
					<!-- <input type="text" class="input-medium search-query"> -->
					<a  class="btn btn-success pull-right" onclick="$('#mytable').tableExport({type:'excel',
                        mso: {
                            styles:['background-color',
                                    'border-top-color', 'border-left-color', 'border-right-color', 'border-bottom-color',
                                    'border-top-width', 'border-left-width', 'border-right-width', 'border-bottom-width',
                                    'border-top-style', 'border-left-style', 'border-right-style', 'border-bottom-style',
                                    'color']
                            }});">导出excel</a>
					<button type="submit" class="btn btn-info pull-right">查询</button>

				</form>
			
				<table id="mytable" class="table table-bordered table-striped table-condensed"
					data-mobile-responsive="false" data-height="600"
					data-icon-size="outline" data-toolbar="#toolbar2">
					<thead>
						<tr>
							<th style="text-align: center;">序号</th>
							<th style="text-align: center;">客户</th>
							<th style="text-align: center;">炉次</th>
							<th style="text-align: center;">盒号</th>
							<th style="text-align: center;">数量</th>
							<!-- <th style="text-align: center;">操作</th> -->
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${waitForStorePOs}" var="waitForStore"
							varStatus="status">
							<tr>
								<td style="text-align: center;">${status.index+1}</td>
								<td style="font-size: 12px;">${waitForStore.customerName}</td>
								<td style="font-size: 12px;">${waitForStore.lot_id}</td>
								<td style="font-size: 12px;">${waitForStore.sub_id}</td>
								<td style="font-size: 12px;">${waitForStore.sub_qty}</td>
							</tr>

						</c:forEach>
					</tbody>

				</table>
				<c:if test="${waitForStorePOs!=null && fn:length(waitForStorePOs) > 0}">
					<nav aria-label="Page navigation" style="text-align: center;">
							<ul class="pagination">
								<li><a href="<%=request.getContextPath()%>/epireport/waitForStore?action=pre"  aria-label="Previous"> <span
										aria-hidden="true" >上一页</span>
								</a></li>
				<!-- 				<li><a class="active" href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li> -->
								<li><a href="<%=request.getContextPath()%>/epireport/waitForStore?action=nex" aria-label="Next"> <span
										aria-hidden="true">下一页</span>
								</a></li>
							</ul>
							</nav>
				</c:if>
				
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(".pagination li").click(function(){
	              $(".pagination li").removeClass("active");
	              $(this).addClass("active");
		})
	</script>

</body>
</html>