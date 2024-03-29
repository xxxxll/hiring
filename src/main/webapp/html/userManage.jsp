<%@ page language="java" contentType="text/html; charset=UTF-8"import="com.hiring.bean.obj.UserObj" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
	<title>招聘系统</title>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="common.jsp"></jsp:include>
		<div class="container-fluid recruit-manage">
			<div class="row container-fluid ui-search-box">
				<form class="form-inline">
				   <div class="form-group">
				     <label for="name">用户名</label>
				     <input type="text" class="form-control" id="userNameSearch" placeholder="输入查询用户名">
				   </div>
				   <button type="button" class="btn btn-primary" id="userSearchList">查询</button>
				</form>
			</div>
			<table class="table table-striped table-hover"> 
				<tr class="customer-thead">
					<th width="5%">序号</th>
					<th width="70%">用户名</th> 
					<th width="25%">操作</th> 
				</tr>
				<tbody id="userTbody">
				
				</tbody>
<!-- 				<tr class="customer-tbody"> -->
<!-- 					<td width="5%">1</td> -->
<!-- 					<td width="10%">客户群编号</td> -->
<!-- 					<td width="15%">客户群名称</td> -->
<!-- 					<td width="13%">创建人</td> -->
<!-- 					<td width="12%">更新周期</td> -->
<!-- 					<td width="12%" class="color-yellow">状态</td> -->
<!-- 					<td width="8%" class="color-yellow">规模</td> -->
<!-- 					<td width="10%" class="color-yellow">数据日期</td> -->
<!-- 					<td width="15%" class="color-yellow"> -->
<!-- 						<button class="btn btn-defaul">查看</button> -->
<!-- 						<button class="btn btn-defaul">删除</button> -->
<!-- 					</td>  -->
<!-- 				</tr> -->
			</table>
			<nav class="nav-right">
				<div class="ui-page-num">当前第<span id="currentPage">1</span>页,共<span id="totalPage"></span>页</div>
				<ul class="pagination">
					<li class="disabled">
					  <a href="javascript:void(0);" aria-label="Previous" id="userPrcv">
						<span aria-hidden="true">上一页</span>
					  </a>
					</li>
					<li>
					  <a href="javascript:void(0);" aria-label="Next" id="userNext">
						<span aria-hidden="true">下一页</span>
					  </a>
					</li>
				</ul>
			</nav>
		</div>
	</div>
	<script type="text/javascript" src="<%=request.getContextPath() %>/styles/js/loadList.js"></script>
</body>
</html>











