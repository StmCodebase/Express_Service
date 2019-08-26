<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

    
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/animate.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/icomoon.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/themify-icons.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/bootstrap.css">


	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/magnific-popup.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/owl.carousel.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/owl.theme.default.min.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/caseCss/style.css">
	
	
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
			</div>
			
		</div>
	</nav>
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_18.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
							<h1>生鲜行业</h1>
							<h1>fresh industry</h1>
						</div>
						
					</div>
							
					
				</div>
			</div>
		</div>
	</header>
	
		<div id="gtco-features" class="border-bottom">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box">
					<h2>新鲜果蔬极速到家 </h2>
					<p>Fresh fruits and vegetables arrive home quickly</p>
				</div>
			</div>
			<div class="row">
				<p>2018年11月1日，天软快递携手赣南脐橙在江西赣州举行桔橙寄递行业解决方案发布会，再次掀起了水果寄递行业的讨论热潮</p>
               <hr/>
               <div>
               	<p>天软快递针对桔橙寄递的特点，相较于以往的水果寄递方案做出极大创新和改良。除了提供多元化产品（服务）、扩大物流运输网络、提升运输时效外，
               		还特别针对北方寒冷地区，因温差导致桔橙冻伤冻坏，研发了专门专属的的包装方案。<br><br><br>为助力全国桔橙产业发展，实现互利共赢，天软快递实现了从枝头到餐桌的顺丰服务，
               		并在桔橙寄递市场形成一套“天软速运标准”。 天软快递始终秉承高品质物流服务，为桔橙经销商、果农提供专业的桔橙综合物流服务；同时，天软快递利用自有的渠道资源，帮助果农推广宣传本土桔橙品牌，
               		创造更大的经济价值和品牌价值。</p>
               </div>
	

			</div>
		</div>
		
		<div class="bottom-tu">
								<div class="pics">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_44.jpg" alt="" class="pic1">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_45.jpg" alt="" class="pic2">
								</div>
							</div>
	</div>
	
		
	

			</div>
		</div>
		
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>