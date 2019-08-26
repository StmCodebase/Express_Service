<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/animate.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/icomoon.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/themify-icons.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/bootstrap.css">


	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/magnific-popup.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/owl.carousel.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/owl.theme.default.min.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/userInfor/style.css">
	
	
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
				<div class="col-xs-8 text-right menu-1">				
				</div>
			</div>
			
		</div>
	</nav>
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_50.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-14 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
								<h1>用户个人信息</h1>	
							<h1>Personal Information</h1>	
						</div>
						
					</div>
							
					
				</div>
			</div>
		</div>
	</header>
	
    	<div class="row" style="margin-top: 50px;">
			<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">

				<div class="row text-center" style="margin: 30px 30px;">	

					<div class="col-md-12 text-center">
						<div class="row">
							<div class="col-md-4"><h2>个人信息</h2>

                         </div>
                      </div>
                      <div id="hr1"></div>
                      <br />
                      
      <form action="" method="post" class="form-horizontal">
                      <div class="form-group has-feedback"  style="left:100px;">
                      <label for="inputEmail3" class="col-sm-2 control-label">用户姓名</label>
                      <div class="col-sm-10">
                             <input type="text" class="form-control" style="width:400px;" id="uName" name="uName" placeholder="${user.uName }" >
                     </div>
                      </div>
                      
                      <div class="form-group has-feedback"  style="left:100px;">	
                     <label for="inputPassword3" class="col-md-2 control-label">用户邮箱</label>
                  		<div class="col-md-10">
                      <input type="phone" class="form-control" style="width:400px;"  id="uEmail" name="uEmail" placeholder="${user.uEmail }" >
                		</div>
               		 </div>                
               
                
                <div class="form-group has-feedback"  style="left:100px;">
                      <label for="inputEmail3" class="col-sm-2 control-label">用户电话</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" style="width:400px;"  id="uPhone" name="uPhone" placeholder="${user.uPhone }">
                     </div>

                      </div>                      
                      <div class="form-group has-feedback"  style="left:100px;">
                      <label for="inputEmail3" class="col-sm-2 control-label">用户性别</label>
                      <div class="col-sm-10">
                            <input type="text" class="form-control" style="width:400px;"  id="uSex" name="uSex" placeholder="${user.uSex }" >
                     </div>
                      </div> 
               
                <div class="form-group has-feedback"  style="left:100px;">
                      <label for="inputEmail3" class="col-sm-2 control-label">身份证号</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control"  style="width:400px;" id="uNum" name="uNum" placeholder="${user.uNum }">
                     </div>                     
               </div>               
             	

                 <div class="form-group">
                  <div class="class="col-md-10 text-center"">
                    
                    <input type="hidden" id=uNo name="uNo" value="${user.uNo }"/>
							<input class="form-control" type="hidden" id="gNo" name="gNo" value="${user.gNo }">
								<input class="btn btn-info" type="button" value="修改" onclick="doAjaxUpdate()"/>
             </div>
            </div>
            </div>
            
          </form>         
                      
					</div>
					

				</div>

			</div>
			
			<div class="bottom-tu">
								<div class="pics">
									<img src="${pageContext.request.contextPath}/plug/img/userInfo/img_51.jpg" alt="" class="pic1">
									<img src="${pageContext.request.contextPath}/plug/img/userInfo/img_53.jpg" alt="" class="pic2">
								</div>
							</div>
			
			
		</div>
		
		</div>
	</div>
	
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="glyphicon glyphicon-triangle-top"></i></a>
	</div>
	
		

<script type="text/javascript">
	
		
		
		function doAjaxUpdate(){
			var uName = $("#uName").val();
			var uEmail = $("#uEmail").val();
			var uPhone = $("#uPhone").val();
			var uSex = $("#uSex").val();
			var uNum = $("#uNum").val();
			var uNo = $("#uNo").val();
			if(uName == "" || uEmail == ""|| uPhone == ""|| uSex == ""|| uNum == "") {
				layer.msg("请完整填写信息！", {time:2000, icon:5, shift:6}, function(){
                });
				return;
			} 
			
			
			var loadingIndex = null;
			$.ajax({
	        	type : "POST",
	        	url  : "${pageContext.request.contextPath}/user/updateUser2",
	        	//async: false,
	        	data : {
	        		"uName" : uName,
	        		"uEmail"  : uEmail,
	        		"uPhone" : uPhone,
	        		"uSex"  : uSex,
	        		"uName" : uName,
	        		"uNum" : uNum,
	        		"uNo"  : uNo
	        		
	        	},
	        	beforeSend : function(){
	        		loadingIndex = layer.msg('处理中', {icon: 16});
	        	},
	        	success : function(result) {
	        		layer.close(loadingIndex);
	        		
	        		var resObj = JSON.parse(result);
	        		
	        		if (resObj.result) {
						layer.msg("修改成功", {time:20000, icon:6, shift:6}, function(){
	                    	
	                    });
	        			window.location.href = "${pageContext.request.contextPath}/userMain";
	        		} else {
	                    layer.msg("信息填写错误，请重新输入", {time:2000, icon:5, shift:5}, function(){
	                    	
	                    });
	        		}
	        	},
	        	error : function(err){
	        		
	        	}
	        });
		}
		
	</script>
	