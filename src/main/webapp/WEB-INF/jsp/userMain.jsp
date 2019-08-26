<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1 , user-scalable=no">

		<title>测试文字标题</title>
		<script type="text/javascript" 	src ="${pageContext.request.contextPath}/plug/jquery/jquery-2.1.1.min.js"></script>
	    <script type="text/javascript" 	src ="${pageContext.request.contextPath}/plug/bootstrap/js/bootstrap.min.js"></script>
	    <script type="text/javascript" 	src ="${pageContext.request.contextPath}/plug/layer/layer.js"></script>
	    <link 	rel="stylesheet" 		href="${pageContext.request.contextPath}/plug/layer/skin/default/layer.css">
	    <link 	rel="stylesheet" 		href="${pageContext.request.contextPath}/plug/bootstrap/css/bootstrap.min.css">
	    

		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.easing.1.3.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.waypoints.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/owl.carousel.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.countTo.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/jquery.magnific-popup.min.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/magnific-popup-options.js"></script>
		<script src="${pageContext.request.contextPath}/plug/js/login/main.js"></script>    	
		<style type="text/css">
			img {
				width: 100%;
			}
			
			.demo1_poster {
				margin-top: 50px;
			}
			
			.demo1_img_auto_width img {
				width: 30%;
				height: 30%;
				/*width: auto;*/
				/*text-align:center;*/
			}
			
			.demo1_text_h1 h1 {
				margin-top: 50px;
				margin-bottom: 50px;
			}
			
			.demo1_threeC {
				margin-top: 50px;
			}
			
			.demo1_threeC p {
				margin-top: 30px;
				margin-bottom: 30px;
			}
			
			.demo1_twoC {
				margin-top: 50px;
			}
			
			.demo1_twoC h4 {
				margin-top: 30px;
				margin-bottom: 30px;
				text-align: left;
			}
			
			.demo1_icon {
				margin-top: 30px;
				margin-bottom: 30px;
			}
			
			.demo1_hr {
				margin: 50px auto;
			}
			
			.demo1_hr hr {
				border: 1px solid #dadddf;
			}
			
			.demo1_hover:hover {
				background-color: #F0FFFF;
			}
			
			.demo1_foot {
				height: 100px;
				width: 100%;
				background-color: black;
			}
			
			.demo1_foot_div1 {
				/*line-height: 100px;*/
			}
		</style>
		<%
		
				if(session.getAttribute("loginUser")==null){
					response.sendRedirect(request.getContextPath()+"/userLogin");
					return;
				}
		
				String mainPage=(String)request.getAttribute("mainPage");
		  		
				if(mainPage==null || mainPage.equals("")){
					mainPage="userMainPage.jsp";
				}
				
		  %>
	</head>

	<body style="background-color: #EEEEEE;">
		<!--
        	作者：offline
        	时间：2019-06-15
        	描述：导航条
        -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
					<a class="navbar-brand" href="#"><strong>天软快递 物流管理平台</strong></a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							<a href="${pageContext.request.contextPath}/userMain"><img src="${pageContext.request.contextPath}/plug/img/icon/Icon (76).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;主页<span class="sr-only">(current)</span></a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath}/post/addExpress"><img src="${pageContext.request.contextPath}/plug/img/icon/Icon (73).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;寄快递</a>
						</li>
						
						<li>
							<a href="${pageContext.request.contextPath}/post/searchOrder"><img src="${pageContext.request.contextPath}/plug/img/icon/Icon (77).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;查快递</a>
						</li>
						
						<li>
							<a href="${pageContext.request.contextPath}/notice/userNoticeTable"><img src="${pageContext.request.contextPath}/plug/img/icon/Icon (78).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;查询公告<span class="sr-only">(current)</span></a>
						</li>
						
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img src="${pageContext.request.contextPath}/plug/img/icon/Icon (72).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;关于我们 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="${pageContext.request.contextPath}/static/intro">关于我们</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/static/electron">电子行业</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/static/fmcg">快消行业</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="${pageContext.request.contextPath}/static/fresh">生鲜行业</a>
								</li>
								<li role="healthcare" class="healthcare"></li>
								<li>
									<a href="${pageContext.request.contextPath}/static/healthcare">医疗行业</a>
								</li>
							</ul>
						</li>
					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
							<img src="${pageContext.request.contextPath}/plug/img/icon/Icon (71).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;${loginUser.uName} ,欢迎您<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="${pageContext.request.contextPath}/user/userInfo?uNo=${loginUser.uNo}">个人资料</a>
								</li>
								<li>
									<a onclick="loginOut()">退出登录</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<div class="row" style="margin-top: 50px;">
			

					<jsp:include page="<%=mainPage%>"/>
				
		</div>
		
		
		<div class="demo1_foot" style="margin-top: 20px;">
			<div class="demo1_foot_div1 text-center">
				<br />
				<font color="white">2019&nbsp;天软快递版权所有</font>
				<br />
				<font color="white">地址：天津市西青区宾水西道399号</font>
				<br />
				<font color="white">邮编：300387</font>
			</div>
		</div>
	</body>
	
	
	<script type="text/javascript">
			function loginOut() {
				layer.confirm('确认退出登录？', {
					  btn: ['确认','取消'] 
					}, function(){
						window.location.href = "${pageContext.request.contextPath}/loginOut";
					}, function(){
					  
					});
			}
		</script>
</html>