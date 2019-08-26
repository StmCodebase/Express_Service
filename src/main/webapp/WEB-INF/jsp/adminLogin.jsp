<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>管理员登录</title>
	<meta 	charset="utf-8">
	<meta 	name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1，user-scalable=no">
	<meta 	http-equiv="X-UA-Compatible" content="IE=edge">
	<meta 	name="description" content="">
	<meta 	name="author" content="">
	<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plug/layer/layer.js"></script>
	<link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/layer/skin/default/layer.css">
	<link href="${pageContext.request.contextPath }/plug/css/style.css" rel='stylesheet' type='text/css' />
	<link href='#css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
	<link href='#css?family=Exo+2' rel='stylesheet' type='text/css'>
	<script type="application/x-javascript">
		addEventListener("load", function() {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	
		
</head>
<body>
	<script>
		$(document).ready(function(c) {
			$('.close').on('click', function(c) {
				$('.login-form').fadeOut('slow', function(c) {
					$('.login-form').remove();
				});		
			});
		});
	</script>
	<h1>Welcome to the administrator entrance</h1>
		<div class="login-form">
			<div class="tabtext">
				<br />
				管&nbsp;理&nbsp;员&nbsp;登&nbsp;录
			</div>
			<div class="clear"> </div>
			<div class="avtar">
				<img src="${pageContext.request.contextPath}/plug/img/Admin/avtar.png"/>
			</div>
			
			<form action="UserController/AdminLog" id="loginForm" method="post" role="form">
				<input type="text" class="text" placeholder="请输入账号" id="accNum" name="accNum">
				<div class="key">
					<input type="password" placeholder="请输入密码" id="accPwd" name="accPwd">
				</div>

				<div class="signin">
					<input type="button" value="登录" onclick="doAjaxLogin()">
				</div>
			</form>
			
		</div>
		<div class="copy-rights">

		</div>
		
		<script type="text/javascript">
	
		function dologin() {
			//var accNum = document.forms["loginForm"]["accNum"].value;
			//var accPwd = document.forms["loginForm"]["accPwd"].value;
			
			if(accNum == null || accNum == "") {
				layer.msg("请输入姓名！", {time:2000, icon:5, shift:6}, function(){
                });
				return false;
			} else if(accPwd == null || accPwd == "") {
				layer.msg("请输入密码！", {time:2000, icon:5, shift:6}, function(){
                });
				return false;
			}
		}
		
		function doAjaxLogin(){
			//var accNum = document.forms["loginForm"]["accNum"].value;
			//var accPwd = document.forms["loginForm"]["accPwd"].value;
			var accNum = $("#accNum").val();
			var accPwd = $("#accPwd").val();
			if(accNum == null || accNum == "") {
				layer.msg("请输入姓名！", {time:2000, icon:5, shift:6}, function(){
                });
				return;
			} else if(accPwd == null || accPwd == "") {
				layer.msg("请输入密码！", {time:2000, icon:5, shift:6}, function(){
                });
				return;
			}
			
			
			var loadingIndex = null;
			$.ajax({
	        	type : "POST",
	        	url  : "doAdminLogin",
	        	//async: false,
	        	data : {
	        		"accNum" : accNum,
	        		"accPwd"  : accPwd
	        	},
	        	beforeSend : function(){
	        		loadingIndex = layer.msg('处理中', {icon: 16});
	        	},
	        	success : function(result) {
	        		layer.close(loadingIndex);
	        		var resObj = JSON.parse(result);
	        		
	        		if (resObj.result) {
	        			window.location.href = "adminMain";
	        		} else {
	                    layer.msg("用户登录账号或密码不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
	                    	
	                    });
	        		}
	        	},
	        	error : function(err){
	        		
	        	}
	        });
		}
		//onfocus="this.value = '';" onblur="if (this.value == '')" 
	</script>
		
</body>
</html>