<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"
    	 deferredSyntaxAllowedAsLiteral="true"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<title>手机号查询</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
	<!-- Animate.css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/icomoon.css">
	<!-- Themify Icons-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/themify-icons.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/magnific-popup.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/owl.carousel.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/noticeCss/style.css">




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
				margin-right: 200px auto;
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
			
			#hr1 {
				-moz-border-bottom-colors: none;
				-moz-border-image: none;
				-moz-border-left-colors: none;
				-moz-border-right-colors: none;
				-moz-border-top-colors: none;
				border-color: #EEEEEE -moz-use-text-color #FFFFFF;
				border-style: solid none;
				border-width: 1px 0;
				margin: 18px 0;
			}
			
			#hr2 {
				-moz-border-bottom-colors: none;
				-moz-border-image: none;
				-moz-border-left-colors: none;
				-moz-border-right-colors: none;
				-moz-border-top-colors: none;
				border-color: #EEEEEE -moz-use-text-color #FFFFFF;
				border-style: dashed none;
				border-width: 1px 0;
				margin: 18px 0;
			}
			
			.bottom-tu {
				margin-top: 150px;
				height: 350px;
				width: 100%;
			}
			
			.pics {
				position: relative;
				width: 100%;
height: 350px;			}
			
			.pic1 {
				width: 100%;
height: 350px;			}
			
			@keyframes picDraw {
				0% {
					opacity: 0;
				}
				50% {
					opacity: 1;
				}
				100% {
					opacity: 0;
				}
			}
			
			.pic2 {
				position: absolute;
				width: 100%;
height: 350px;				left: 0;
				top: 0;
				-webkit-animation: picDraw 5s ease-in-out infinite;
			}
			
			</style>
</head>


		<div id="page">

			<div class="page-inner">
				<nav class="gtco-nav" role="navigation">
					<div class="gtco-container">

						<div class="row">
							<div class="col-sm-4 col-xs-12">
								<div id="gtco-logo">
									<a href="index.html"><em></em></a>
								</div>
							</div>
							<div class="col-xs-8 text-right menu-1">
								<!--<ul class="nav navbar-nav">
						<li class="active">
							<a href="#"><img src="images/icon/Icon (76).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;主页<span class="sr-only">(current)</span></a>
						</li>
						<li>
							<a href="#"><img src="images/icon/Icon (73).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;寄快递</a>
						</li>
						<li>
							<a href="#"><img src="images/icon/Icon (77).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;查快递</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img src="images/icon/Icon (78).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;新闻公告 <span class="caret"></span></a>
							
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img src="images/icon/Icon (72).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;关于我们 <span class="caret"></span></a>

						</li>
						
						<li>
							<a href="#"><img src="images/icon/Icon (79).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;合作企业</a>
						</li>
					</ul>-->
							</div>
						</div>

					</div>
				</nav>

				

				<div class="row" style="margin-top: 0px;">
					
					
					<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/searchImg/bg5.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">

									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small"></span>
										<h1>手机号查快递</h1>
										<h1>Mobile phone number inquiry express</h1>
									</div>

								</div>

							</div>
						</div>
					</div>
				</header>

					<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">

							<div class="row text-center" style="margin: 80px 80px;">
			<div class="">
				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
							<a class="navbar-brand" href="#">订单查询</a>
						</div>

						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li>
									<a href="${pageContext.request.contextPath}/post/searchOrder"><span class="glyphicon glyphicon-align-justify" aria-hidden="true"></span>&nbsp;运单号查询</a>
								</li>
								<li class="active">
									<a href="${pageContext.request.contextPath}/post/searchNumber" id="" name=""><span class="glyphicon glyphicon-phone" aria-hidden="true"></span>&nbsp;手机号查询</a>

								</li>

							</ul>

						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container-fluid -->
				</nav>
			</div>

			<div class="">
				<!--<div class="container demo1_hr">
							<hr />
						</div>-->
				<div id="hr1"></div>
			</div>
		</div>
		<div class="" align="center" style="background-color: ;">
			<div class="text-center" style=" margin-top: 80px; ">

				<div class="row ">
					<div class="col-xs-8 col-md-offset-1">
						<input type="text" class="form-control input-lg " placeholder="请输入手机号进行查询" id="poSenderPhone" name="poSenderPhone">
					</div>
					<div class="col-xs-2">
						<button type="submit" class="btn btn-danger btn-lg " onclick="doAjaxPost()">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;查询订单</button>
					</div>

				</div>

			</div>
		</div>
		</div>


				</div>
                <div class="bottom-tu">
					<div class="pics">
						<img src="${pageContext.request.contextPath}/plug/img/searchImg/ad1.jpg" alt="" class="pic1">
						<img src="${pageContext.request.contextPath}/plug/img/searchImg/ad2.jpg" alt="" class="pic2">
					</div>
				</div>

				
			</div>
		</div>

	
		</div>

		</div>

		</div>
		</div>
		</div>	

		<div class="gototop js-top">
			<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
		</div>




	<script type="text/javascript" str="${pageContext.request.contextPath}/plug/js/jquery-1.8.3.js"></script>
		







	<script type="text/javascript">
	
		
		
		function doAjaxPost(){
			var poSenderPhone = $("#poSenderPhone").val();
			if(poSenderPhone == null || poSenderPhone == "") {
				layer.msg("请输入订单号！", {time:2000, icon:5, shift:6}, function(){
                });
				return;
			} 
			
			
			var loadingIndex = null;
			$.ajax({
	        	type : "POST",
	        	url  : "${pageContext.request.contextPath}/post/queryExpressBypoSenderPhone",
	        	//async: false,
	        	data : {
	        		"poSenderPhone" : poSenderPhone
	        	},
	        	beforeSend : function(){
	        		loadingIndex = layer.msg('处理中', {icon: 16});
	        	},
	        	success : function(result) {
	        		layer.close(loadingIndex);
	        		
	        		var resObj = JSON.parse(result);
	        		
	        		if (resObj.result) {
	        			window.location.href = "${pageContext.request.contextPath}/post/searchResult";
	        		} else {
	                    layer.msg("手机号不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
	                    	
	                    });
	        		}
	        	},
	        	error : function(err){
	        		
	        	}
	        });
		}
		//onfocus="this.value = '';" onblur="if (this.value == '')" 
	</script>
	
</html>