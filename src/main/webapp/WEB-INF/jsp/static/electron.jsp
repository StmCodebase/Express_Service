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
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_16.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
							<h1>电子行业</h1>
							<h1>electron industry</h1>
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
					<h2>手机新品首发，天软快递为您保驾护航！ </h2>
					<p>New mobile phone first, day soft express escort for you!</p>
				</div>
			</div>
			<div class="row">
				<p>每年的手机新品首发都是粉丝们的狂欢，但新品首发对物流配送要求非常严格，天软快递作为某国际领先手机品牌的承运商，如何快速将新品快速、准确、安全的寄递到消费者手中，考验着天软快递的服务能力。
					2016年某国际领先手机品牌新品订单分别从北京、上海始发，要求天软快递必须在指定日期完成所有新品派送，当日准时派送达成率99.80%，派送首日28个城市，次日城市161个；在消费者收到新品前，
					顺丰必须对照片和实物保密，保证新品安全，零丢失，零损坏。对此，天软快递制定新品首发方案，从执行操作、风险管控、人力资源等方面做足了准备。<br /><br /><br />

 

                                       为保证新品派送时效，天软快递对首日派送城市明细及件量进行预测，运输环节对每个流向的车辆做了单独运输规划及执行监控安排，中转场提前安排好交接区、装卸区、滞留区、异常处理区域，新品到达分点部后，优先出仓，
                                        全员派送，派送需前100%电联客户，当日完成三次尝试派送；为保证新品安全，运输车辆装备GPS系统，并在车厢内安装CCTV，优先选择以无犯罪记录、交通事故最少、驾车经验丰富的司机。装卸车货物交接必须在天软快递CCTV下完成，
                                         每个流向运输路线准备至少三条，在发车前30分钟确定最终行驶路线；为保证新品信息保密，对临时场地进行安保改造，保证无死角监控，对人员资质进行审查，高规格安检，手机进入仓库必须提前报备，出仓后专人专车押运。</p>
               <hr/>
               
               <p>该手机品牌新品于2016年9月16日大陆上市，天软快递当日实现100%派送提前电话预约、100%成功派送率+首次尝试派送率、无破损、无遗失、无提前派送，获得客户及销售者的高度认可。
                                      天软快递新品首发方案为国内3C行业新品首发寄递市场树立起“顺丰标杆”，为客户创造实现更大的经济价值，为消费者提供更好的物流服务体验，实现互利共赢！
                                  未来天软快递希望携手3C客户在供应链领域获得深度合作，包含物流配送、重货、仓储（含微仓）、金融、顺维修、国际货运等模块，
                                       为更多的合作伙伴创造价值、打造一流服务能力，与客户共同成长！</p>
               <div></div>
	

			</div>
		</div>
		<div class="bottom-tu">
								<div class="pics">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_39.jpg" alt="" class="pic1">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_40.jpg" alt="" class="pic2">
								</div>
							</div>
	</div>

	</div>

	</div>
	
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>