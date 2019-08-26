<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


		<!-- Bootstrap -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/bootstrap/css/bootstrap.min.css" type="text/css" />
		<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
		<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
		<!--[if lt IE 9]>
	      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
	      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    	<![endif]-->
    	
    	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">

		
		<link rel="icon" href="${ctx}/favicon.ico" type="image/x-icon" />

         <link rel="shortcut icon" href="${ctx}/favicon.ico" type="image/x-icon" />
		
		
		

		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/animate.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/icomoon.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/themify-icons.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/bootstrap.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/magnific-popup.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/owl.carousel.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/owl.theme.default.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/login/style.css">
		<script src="${pageContext.request.contextPath}/plug/js/login/modernizr-2.6.2.min.js"></script>
	
	
	
		<div>
			
		<!--
        	作者：offline
        	时间：2019-06-15
        	描述：轮播图
        -->
		<div id="carousel-example-generic" class="carousel slide demo1_poster" data-ride="carousel" data-interval = "3000">
			<!-- Indicators圆点-->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="${pageContext.request.contextPath}/plug/img/poster/3.png">
					<div class="carousel-caption">
						<!--
                        	作者：offline
                        	时间：2019-06-15
                        	描述：文字位
                        -->
					</div>
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/plug/img/poster/1.png">
					<div class="carousel-caption">
						<!--
                        	作者：offline
                        	时间：2019-06-15
                        	描述：文字位
                        -->
					</div>
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/plug/img/poster/2.png">
					<div class="carousel-caption">
						<!--
                        	作者：offline
                        	时间：2019-06-15
                        	描述：文字位
                        -->
					</div>
				</div>

			</div>

			<!-- Controls -->
			<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>

		<!--
        	作者：offline
        	时间：2019-06-16
        	描述：装饰线
       	-->
		<div class="container demo1_hr">
			<!--<hr />-->
		</div>

		<!--
        	作者：offline
        	时间：2019-06-15
        	描述：宣传文字
        -->
		<!--<div class="col-md-12 demo1_text_h1">
			<h1 class="text-center"><strong>业务介绍</strong></h1>
		</div>-->
		
						<div class="gtco-section border-bottom">
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
								<h2>业务介绍</h2>
								<p>ACE Main Business Introduced</p>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="${pageContext.request.contextPath}/plug/img/images/img_7.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="${pageContext.request.contextPath}/plug/img/images/img_7.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>快递服务</h2>
										<p>海陆空多式联运<br>
										    收寄订单急速响应<br />
										    让客户享受快递新生活
										</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="${pageContext.request.contextPath}/plug/img/images/img_8.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="${pageContext.request.contextPath}/plug/img/images/img_10.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>仓储服务</h2>
										<p>弹性仓库服务能力<br/>
											领先科技物流技术<br>
											专业运营管理团队
										</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="${pageContext.request.contextPath}/plug/img/images/img_9.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="${pageContext.request.contextPath}/plug/img/images/img_9.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>生鲜速运</h2>
										<p>为了保障生鲜类快件的配送时效和商品品质，实现同类产品优先配载、优先派送，面向寄递生鲜快件的客户推出的专属快递服务</p>
									</div>
								</a>
							</div>
							
							<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
								<h2>企业文化</h2>
								<p>The enterprise culture</p>
							</div>
						</div>

							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="${pageContext.request.contextPath}/plug/img/images/img_12.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="${pageContext.request.contextPath}/plug/img/images/img_12.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2></h2>
										<p>通过安全、快捷的服务，<br/>传爱心、送温暖、更便利。</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="${pageContext.request.contextPath}/plug/img/images/img_13.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="${pageContext.request.contextPath}/plug/img/images/img_13.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2></h2>
										<p>用心服务，<br/>承诺必达！</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="${pageContext.request.contextPath}/plug/img/images/img_14.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="${pageContext.request.contextPath}/plug/img/images/img_14.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2></h2>
										<p>求实进取、 以人为本，成为值得信赖、服务更好的一流快递公司。</p>
									</div>
								</a>
							</div>

						</div>
					</div>
				</div>
				
								<div id="gtco-features" class="border-bottom">
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box">
								<h2>成功案例</h2>
								<p>Successful cases</p>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
										<span class="icon">
							<i class="ti-heart"></i>	
						</span>
									<a href="${pageContext.request.contextPath}/static/healthcare"><h3>医疗行业</h3></a>
									<p>重走天路，天软医药冷链西藏行！ </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-tablet"></i>
						</span>
									<a href="${pageContext.request.contextPath}/static/electron"><h3>电子行业</h3></a>
									<p>手机新品首发，天软快递为您保驾护航</p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon" >
										<i class="ti-home"></i>
							
						</span>
									<a href="${pageContext.request.contextPath}/static/fresh"><h3>生鲜行业</h3></a>
									<p>新鲜果蔬极速到家 </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-shopping-cart"></i>
						</span>
									<a href="${pageContext.request.contextPath}/static/fmcg"><h3>快消行业</h3></a>
									<p>XX客户服务案例——周黑鸭 </p>
								</div>
							</div>

						</div>
					</div>
				</div>
				
								<div id="gtco-products">
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
								<h2>企业形象</h2>
								<p>Corporate Image</p>
							</div>
						</div>
						<div class="row">
							<div class="owl-carousel owl-carousel-carousel">
								<div class="item">
									<a href="#"><img src="${pageContext.request.contextPath}/plug/img/images/img_24.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								<div class="item">
									<a href="#"><img src="${pageContext.request.contextPath}/plug/img/images/img_23.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								<div class="item">
									<a href="#"><img src="${pageContext.request.contextPath}/plug/img/images/img_25.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								<div class="item">
									<a href="#"><img src="${pageContext.request.contextPath}/plug/img/images/img_27.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								
							</div>
						</div>
						
					</div>
					

				</div>







</div>
	