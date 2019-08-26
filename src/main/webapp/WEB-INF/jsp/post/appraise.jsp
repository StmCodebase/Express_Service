 <%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<title>用户评价</title>
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

<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/layui/css/layui.css">







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
			.td1{
			   text-align:center;
			 vertical-align:middle;
			 padding: 10px 5px 10px 0px;
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
					
					
					<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/notice/bg2.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">

									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small"></span>
										<h1>用户评价</h1>
										<h1>User reviews</h1>
									</div>

								</div>

							</div>
						</div>
					</div>
				</header>

					<div class="col-md-8 col-lg-offset-3" style="background-color: white;height:100% ;">

						<div class="row text-center" style="margin: 30px 30px;">
		                       <div>
		                         <table class="table table-bordered table-striped" style="width: 500px;">
									<tr>
										<td colspan="2" class="text-center">
										   	用户评价
										</td>
									</tr>
									<tr>
										<td colspan="2" class="text-center">
												<textarea name="poAppraise" id="poAppraise"  cols="1"   rows="10"   class="form-control">${post.poAppraise }</textarea>
										</td>
									</tr>
									<tr>
										<td >
										 <div class="td1">物流服务</div>
										</td>
										<td>
											<div id="score"></div>
										</td>
									</tr>
									<tr>
										<td>
										<div class="td1">服务态度</div>
										</td>
										<td>					
											<div id="score1"></div>
										</td>
									</tr>
									<tr>
										<td>
										<div class="td1">描述相符</div>
										</td>
										<td>
											<div id="score2"></div>
										</td>
									</tr>
									<tr>
				                       <td colspan="2" class="text-center">
				                       <input type="hidden" id=poNo name="poNo" value="${post.poNo }"/>
											<input class="btn btn-info" type="button" value="提交" onclick="doReviews()">

				                        </td>
			                        </tr>
								</table> 
								</div>


							</div>
						</div>
					</div>

				</div>

				
			</div>
	 <script src="${pageContext.request.contextPath}/plug/layui/layui.js"></script>	
			  <script>
  layui.use('rate', function(){
    var rate = layui.rate;
    var ins1 = rate.render({
      elem: '#score'  
    });
      var ins2 = rate.render({
      elem: '#score1'  
    });
      var ins3 = rate.render({
      elem: '#score2'  
    });
  });
  </script>
  
  <script type="text/javascript">
  function doReviews(){
		
		var poNo = $("#poNo").val();
		var poAppraise = $("#poAppraise").val();
		if(poAppraise == "") {
			layer.msg("请完整填写信息！", {time:2000, icon:5, shift:6}, function(){
          });
			return;
		} 
		
		
		var loadingIndex = null;
		$.ajax({
      	type : "POST",
      	url  : "${pageContext.request.contextPath}/post/insertAppraise",
      	//async: false,
      	data : {
      		"poNo" : poNo,
      		"poAppraise"  : poAppraise	        		
      		
      	},
      	beforeSend : function(){
      		loadingIndex = layer.msg('处理中', {icon: 16});
      	},
      	success : function(result) {
      		layer.close(loadingIndex);
      		
      		var resObj = JSON.parse(result);
      		
      		if (resObj.result) {
					alert("评价成功");
      			window.location.href = "${pageContext.request.contextPath}/post/searchOrder";
      		} else {
                  layer.msg("评价失败，请重新输入", {time:2000, icon:5, shift:5}, function(){
                  	
                  });
      		}
      	},
      	error : function(err){
      		
      	}
      });
	}
</script>
			
				</div>










