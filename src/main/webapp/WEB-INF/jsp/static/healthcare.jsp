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
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_15.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
							<h1>医疗行业</h1>
							<h1>healthcare industry</h1>
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
					<h2>重走天路，天软医药冷链西藏行！ </h2>
					<p>Retake Tibet highway, day soft medicine cold chain Tibet</p>
				</div>
			</div>
			<div class="row">
				
				<p>2017年3月，天软冷运分公司接到北京北生研生物制品有限公司（原北京天坛生物制品股份有限公司，以下简称“北生研”）的生物制品运输通知，需要分批次运输约1000件国家免疫规划的生物制品至西藏自治区区级疾控中心，
					以及阿里地区、昌都地区、林芝地区等地市疾病预防控制中心（以下简称“疾控中心”），各类疫苗共计580000余人份。为了避免疾控中心断供，或者运输温度异常导致生物制品性状发生变化，所以必须在保障运输时效的同时
					严格控制生物制品的运输温度。由于运输的生物制品都是新生儿、婴幼儿所用，受用对象较为特殊（新生儿、婴幼儿的使用时效要求更高）、加上路途的艰巨、路况的恶劣、时效的高要求，天软冷运制定了以医药专车服务为主，
					医药商配服务辅助，医药专递服务提供航空支持的定制化运输方案，并安排机动资源全程跟随，以应对运输途中的突发事件。</p>
               <hr/>
               <div>
               	<h3>医药专车服务：</h3>
               	<p>天软冷运使用通过GSP验证合格的医药冷藏车，提前预冷充分，此产品省去了医药中转场中转、操作环节，将货品全程保持2-8℃运输环节，直运至西藏疾控中心。</p>

                <h3>医药商配服务：</h3>
                <p>此产品用于服务北生研向阿里地区、昌都地区、林芝市疾控中心的货品配送任务，作为辅助性运输方案。</p>

                <h3>医药专递服务：</h3>
                <p>由于拉萨通往阿里地区、昌都地区的道路碰到严重塌方，车辆无法前行，天软冷运分公司马上调整配送方案：启用拉萨当地航空运力资源，使用医药专用冷藏箱进行航空运输。并立即做出备用应急方案，确保生物制品任何情况都不脱温：
                	由于拉萨当地机场航班取消非常频繁，天软冷运在将疫苗送进机场后，冷藏车保持打冷在机场外机动等候，一旦航班取消，第一时间将货物取出，暂存至冷藏车或者自治区疾控中心冷库。</p>

 

                <p>北生研本次运输的所有生物制品种类均为国家免疫规划生物制品，在交通、卫生、医疗条件制约较多的的西藏自治区，这几批生物制品对西藏自治区的新生儿来说显得更加重要；对于北生研和天软冷运来说，这一批批进藏的生物制品不只是简单的产品，而是双方共担的一份社会责任！</p><br/><br />

 

                 <p>作为助力北生研达成社会责任的顺丰冷运，经过一次又一次进藏运输的磨练，如何克服进藏途中的困难已不是顺丰冷运重点考虑的问题；如何运用自身优势服务资源、通过自身产品体系的组合为客户提供全方位的医药供应链物流服务，
                 	让特殊地理区域不再是医药生产、经营企业眼中的“鸡肋”；让祖国各地区的必需医药产品供应得到实实在在的保障，将是摆在顺丰冷运面前新的任务！</p>作为助力北生研达成社会责任的顺丰冷运，经过一次又一次进藏运输的磨练，如何克服进藏途中的困难已不是顺丰冷运重点考虑的问题；
                                         如何运用自身优势服务资源、通过自身产品体系的组合为客户提供全方位的医药供应链物流服务，让特殊地理区域不再是医药生产、经营企业眼中的“鸡肋”；让祖国各地区的必需医药产品供应得到实实在在的保障，将是摆在顺丰冷运面前新的任务！作为助力北生研达成社会责任的天软冷运，
                                         经过一次又一次进藏运输的磨练，如何克服进藏途中的困难已不是天软冷运重点考虑的问题；如何运用自身优势服务资源、通过自身产品体系的组合为客户提供全方位的医药供应链物流服务，让特殊地理区域不再是医药生产、经营企业眼中的“鸡肋”；
                                         让祖国各地区的必需医药产品供应得到实实在在的保障，将是摆在天软冷运面前新的任务！</p>
               </div>
               </div>
               </div>
               
               	<div class="bottom-tu">
								<div class="pics">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_48.jpg" alt="" class="pic1">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_49.jpg" alt="" class="pic2">
								</div>
							</div>
	

			</div>
	
		
	

			</div>
		</div>
		
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>