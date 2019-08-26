<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

	<head>

		<title>公告详情</title>
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
				margin-top: 0px;
				height: 350px;
				width: 100%;
			}
			
			.pics {
				position: relative;
				width: 100%;
				height: 350px;
			}
			
			.pic1 {
				width: 100%;
				height: 350px;
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
				height: 350px;
				left: 0;
				top: 0;
				-webkit-animation: picDraw 5s ease-in-out infinite;
			}
			.table{
			line-height: 25px;
			
			}
			
			.td1{
			font-size: 28px;
			color: #2e243e;
			   text-align:center;
			
			}
			.td2{
			font-size: 22px;
			color: #383537;
			   text-align:center;
			}
			
			.bdsharebuttonbox {
				width: 40px;
				height: 230px;
				border: 1px solid #ccc;
				position: fixed;
				_position: absolute;
				/*left: 20px;
				top: 30px;*/
				left: 10px;
				bottom: 20px;
				padding: 4px;
				background-color: #9bc0ce;
				border-radius:10px;
				
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

				<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/resultImg/bg3.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">

									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small"></span>
										<h1>新闻公告详情</h1>
										<h1>Press Release Details</h1>
									</div>

								</div>

							</div>
						</div>
					</div>
				</header>

<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100%;">
	<div class="row text-center" style="margin: 100px 50px;">	
		<div>
			<table class="table table-striped table-bordered"   frame="void">	  			
		  				<tr>						  				
			  				<td class="td1">${notice.noticeTitle}</td>						  									  				
		  				</tr>
		  				<tr>						  				
			  				<td class="td2">${notice.noticeText}</td>						  									  				
		  				</tr>		  			
			</table>				  
		</div>	
	</div>
</div>








</div>


<div class="bottom-tu">
				<div class="pics">
					<img src="${pageContext.request.contextPath}/plug/img/resultImg/ad1.jpg" alt="" class="pic1">
					<img src="${pageContext.request.contextPath}/plug/img/resultImg/ad2.jpg" alt="" class="pic2">
				</div>
			</div>
			
			</div>
			

		</div>
	</div>


<!-- 一键分享 -->
        <div class="bdsharebuttonbox">
			<a href="#" class="bds_more" data-cmd="more"></a>
			<a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
			<a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a>
			<a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a>
			<a href="#" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a>
		</div>
	



	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>


<script>
			window._bd_share_config = {
				"common": {
					"bdSnsKey": {},
					"bdText": "",
					"bdMini": "2",
					"bdMiniList": false,
					"bdPic": "",
					"bdStyle": "0",
					"bdSize": "32"
				},
				"share": {},
				"image": {
					"viewList": ["weixin", "tsina", "qzone", "tqq"],
					"viewText": "分享到：",
					"viewSize": "16"
				},
				"selectShare": {
					"bdContainerClass": null,
					"bdSelectMiniList": ["weixin", "tsina", "qzone", "tqq"]
				}
			};
			with(document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];
		</script>





</html>