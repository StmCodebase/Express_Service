<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"
    	 deferredSyntaxAllowedAsLiteral="true"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta 	charset="utf-8">
		<meta 	name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1，user-scalable=no">
		<meta 	http-equiv="X-UA-Compatible" content="IE=edge">
		<!-- <meta 	name="viewport" content="width=device-width, initial-scale=1 , user-scalable=no"> -->
		<meta 	name="description" content="">
		<meta 	name="author" content="">
<title>寄快递</title>
<!-- Bootstrap -->
		<link rel="stylesheet" href="${APP_PATH}/plug/bootstrap/css/bootstrap.min.css" type="text/css" />
		<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
		<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
		<!--[if lt IE 9]>
	      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
	      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    	<![endif]-->

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
		</style>
</head>
<body style="background-color: #EEEEEE;">

			<!--
        	作者：offline
        	时间：2019-06-15
        	描述：导航条
        -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
					<a class="navbar-brand" href="#"><strong>天软快递 物流管理平台</strong></a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							<a href="#"><img src="img/icon/Icon (76).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;主页<span class="sr-only">(current)</span></a>
						</li>
						<li class="active">
							<a href="#"><img src="img/icon/Icon (73).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;寄快递</a>
						</li>
						<li>
							<a href="#"><img src="img/icon/Icon (77).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;查快递</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img src="img/icon/Icon (78).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;新闻公告 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">Separated link</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img src="img/icon/Icon (72).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;关于我们 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#"><img src="img/icon/Icon (71).png" style="height: 20px; width: 20px;" />&nbsp;&nbsp;登录/注册</a>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<div class="row" style="margin-top: 50px;">
			<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">

				<div class="row text-center" style="margin: 30px 30px;">

					<div class="progress">
						<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
							<span class="sr-only">30% Complete</span>
						</div>
					</div>
					
					<div class="col-md-10 text-center">
						<div class="row">
							<div class="col-md-4"><h2>寄快递</h2>

                         </div>
                      </div>
                      <div id="hr1"></div>
                      <br />
                      
                          <form action="" method="post" class="form-horizontal">
                         <div class="form-group has-feedback">
                         <label for="inputEmail3" class="col-sm-2 control-label">寄件人姓名</label>
                         <div class="col-sm-10">
                                <input type="text" class="form-control" id="PO_SENDER" name="PO_SENDER" placeholder="请填写联系人姓名" autofocus>
                        </div>
                         </div>
                         
                         <div class="form-group">	
                        <label for="inputPassword3" class="col-md-2 control-label">寄件人电话</label>
                     <div class="col-md-10">
                         <input type="phone" class="form-control" id="PO_SENDER_PHONE" name="PO_SENDER_PHONE" placeholder="请填写手机号" autofocus>
                   </div>
                   </div>
                   
                   <div class="form-group">
                         <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
                         <div class="col-sm-10">
                             <input type="text" class="form-control" id="PO_END_ADDRESS" name="PO_END_ADDRESS" placeholder="请填写所在街道以及详细地址">
                        </div>

                         </div>
                         <br />
                         <div id="hr2"></div>
                         <br />
                         <div class="form-group">
                         <label for="inputEmail3" class="col-sm-2 control-label">收件人姓名</label>
                         <div class="col-sm-10">
                                <input type="text" class="form-control" id="PO_ADDRESSEE" name="PO_ADDRESSEE" placeholder="请填写联系人姓名" autofocus>
                        </div>
                         </div>
                         
                         <div class="form-group">
                        <label for="inputPassword3" class="col-md-2 control-label">收件人电话</label>
                     <div class="col-md-10">
                         <input type="password" class="form-control" id="PO_ADDRESSEE_PHONE" name="PO_ADDRESSEE_PHONE" placeholder="请填写手机号">
                   </div>
                   </div>
                   
                   <div class="form-group">
                         <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
                         <div class="col-sm-10">
                             <input type="text" class="form-control" id="PO_END_ADDRESS" name="PO_END_ADDRESS" placeholder="请填写所在街道以及详细地址">
                        </div>
                        
                        
                         </div>


                    <div class="form-group">
                     <div class="class="col-md-10 text-center"">
                       <div id="hr1">
                </div>
               </div>
               
               </form>
            <form method="post">
            <div class="col-md-4 col-md-offset-4">
                <h3>请选择支付方式</h3>
            </div>
                <br/>
            <br/>
                <br/>
                <br/>
                <br/>
                <br/>
                <br/>
                <br/>
            <div class="col-md-6">
                <span class="glyphicon glyphicon-yen" style="font-size: 40px"></span>
            </div>
             <div class="col-md-5 col-md-offset-1" >
                 <span class="glyphicon glyphicon-signal" style="font-size: 40px"></span>
             </div>
                <div class="col-md-6">
                <input type="radio" name="PayMethod" id="1">
                </div>
            <div class="col-md-5 col-md-offset-1" >
                <input type="radio" name="PayMethod" id="2">
            </div>
                <div class="col-md-6">
                <h5>现金支付</h5>
                </div>
                <div class="col-md-5 col-md-offset-1">
                <h5>在线支付</h5>
                </div>
                <a href="Pay.jsp" class="btn btn-primary btn-lg active" role="button">立即下单</a>
            </form>
                </form>
						
					</div>
					

				</div>

			</div>.
		</div>
		</div>

		<div class="demo1_foot" style="margin-top: 20px;">
			<div class="demo1_foot_div1 text-center">
				<br />
				<font color="white">2019&nbsp;天软快递版权所有</font>
				<br />
				<font color="white">地址：天津市西青区宾水西道399号</font>
				<br />
				<font color="white">邮编：300387</font>
			</div>
		</div>
	

</body>
	<script type="text/javascript" src="${APP_PATH}/plug/jquery/jquery-2.1.1.min.js"></script>
	<script src="${APP_PATH}/plug/bootstrap/js/bootstrap.min.js"></script>
</html>