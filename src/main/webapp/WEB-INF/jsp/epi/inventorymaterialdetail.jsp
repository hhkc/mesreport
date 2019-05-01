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
	<div class="panel panel-default">
		<div class="panel-heading">仓库待入库查询条件</div>
		<div class="panel-body form-group" style="margin-bottom: 0px;">
			<label class="col-sm-1 control-label"
				style="text-align: right; margin-top: 5px">任务单：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" name="Name" id="search_task" />
			</div>
			<label class="col-sm-1 control-label"
				style="text-align: right; margin-top: 5px">批号：</label>
			<div class="col-sm-2"> 
				<input type="text" class="form-control" name="Name" id="search_lot" />
			</div>
			<div class="col-sm-1">
				<button class="btn btn-primary pull-right" id="search_btn">查询</button>			
			</div>
			<div class="col-sm-1">
				<a  class="btn btn-success pull-right" onclick="$('#mytab').tableExport({type:'excel',
                        mso: {
                            styles:['background-color',
                                    'border-top-color', 'border-left-color', 'border-right-color', 'border-bottom-color',
                                    'border-top-width', 'border-left-width', 'border-right-width', 'border-bottom-width',
                                    'border-top-style', 'border-left-style', 'border-right-style', 'border-bottom-style',
                                    'color']
                            }});">导出excel</a>
			</div>
		</div>
	</div>
<table id="mytab" class="table table-hover table-condensed">
</table>

<script type="text/javascript">
//查询按钮事件

$("#mytab").bootstrapTable('destroy');
$('#mytab').bootstrapTable({
	method : 'get',
	url : "epireport/toinventory",//请求路径
	striped : true, //是否显示行间隔色
	pageNumber : 1, //初始化加载第一页
	pagination : true,//是否分页
	sidePagination : 'client',//server:服务器端分页|client：前端分页
	pageSize : 15,//单页记录数
	cache: false,   //不缓存
	pageList : [ 5, 10, 20, 30, 5000 ],//可选择单页记录数
	showRefresh : false,//刷新按钮
	queryParamsType: "",
	queryParams : function(params) {//上传服务器的参数
		var temp = {//如果是在服务器端实现分页，limit、offset这两个参数是必须的
				 material_number:$('#search_task').val().trim(),
				 lot_id:$('#search_lot').val().trim()
		};
		return temp;
	},
	columns : [ {
	    field: "SerialNumber",
	    title: "序号",
	    formatter: function (value, row, index) {
	        return index+1;
	    }
	},{
		title : '客户',
		field : 'customer_name',
		sortable : true
	}, {
		title : '任务单',
		field : 'material_number',
		sortable : true
	}, {
		title : '盒号',
		field : 'sub_id',
	}, 
	 {
		title : '批号',
		field : 'lot_id',
	},{
		title : '数量',
		field : 'qty',
		//formatter : formatSex,//对返回的数据进行处理再显示
	},
	{
		title : '状态',
		field : 'status',
		//formatter : formatSex,//对返回的数据进行处理再显示
	},
	{
		title : '时间',
		field : 'stoer_date',
		//formatter : formatSex,//对返回的数据进行处理再显示
	},{
		title : '操作',
		field : 'id',
		formatter : operation,//对资源进行操作
	} ]
})
 
//value代表该列的值，row代表当前对象
function formatSex(value, row, index) {
	return value == 1 ? "男" : "女";
	//或者 return row.sex == 1 ? "男" : "女";
}
 
//删除、编辑操作
function operation(value, row, index) {
	var htm = "<button>查看详情</button>"
	return htm;
}


 
$('#search_btn').click(function() {
	
	$('#mytab').bootstrapTable('refresh', {
		url : '<%=request.getContextPath()%>/epireport/inventorymaterialdetail'				
	});
	
})


	
</script>
</body>
</html>