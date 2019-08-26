
<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"
    	 deferredSyntaxAllowedAsLiteral="true"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

	<head>

		<title>查询结果</title>
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
			.table {
	margin-top: 13px;
	 table-layout:fixed;
	word-wrap:break-word;
	font-size: 16px;
	 
}
.table td{
	background-color:#ffffff;
   text-align:center;
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
			
		
		</style>
		
		
		<script type="text/javascript">
	
		
	function doPost(poNo) {
				
				window.location.href = "${pageContext.request.contextPath }/post/queryRoute?poNo="+poNo;
			

	}
	
	function doPoAppraise(poNo) {
		
		window.location.href = "${pageContext.request.contextPath }/post/appraise?poNo="+poNo;
	

}
	
	
</script>
		
		
		
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

				<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/resultImg/bg1.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">

									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small"></span>
										<h1>查询结果</h1>
										<h1>Query Results</h1>
									</div>

								</div>

							</div>
						</div>
					</div>
				</header>

				<div  class="col-md-10 col-lg-offset-1" style="background-color: white;height:100% ;">
					<div class="row text-center" style="margin: 80px 30px;">




						<div>
							<table class="table table-striped table-bordered"   cellspacing="1" cellpadding="4"  align="center">
								<tr>
								  <td colspan=10>
								    查询详情
								  </td>
								</tr>
								<tr class="demo-table-hover">
									<td width="10%">发件地 </td>
									<td width="6%">发件人 </td>
									<td width="10%">发件人电话 </td>
									<td width="10%">收件地</td>
									<td width="6%">收件人 </td>
									<td width="10%">收件人电话</td>
									<td width="8%">状态</td>
									<td width="15%">评价 </td>
									<td width="25%" colspan=2>操作</td>
								</tr>
								<c:forEach items="${posts}" var="posts">
									<tr>
										<td>${posts.poStarAddress}</td>
										<td>${posts.poSender}</td>
										<td>${posts.poSenderPhone}</td>
										<td>${posts.poEndAddress}</td>
										<td>${posts.poAddressee}</td>
										<td>${posts.poAddresseePhone}</td>
										<td>${posts.status}</td>
										<td>${posts.poAppraise}</td>
										<td>
											<a  class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doPost('${posts.poNo}');">详情</a>
										</td>
										<td>
											<a  class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doPoAppraise('${posts.poNo}');">评价</a>
										</td>
									</tr>
								</c:forEach>
							</table>

						</div>
						<div class="text-center">
							<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
							<a class="btn btn-info" href="${pageContext.request.contextPath }/post/searchResult?pageNum=1">首&nbsp;页</a>
							<c:if test="${pageInfo.hasPreviousPage}">
								<a class="btn btn-info" href="${pageContext.request.contextPath }/post/searchResult?pageNum=${pageInfo.pageNum-1}">上一页</a>
							</c:if>
							<c:if test="${pageInfo.hasNextPage}">
								<a class="btn btn-info" href="${pageContext.request.contextPath }/post/searchResult?pageNum=${pageInfo.pageNum+1}">下一页</a>
							</c:if>
							<a class="btn btn-info" href="${pageContext.request.contextPath }/post/searchResult?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
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

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>

</html>