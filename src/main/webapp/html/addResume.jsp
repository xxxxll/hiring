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
	</div>
	<div class="container-fluid recruit-manage-add"> 
		<h3 class="ui-user-info">
			<span>个人信息</span>
			<span class="glyphicon glyphicon-pencil ui-edit-icon"></span>
		</h3>
		<ul class="container-fluid ui-userInfo-content unEdit">
			<li class="row">
				<label class="col-md-2">姓名：</label>
				<span class="col-md-5">
					<input type="text" class="form-control" id="name" disabled placeholder="姓名"/>
				</span>
				<span class="col-md-5">
					<select class="form-control" disabled id="gender">
						<option value="M" selected>男</option>
						<option value="F">女</option>
					</select>
				</span>
			</li>
			<li class="row">
				<label class="col-md-2">年龄：</label>
				<span class="col-md-10">
					<input type="number" class="form-control" id="age" disabled/>
				</span>
			</li>
			<li class="row">
				<label class="col-md-2">手机号码：</label>
				<span class="col-md-10">
					<input type="number" class="form-control" id="phone" maxlength="11" disabled placeholder="手机号"/>
				</span>
			</li>
			<li class="row">
				<label class="col-md-2">电子邮箱：</label>
				<span class="col-md-10">
					<input type="email" class="form-control" id="email" disabled placeholder="电子邮箱"/>
				</span>
			</li>
			<li class="row">
				<label class="col-md-2">居住-地：</label>
				<span class="col-md-10">
					<input type="text" class="form-control" id="homeAddr" disabled placeholder="居住地"/>
				</span>
			</li>
			<li class="row">
				<label class="col-md-2">户籍-地：</label>
				<span class="col-md-10">
					<input type="text" class="form-control" id="household" disabled placeholder="户籍地"/>
				</span>
			</li>
			<li class="row">
				<label class="col-md-2">证件号码：</label>
				<span class="col-md-5">
					<input type="text" class="form-control" id="identification" maxlength="18" disabled placeholder="证件号码"/>
				</span>
				<span class="col-md-5">
					<select class="form-control" disabled id="identificationType">
						<option value="身份证" selected>身份证</option>
						<option value="护照">护照</option>
					</select>
				</span>
			</li>
		</ul>
		<h3 class="ui-user-info ui-education-info">
			<span>教育信息</span>
			<span class="glyphicon glyphicon-pencil ui-edit-icon"></span>
		</h3>
		<div id="resumeEdus">
		</div>
		<ul class="container-fluid">
			<li class="row"> 
				<span class="col-md-12">
					<button type="button" class="btn btn-success" id="resumeEdusBtn">继续添加</button>
				</span>
			</li>
		</ul>
		<h3 class="ui-user-info ui-education-info">
			<span>工作经验</span>
			<span class="glyphicon glyphicon-pencil ui-edit-icon"></span>
		</h3>
		<div id="jobExperience"></div>
		<ul class="container-fluid">
			<li class="row"> 
				<span class="col-md-12">
					<button type="button" class="btn btn-success" id="jobExperienceBtn">继续添加</button>
				</span>
			</li>
		</ul>
		<h3 class="ui-user-info ui-education-info">
			<span>求职意向</span> 
			<span class="glyphicon glyphicon-trash ui-edit-icon"></span>
			<span class="glyphicon glyphicon-pencil ui-edit-icon"></span>
		</h3>
		<ul class="container-fluid ui-objective-content unEdit">
			<li class="row">
			<span class="col-md-2 ui-job-title">自我评价</span>
				<span class="col-md-10">
					<textarea class="form-control" disabled id="selfIntroduction">
					</textarea>
				</span> 
			</li>
			<li class="row">
				<label class="col-md-2">期望职位：</label>
				<span class="col-md-10">
					<select class="form-control" disabled id="jobIntension">
						<option value="">请选择</option>
					</select>
				</span>
			</li>
			<li class="row">
				<span class="col-md-2 ui-job-title">期望薪资</span>
				<span class="col-md-10">
					<select class="form-control" disabled id="salaryExpectation">
						<option value="3000-5000">3000-5000</option>
						<option value="5000-8000">5000-8000</option>
						<option value="8000-10000">8000-10000</option>
						<option value="10000-15000">10000-15000</option> 
						<option value="15000-20000">15000-20000</option> 
						<option value="20000-25000">20000-25000</option> 
						<option value="25000以上">25000以上</option> 
					</select>
				</span> 
			</li>
		</ul>
		<h3 class="ui-user-info ui-education-info">
			<span>项目经验</span> 
			<span class="glyphicon glyphicon-trash ui-edit-icon"></span>
			<span class="glyphicon glyphicon-pencil ui-edit-icon"></span>
		</h3>
		<div id="resumePros"></div>
		<ul class="container-fluid">
			<li class="row"> 
				<span class="col-md-12">
					<button type="button" class="btn btn-success" id="resumeProsBtn">继续添加</button>
				</span>
			</li>
		</ul>
		<ul class="container-fluid ui-objective-content">
			<li class="row"> 
				<span class="col-md-12">
					<button type="button" class="btn btn-primary ui-btn" onclick="saveOrUpdateResume();">提交</button>
				</span>
			</li>
		</ul>
	</div>
	<script type="text/javascript" src="<%=request.getContextPath() %>/styles/js/addOrUpdate.js"></script>
</body>
</html>











