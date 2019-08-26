<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/queryRoute/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/queryRoute/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plug/queryRoute/css/timeline.css">

<title>物流追踪</title>
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
					float: left;
	
			}
			
						.fs20 {
				font-size: 20px;
				color: red;
			}
			
			/*.fs14 {
				font-size: 14px;
			}
			*/	
			.lh24 {
				line-height: 24px;
			}
			

			
			
		</style>	



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
					
					
					<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/notice/bg1.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">

									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small"></span>
										<h1>物流追踪</h1>
										<h1>Logistics tracking</h1>
									</div>

								</div>

							</div>
						</div>
					</div>
				</header>

					<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">

						<div class="row text-center" style="margin: 30px 30px;">
									<div class="container-fluid">
			<div class="col-md-12" style="margin-top: 20px;">
				<div class="row">
					<h2>物流跟踪</h2>
					<div class="timeline timeline-single-column" style="margin-top: 20px;">
						
						<c:forEach items="${strList}" var="strList">
							<div class="timeline-item">
								<div class="timeline-point timeline-point-success">
									<i class="fa fa-star"></i>
								</div>
								<div class="timeline-event timeline-event-success">
									<div class="timeline-body">
										<h4>${strList}</h4>
									</div>
								</div>
							</div>
						</c:forEach>
						
						<span class="timeline-label" style="margin-bottom: 20px;">
							<button class="btn btn-danger"><i class="fa fa-ambulance"></i></button>
						</span>
					</div>
				</div>
			</div>
		</div>
	

               <div class="bottom-tu">
						<div class="fs20 mt-5 font-weight-bold mb-3">   温馨提示</div>
        	<p class="fs14 font-weight-bold lh24">本人提货 <span class="font-weight-normal">需提供收货人身份证原件</span></p>
        	<p class="fs14 font-weight-bold lh24">委托提货 <span class="font-weight-normal">需提供收货人身份证原件及代理人身份证原件</span></p>
        	<p class="fs14 font-weight-bold lh24">公司提货 <span class="font-weight-normal">需提供收货人身份证原件及加盖公章的提货委托书</span></p>
        	<p class="fs14 font-weight-bold lh24">手机号查询 <span class="font-weight-normal">目前仅提供1个月内的运单查询，且需运单上寄方或收方留有手机号码</span></p>
					</div>					
				



							</div>
						</div>
					</div>

				</div>

				
			</div>
		</div>










