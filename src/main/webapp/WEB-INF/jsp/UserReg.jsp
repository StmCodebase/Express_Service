<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		
		<title>用户注册</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<meta name="author" content="" />
		<!-- Facebook and Twitter integration -->
		<meta property="og:title" content="" />
		<meta property="og:image" content="" />
		<meta property="og:url" content="" />
		<meta property="og:site_name" content="" />
		<meta property="og:description" content="" />
		<meta name="twitter:title" content="" />
		<meta name="twitter:image" content="" />
		<meta name="twitter:url" content="" />
		<meta name="twitter:card" content="" />

		<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
		<script type="text/javascript" src="${pageContext.request.contextPath}/plug/layer/layer.js"></script>
		<link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/layer/skin/default/layer.css">

		<!-- Animate.css -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/animate.css">
		<!-- Icomoon Icon Fonts-->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/icomoon.css">
		<!-- Themify Icons-->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/themify-icons.css">
		<!-- Bootstrap  -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/bootstrap.css">
		

		<!-- Magnific Popup -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/magnific-popup.css">

		<!-- Owl Carousel  -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/owl.carousel.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/owl.theme.default.min.css">
		

		<!-- Theme style  -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/css/UserCss/style.css">
		<!-- bs -->
		<!--<link rel="stylesheet" href="${pageContext.request.contextPath }/plug/bootstrap/css/bootstrap.min.css" />-->
		<!-- Modernizr JS -->
		<script src="${pageContext.request.contextPath }/plug/js/modernizr-2.6.2.min.js"></script>
		<!-- FOR IE9 below -->
		<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath }/plug/js/respond.min.js"></script>
	<![endif]-->
	<script type="text/javascript">
			function dologin() {
				//		var accNum=document.getElementById("accNum").value;
				//		var accPwd=document.getElementById("accPwd").value;
			//	var accNum = document.forms["loginForm"]["accNum"].value;
			//	var accPwd = document.forms["loginForm"]["accPwd"].value;
				var accNum = $("#accNum").val();
				var accPwd = $("#accPwd").val();
				if(accNum == null || accNum == "") {
					//layer.msg("账号不能为空", {time:2000, icon:5, shift:6});
					alert("账号不能为空");
					return false;
			} 
                else if(accPwd == null || accPwd == "") {
                	//layer.msg("密码不能为空", {time:2000, icon:5, shift:6});
                	alert("mima不能为空");
					return false;
				}else return true;

			}

			
		</script>

	</head>

	<body>

		<div class="gtco-loader"></div>

		<div id="page">

			<div class="page-inner">
				<nav class="gtco-nav" role="navigation">
					<div class="gtco-container">

						<div class="row">
							<div class="col-sm-4 col-xs-12">
								<div id="gtco-logo">
									<a href="index.html">Splash <em>.</em></a>
								</div>
							</div>
							<!--<div class="col-xs-8 text-right menu-1">
								<ul>
									<li>
										<a href="features.html">Features</a>
									</li>
									<li>
										<a href="tour.html">Tour</a>
									</li>
									<li class="has-dropdown">
										<a href="#">Dropdown</a>
										<ul class="dropdown">
											<li>
												<a href="#">Web Design</a>
											</li>
											<li>
												<a href="#">eCommerce</a>
											</li>
											<li>
												<a href="#">Branding</a>
											</li>
											<li>
												<a href="#">API</a>
											</li>
										</ul>
									</li>
									<li>
										<a href="pricing.html">Pricing</a>
									</li>
									<li>
										<a href="contact.html">Contact</a>
									</li>
									<li class="btn-cta">
										<a href="#"><span>Get started</span></a>
									</li>
								</ul>
							</div>-->
						</div>

					</div>
				</nav>

				<header id="gtco-header" class="gtco-cover" role="banner" style="background-image: url(${pageContext.request.contextPath }/plug/img/User/img_4.jpg)">
					<div class="overlay"></div>
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-12 col-md-offset-0 text-left">

								<div class="row row-mt-15em">
									<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
										<span class="intro-text-small">欢迎登陆天软物流服务平台</span>
										<!--<h1>用心服务，不断超越</h1>
										<h1>有求必应，有货必达</h1>-->
										<!--<h1>流通天下，四海为家 </h1>-->
										<h1>专业品质，高效服务，让您放心省心</h1>

									
									</div>
									<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
										<div class="form-wrap">
											<div class="tab">
												<div class="tab1" align="center">新用户注册</div>
												<div class="tab-content">
													<div class="tab-content-inner active" data-content="login">
														<form action="${pageContext.request.contextPath}/account_num/userReg" method="post" onsubmit="return dologin()" id="loginForm">
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="username">账号或邮箱</label>
																	<input type="text" class="form-control" id="accNum" name="accNum" value="${account_num.accNum }">
																</div>
															</div>
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="password">密码</label>
																	<input type="password" class="form-control" id="accPwd" name="accPwd">
																</div>
															</div>
															<!--<div class="row form-group">
																<div class="col-md-12">
																	<label for="password2">Repeat Password</label>
															        <input type="password" class="form-control" id="password2">
																	<span>	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">新户注册</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
																		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																		<a href="#">管理员入口</a></span>
																
																</div>
															</div>-->

															<div class="row form-group">
																<div class="col-md-12">
																	<input type="submit" align="centers" class="btn btn-primary btn-default btn-block" value="注册">
																</div>
															</div>
														</form>
													</div>


													<!--<div class="tab-content-inner" data-content="singup">
														<form action="#">
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="username">Username or Email</label>
																	<input type="text" class="form-control" id="username">
																</div>
															</div>
															<div class="row form-group">
																<div class="col-md-12">
																	<label for="password">Password</label>
																	<input type="password" class="form-control" id="password">
																</div>
															</div>

															<div class="row form-group">
																<div class="col-md-12">
																	<input type="submit" class="btn btn-primary" value="注册">
																</div>
															</div>
														</form>
													</div>-->

												</div>
											</div>
										</div>
									</div>
									
									
									
									
								</div>

							</div>
						</div>
					</div>
				</header>

				<div class="gtco-section border-bottom">
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
								<h2>Beautiful Images</h2>
								<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="img/User/img_2.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="img/User/img_2.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>Constructive heading</h2>
										<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="img/User/img_3.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="img/User/img_3.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>Constructive heading</h2>
										<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="img/User/img_4.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="img/User/img_4.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>Constructive heading</h2>
										<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
									</div>
								</a>
							</div>

							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="images/img_1.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="images/img_1.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>Constructive heading</h2>
										<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="images/img_5.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="images/img_5.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>Constructive heading</h2>
										<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
									</div>
								</a>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6">
								<a href="images/img_6.jpg" class="fh5co-project-item image-popup">
									<figure>
										<div class="overlay"><i class="ti-plus"></i></div>
										<img src="images/img_6.jpg" alt="Image" class="img-responsive">
									</figure>
									<div class="fh5co-text">
										<h2>Constructive heading</h2>
										<p>Far far away, behind the word mountains, far from the countries Vokalia..</p>
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
								<h2>Splash Features</h2>
								<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-vector"></i>
						</span>
									<h3>Pixel Perfect</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-tablet"></i>
						</span>
									<h3>Fully Responsive</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-settings"></i>
						</span>
									<h3>Web Development</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-ruler-pencil"></i>
						</span>
									<h3>Web Design</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>

							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-paint-roller"></i>
						</span>
									<h3>Accent Colours</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-announcement"></i>
						</span>
									<h3>Theme Updates</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-stats-up"></i>
						</span>
									<h3>Increase Earnings</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box" data-animate-effect="fadeIn">
									<span class="icon">
							<i class="ti-magnet"></i>
						</span>
									<h3>Passive Income</h3>
									<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
								</div>
							</div>

						</div>
					</div>
				</div>

				<div id="gtco-counter" class="gtco-section">
					<div class="gtco-container">

						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box">
								<h2>Fun Facts</h2>
								<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p>
							</div>
						</div>

						<div class="row">

							<div class="col-md-3 col-sm-6 animate-box" data-animate-effect="fadeInLeft">
								<div class="feature-center">
									<span class="icon">
							<i class="ti-settings"></i>
						</span>
									<span class="counter js-counter" data-from="0" data-to="22070" data-speed="5000" data-refresh-interval="50">1</span>
									<span class="counter-label">Creativity Fuel</span>

								</div>
							</div>
							<div class="col-md-3 col-sm-6 animate-box" data-animate-effect="fadeInLeft">
								<div class="feature-center">
									<span class="icon">
							<i class="ti-face-smile"></i>
						</span>
									<span class="counter js-counter" data-from="0" data-to="97" data-speed="5000" data-refresh-interval="50">1</span>
									<span class="counter-label">Happy Clients</span>
								</div>
							</div>
							<div class="col-md-3 col-sm-6 animate-box" data-animate-effect="fadeInLeft">
								<div class="feature-center">
									<span class="icon">
							<i class="ti-briefcase"></i>
						</span>
									<span class="counter js-counter" data-from="0" data-to="402" data-speed="5000" data-refresh-interval="50">1</span>
									<span class="counter-label">Projects Done</span>
								</div>
							</div>
							<div class="col-md-3 col-sm-6 animate-box" data-animate-effect="fadeInLeft">
								<div class="feature-center">
									<span class="icon">
							<i class="ti-time"></i>
						</span>
									<span class="counter js-counter" data-from="0" data-to="212023" data-speed="5000" data-refresh-interval="50">1</span>
									<span class="counter-label">Hours Spent</span>

								</div>
							</div>

						</div>
					</div>
				</div>

				<div id="gtco-products">
					<div class="gtco-container">
						<div class="row">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
								<h2>More Products</h2>
								<p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p>
							</div>
						</div>
						<div class="row">
							<div class="owl-carousel owl-carousel-carousel">
								<div class="item">
									<a href="#"><img src="images/img_1.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								<div class="item">
									<a href="#"><img src="images/img_2.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								<div class="item">
									<a href="#"><img src="images/img_3.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
								<div class="item">
									<a href="#"><img src="images/img_4.jpg" alt="Free HTML5 Bootstrap Template by "></a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div id="gtco-subscribe">
					<div class="gtco-container">
						<div class="row animate-box">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
								<h2>Subscribe</h2>
								<p>Be the first to know about the new templates.</p>
							</div>
						</div>
						<div class="row animate-box">
							<div class="col-md-8 col-md-offset-2">
								<form class="form-inline">
									<div class="col-md-6 col-sm-6">
										<div class="form-group">
											<label for="email" class="sr-only">Email</label>
											<input type="email" class="form-control" id="email" placeholder="Your Email">
										</div>
									</div>
									<div class="col-md-6 col-sm-6">
										<button type="submit" class="btn btn-default btn-block">Subscribe</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>

				<footer id="gtco-footer" role="contentinfo">
					<div class="gtco-container">
						<div class="row row-p	b-md">

							<div class="col-md-4">
								<div class="gtco-widget">
									<h3>About <span class="footer-logo">Splash<span>.<span></span></h3>
									<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore eos molestias quod sint ipsum possimus temporibus officia iste perspiciatis consectetur in fugiat repudiandae cum. Totam cupiditate nostrum ut neque ab?</p>
								</div>
							</div>

							<div class="col-md-4 col-md-push-1">
								<div class="gtco-widget">
									<h3>Links</h3>
									<ul class="gtco-footer-links">
										<li>
											<a href="#">Knowledge Base</a>
										</li>
										<li>
											<a href="#">Career</a>
										</li>
										<li>
											<a href="#">Press</a>
										</li>
										<li>
											<a href="#">Terms of services</a>
										</li>
										<li>
											<a href="#">Privacy Policy</a>
										</li>
									</ul>
								</div>
							</div>

							<div class="col-md-4">
								<div class="gtco-widget">
									<h3>Get In Touch</h3>
									<ul class="gtco-quick-contact">
										<li>
											<a href="#"><i class="icon-phone"></i> +1 234 567 890</a>
										</li>
										<li>
											<a href="#"><i class="icon-mail2"></i> info@</a>
										</li>
										<li>
											<a href="#"><i class="icon-chat"></i> Live Chat</a>
										</li>
									</ul>
								</div>
							</div>

						</div>

						<div class="row copyright">
							<div class="col-md-12">
								<p class="pull-left">
									<small class="block">Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://guantaow.taobao.com/">厚朴网络淘宝店</a><a target="_blank" href="http://www.moobnn.com">网页模板</a></small>
								</p>
								<p class="pull-right">
									<ul class="gtco-social-icons pull-right">
										<li>
											<a href="#"><i class="icon-twitter"></i></a>
										</li>
										<li>
											<a href="#"><i class="icon-facebook"></i></a>
										</li>
										<li>
											<a href="#"><i class="icon-linkedin"></i></a>
										</li>
										<li>
											<a href="#"><i class="icon-dribbble"></i></a>
										</li>
									</ul>
								</p>
							</div>
						</div>

					</div>
				</footer>
			</div>

		</div>

		<div class="gototop js-top">
			<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
		</div>

		<!-- jQuery -->
		<script src="${pageContext.request.contextPath }/plug/js/jquery.min.js"></script>
		<!-- jQuery Easing -->
		<script src="${pageContext.request.contextPath }/plug/js/jquery.easing.1.3.js"></script>
		<!-- Bootstrap -->
		<script src="${pageContext.request.contextPath }/plug/js/bootstrap.min.js"></script>
		<!-- Waypoints -->
		<script src="${pageContext.request.contextPath }/plug/js/jquery.waypoints.min.js"></script>
		<!-- Carousel -->
		<script src="${pageContext.request.contextPath }/plug/js/owl.carousel.min.js"></script>
		<!-- countTo -->
		<script src="${pageContext.request.contextPath }/plug/js/jquery.countTo.js"></script>
		<!-- Magnific Popup -->
		<script src="${pageContext.request.contextPath }/plug/js/jquery.magnific-popup.min.js"></script>
		<script src="${pageContext.request.contextPath }/plug/js/magnific-popup-options.js"></script>
		<!-- Main -->
		<script src="${pageContext.request.contextPath }/plug/js/main.js"></script>

	</body>

</html>