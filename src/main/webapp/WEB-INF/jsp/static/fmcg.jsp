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
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_20.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
							<h1>快消行业</h1>
							<h1>FMCG industry</h1>
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
					<h2>客户服务案例——周黑鸭 </h2>
					<p>Customer service case -- Zhou Black Duck</p>
				</div>
			</div>
			<div class="row">
				<p>为了给客户最优质的服务体验，周黑鸭联手天软冷运，开展冷运到家业务的推广，2016年双十一期间，顺丰承接了周黑鸭全部订单，
					7天内完成60万单配送，带给客户最新鲜健康的购物体验。</p>
               <hr/>
               <div>
               	<p>为满足消费者口感，顺丰以大量的实验数据为依据，新推出的包装箱不仅保障了产品的新鲜度，同时也降低了周黑鸭的包装成本。
               		为提高时效，顺丰安排专人驻场以及专车转运，直接在仓库完成贴单、扫描和分拣流程，并直接运往机场，保证在24到36小时内完成配送。
               		<br><br />
                                      经过一个月的测试推广，消费者反应良好，满意度大幅提升，有效推动周黑鸭在电子商务业务上的长足发展。<br><br />
                                      基于对于“顾客第一”的核心价值观的认可，顺丰将与周黑鸭加深物流供应链方面的深度合作，助力周黑鸭扩展市场，实现周黑鸭与顺丰品牌双赢。<br><br />
               	</p>
               </div>
	

			</div>
		</div>
		
		<div class="bottom-tu">
								<div class="pics">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_42.jpg" alt="" class="pic1">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_43.jpg" alt="" class="pic2">
								</div>
							</div>
	</div>
	


	</div>

	</div>
	
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>