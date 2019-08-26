<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

    
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/animate.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/icomoon.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/themify-icons.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/bootstrap.css">


	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/magnific-popup.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/owl.carousel.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/owl.theme.default.min.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/introCss/style.css">
	
	
	<style type="text/css">
	
			#gtco-header{
				height: 800px;
			}
			
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
			
			/*.demo1_hr {
				margin: 50px auto;
			}*/
			
			#hr1 {
				-moz-border-bottom-colors: none;
				-moz-border-image: none;
				-moz-border-left-colors: none;
				-moz-border-right-colors: none;
				-moz-border-top-colors: none;
				border-color: #EEEEEE -moz-use-text-color #FFFFFF;
				border-style: solid none;
				border-width: 1px 0;
				margin: 50px 0;
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
			
			input::-webkit-input-placeholder{
				color:blue;
				font-size: 15px;
				text-align: left;
			}
			
			
			.bottom-tu {
				margin-top: 150px;
				height: 400px;
				width: 100%;
			}
			
			.pics {
				position: relative;
				width: 100%;
				height: 400px;
			}
			
			.pic1 {
				width: 100%;
				height: 400px;
			}
			
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
				height: 400px;
				left: 0;
				top: 0;
				-webkit-animation: picDraw 5s ease-in-out infinite;
			}
			.bottom-tu {
				margin-top: 150px;
				height: 400px;
				width: 100%;
			}
			
			.pics {
				position: relative;
				width: 100%;
				height: 400px;
			}
			
			.pic1 {
				width: 100%;
				height: 400px;
			}
			
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
				height: 400px;
				left: 0;
				top: 0;
				-webkit-animation: picDraw 5s ease-in-out infinite;
			}
</style>

                           	<div id="page">

	
	<div class="page-inner">
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			
			<div class="row">
				<div class="col-sm-4 col-xs-12">
					<div id="gtco-logo"><a href="index.html"><em></em></a></div>
				</div>
				<div class="col-xs-8 text-right menu-1">
				</div>
			</div>
			
		</div>
	</nav>
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_29.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
							<h1></h1>	
						</div>
						
					</div>
							
					
				</div>
			</div>
		</div>
	</header>
	
	
	
	<div class="gtco-section border-bottom">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 text-left gtco-heading">
					<h2>企业简介</h2>
					<p>INTRODUCTION</p>
					<h4>成为最值得信赖的，基于物流的商业伙伴</h4>
				</div>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="feature-left animate-box" data-animate-effect="fadeInLeft">
						
						<div class="feature-copy">
							<h3></h3>
							<p>自成立以来，天软快递始终专注于服务质量的提升，持续加强基础建设，
								积极研发和引进具有高科技含量的信息技术与设备以提升作业自动化水平，在国内外建立了庞大的信息采集，
								市场开发，物流配送，快件收派等速运业务机构及服务网络。<br /><br/><br />

                                                          在持续强化速运业务的基础上，天软快递坚持以客户需求为核心，积极拓展多元化业务，针对电商，食品，医药，汽配，
                                                          电子等不同类型客户开发出一站式供应链解决方案，并提供支付，融资，理财，保价等综合性的金融服务。与此同时，
                                                          依托强大的物流优势，我们成立天软优选，为客户提供品质生活服务，打造顺丰优质生活体验。<br /><br/><br />

                                                            多年来，天软快递持续创新，不断铸造高品质服务体验，为客户成功提供坚实有力的支持</p>
						</div>
					</div>

				</div>
				<div class="col-md-7 macbook-wrap animate-box" data-animate-effect="fadeInRight">
					<img src="${pageContext.request.contextPath}/plug/img/images/img_32.jpg" alt="Free HTML5 Bootstrap Template">
				</div>
			</div>
		</div>
	</div>
	
		<div class="gtco-section border-bottom">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 text-left gtco-heading">
					<h2>企业理念</h2>
					<p>Corporate Philosophy</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="feature-left animate-box" data-animate-effect="fadeInLeft">
						
						<div class="feature-copy">
							<h4>核心价值观</h4>
							<p>我们相信并尊重员工；<br />
                                                             我们诚信经营，正直为人；<br />
                                                       我们追求卓越的成就和贡献；<br />
                                                                   我们鼓励并坚持创新。<br /></p>
						</div>
						
						<div class="feature-copy">
							<h4>企业使命</h4>
							<p>让客户享受快递新生活，让员工实现个人价值，让企业担当社会责任。</p>
						</div>
						
						<div class="feature-copy">
							<h4>质量方针</h4>
							<p>快速、安全、准确、周到 ，客户的满意，天软快递的追求。</p>
						</div>
						
						<div class="feature-copy">
							<h4>服务理念</h4>
							<p>天软快递，一如亲至，用心成就你我</p>
						</div>
						
					</div>

				</div>
				<div class="col-md-7 macbook-wrap animate-box" data-animate-effect="fadeInRight">
					<img src="${pageContext.request.contextPath}/plug/img/images/img_33.jpg" alt="Free HTML5 Bootstrap Template">
				</div>
			</div>
		</div>
	</div>
	
					
			</div>
		</div>
		
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>