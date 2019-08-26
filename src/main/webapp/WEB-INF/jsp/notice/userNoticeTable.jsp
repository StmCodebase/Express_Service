<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
					.table {
	margin-top: 13px;
	word-wrap:break-word;
	font-size: 14px;
	border-bottom-width: 1px;
	 
}
.table td{
	background-color:#ffffff;

text-overflow:ellipsis; 
white-space:nowrap; 
overflow:hidden;
}
   .table td:hover{    
white-space:normal; 
overflow:auto;
}
		.table a{
		   font-size: 12px;
		}	
			
		.gonggao{
		font-size:26px;
		color: black;
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

			<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/notice/bg3.jpg)">
				<div class="overlay"></div>
				<div class="gtco-container">
					<div class="row">
						<div class="col-md-12 col-md-offset-0 text-left">

							<div class="row row-mt-15em">

								<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
									<span class="intro-text-small"></span>
									<h1>新闻公告</h1>
									<h1>Press Announcements</h1>
								</div>

							</div>

						</div>
					</div>
				</div>
			</header>

			<div class="row" style="margin-top: 0px;">
                   <div class="col-md-10 col-lg-offset-1" style="background-color: white;height:100%;"><!--原 height:100%  -->
	<div class="row text-center" style="margin: 80px 80px;" height="600px">
		<div class="text-center"  >
			<table frame="void" rules="none"  class="table table-striped table-bordered" cellspacing="1" cellpadding="4"  align="center">
					  		     <tr >
					  			   <td colspan=3 class="gonggao">新闻公告</td>
					  			<tr>
		  			<c:forEach items="${pageInfo.list}" var="notices">
					  			
					  				<tr>						  				
						  				<td  align="left" style="font-size:35px"><a href="${pageContext.request.contextPath}/notice/userNoticeText?noticeNo=${notices.noticeNo}">${notices.noticeTitle}</a></td>
						  				<td ><fmt:formatDate value="${notices.noticeTime}" pattern="yyyy-MM-dd "/></td>
						  				<td ><a href="${pageContext.request.contextPath}/notice/userNoticeText?noticeNo=${notices.noticeNo}" >详细信息</a> </td>						  				
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			
				  			
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="userNoticeTable?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="userNoticeTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="userNoticeTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="userNoticeTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>
		</div>
	
	</div>
</div>
		

			</div>

			<div class="bottom-tu">
				<div class="pics">
					<img src="${pageContext.request.contextPath}/plug/img/notice/ad1.jpg" alt="" class="pic1">
					<img src="${pageContext.request.contextPath}/plug/img/notice/ad3.jpg" alt="" class="pic2">
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
	
	<script type="text/javascript" str="https://code.jquery.com/jquery-1.8.3.min.js"></script>

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





	