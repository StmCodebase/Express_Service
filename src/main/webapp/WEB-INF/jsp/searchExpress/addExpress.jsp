<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

    
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/animate.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/icomoon.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/themify-icons.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/bootstrap.css">


	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/magnific-popup.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/owl.carousel.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/owl.theme.default.min.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plug/css/addExpress/style.css">
<!--  
	<script src="${pageContext.request.contextPath}/plug/js/modernizr-2.6.2.min.js"></script>
-->
	
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
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(${pageContext.request.contextPath}/plug/img/images/img_34.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small"></span>
								<h1>寄快递</h1>	
							<h1>express delivery</h1>	
						</div>
						
					</div>
							
					
				</div>
			</div>
		</div>
	</header>
	
<div class="row" style="margin-top: 50px;">
			<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">

	</div>
			
  
	<div class="row text-center" style="margin: 30px 30px;">

					<div class="progress">
						<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
							<span class="sr-only">30% Complete</span>
						</div>
					</div>
					
					<div class="col-md-12 text-center">
						<div class="row">
							<div class="col-md-4">

                         </div>
                      </div>
                      <div id="hr1"></div>
                      <br />
	
	<form action="" method="post" class="form-horizontal">
                      <div class="form-group has-feedback">
                      <label for="inputEmail3" class="col-sm-2 control-label">寄件人姓名</label>
                      <div class="col-sm-10">
                             <input type="text" class="form-control" id="poSender" name="poSender" placeholder="请填写联系人姓名" >
                     </div>
                      </div>
                      
                      <div class="form-group">	
                     <label for="inputPassword3" class="col-md-2 control-label">寄件人电话</label>
                  <div class="col-md-10">
                      <input type="phone" class="form-control" id="poSenderPhone" name="poSenderPhone" placeholder="请填写手机号" >
                </div>
                </div>
                
                <div class="form-group">	
                     <label for="inputPassword3" class="col-md-2 control-label">寄件人地址</label>
                  <div class="col-md-10">
                  		 	<select style="width: 100px" id="s1" >
						        <option >--请选择--</option>
						    </select> 
						    <select style="width: 100px" id="s2">
						        <option >--请选择--</option>
						    </select>
						    <select style="width: 100px" id="s3">
						        <option >--请选择--</option>
						    </select>
                </div>
                </div>
                
                <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poStarAddress" name="poStarAddress" placeholder="请填写所在街道以及详细地址">
                     </div>

                      </div>
                      <br />
                      <div id="hr2"></div>
                      <br />
                      <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">收件人姓名</label>
                      <div class="col-sm-10">
                            <input type="text" class="form-control" id="poAddressee" name="poAddressee" placeholder="请填写联系人姓名" >
                     </div>
                      </div>
                      
                      <div class="form-group">
                     <label for="inputPassword3" class="col-md-2 control-label">收件人电话</label>
                  <div class="col-md-10">
                     <input type="text" class="form-control" id="poAddresseePhone" name="poAddresseePhone" placeholder="请填写手机号">
                </div>
                </div>
                
                <div class="form-group">	
                     <label for="inputPassword3" class="col-md-2 control-label">收件人地址</label>
                  <div class="col-md-10">
                  		 	<select style="width: 100px" id="d1" >
						        <option >--请选择--</option>
						    </select> 
						    <select style="width: 100px" id="d2">
						        <option >--请选择--</option>
						    </select>
						    <select style="width: 100px" id="d3">
						        <option >--请选择--</option>
						    </select>                  
                </div>
                </div>
                
                <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poEndAddress" name="poEndAddress" placeholder="请填写所在街道以及详细地址">
                     </div>                     
               </div>
               <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">重量</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poWeight" name="poWeight" placeholder="请填写快递重量" >
                     </div>                     
               </div>
               <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">价格</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poPrice" name="poPrice" readonly="readonly" value="">
                     </div>                     
               </div>		

                 <div class="form-group">
                  <div class="class="col-md-10 text-center"">
                    <div id="hr1">
             </div>
            </div>
            </div>
            
          </form>
	
	
	<div>
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
                <a class="btn btn-primary btn-lg active" role="button" onclick="doAjaxPost()">立即下单</a>
            </form>
		</div>
	
	</div>
	
	</div>
		</div>
		
				<div class="bottom-tu">
								<div class="pics">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_36.jpg" alt="" class="pic1">
									<img src="${pageContext.request.contextPath}/plug/img/images/img_37.jpg" alt="" class="pic2">
								</div>
							</div>
	

	</div>
		
		<div class="gototop js-top">
		<a href="#" class="js-gotop"><span class="glyphicon glyphicon-triangle-top" aria-hidden="true"></span></a>
	</div>
	

  
   
   
   
<!--
	<div class="row" style="margin-top: 50px;">
			<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">

	</div>
			
  
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
                             <input type="text" class="form-control" id="poSender" name="poSender" placeholder="请填写联系人姓名" autofocus>
                     </div>
                      </div>
                      
                      <div class="form-group">	
                     <label for="inputPassword3" class="col-md-2 control-label">寄件人电话</label>
                  <div class="col-md-10">
                      <input type="phone" class="form-control" id="poSenderPhone" name="poSenderPhone" placeholder="请填写手机号" autofocus>
                </div>
                </div>
                
                <div class="form-group">	
                     <label for="inputPassword3" class="col-md-2 control-label">寄件人地址</label>
                  <div class="col-md-10">
                  		 	<select style="width: 100px" id="s1" >
						        <option >--请选择--</option>
						    </select> 
						    <select style="width: 100px" id="s2">
						        <option >--请选择--</option>
						    </select>
						    <select style="width: 100px" id="s3">
						        <option >--请选择--</option>
						    </select>
                </div>
                </div>
                
                <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poStarAddress" name="poStarAddress" placeholder="请填写所在街道以及详细地址">
                     </div>

                      </div>
                      <br />
                      <div id="hr2"></div>
                      <br />
                      <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">收件人姓名</label>
                      <div class="col-sm-10">
                            <input type="text" class="form-control" id="poAddressee" name="poAddressee" placeholder="请填写联系人姓名" autofocus>
                     </div>
                      </div>
                      
                      <div class="form-group">
                     <label for="inputPassword3" class="col-md-2 control-label">收件人电话</label>
                  <div class="col-md-10">
                     <input type="text" class="form-control" id="poAddresseePhone" name="poAddresseePhone" placeholder="请填写手机号">
                </div>
                </div>
                
                <div class="form-group">	
                     <label for="inputPassword3" class="col-md-2 control-label">收件人地址</label>
                  <div class="col-md-10">
                  		 	<select style="width: 100px" id="d1" >
						        <option >--请选择--</option>
						    </select> 
						    <select style="width: 100px" id="d2">
						        <option >--请选择--</option>
						    </select>
						    <select style="width: 100px" id="d3">
						        <option >--请选择--</option>
						    </select>                  
                </div>
                </div>
                
                <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poEndAddress" name="poEndAddress" placeholder="请填写所在街道以及详细地址">
                     </div>                     
               </div>
               <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">重量</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poWeight" name="poWeight" placeholder="请填写快递重量" >
                     </div>                     
               </div>
               <div class="form-group">
                      <label for="inputEmail3" class="col-sm-2 control-label">价格</label>
                      <div class="col-sm-10">
                          <input type="text" class="form-control" id="poPrice" name="poPrice" readonly="readonly" value="">
                     </div>                     
               </div>		

                 <div class="form-group">
                  <div class="class="col-md-10 text-center"">
                    <div id="hr1">
             </div>
            </div>
            </div>
            
          </form>
	
	
	<div>
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
                <a class="btn btn-primary btn-lg active" role="button" onclick="doAjaxPost()">立即下单</a>
            </form>
		</div>
	
	</div>
	
	</div>
	-->

</div>
	

							
<script type="text/javascript">
			
			$("#poWeight").change(function(){
			var poWeight = $("#poWeight").val();
		//	var price = $("#poPrice").val();
			if(poWeight<5){
				document.getElementById('poPrice').value=20;
			}else if(poWeight>=5){
				document.getElementById('poPrice').value=(poWeight-5)*3;
			}else {
				document.getElementById('poPrice').value="输入错误！";
			}
			
			})
			
		$(function(){
			  
			   $.ajax({
				   type:"post",
				   url:"${pageContext.request.contextPath}/city/provice",
				   dataType:"json",
				   success:function(result){
					   for(var i=0;i<result.length;i++ ){
						   $("#s1").append("<option value='"+result[i].cProvince+"'>"+result[i].cProvince+"</option>");
					   }
				   }
			   });
		})
		
			 $("#s1").change(function(){
			   $("#s2 option:gt(0)").remove();
			   $("#s3 option:gt(0)").remove();
			   var cProvince = $("#s1 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/city/city2",
				   data:{"cProvince":cProvince},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#s2").append("<option value='"+result[i].cCity+"'>"+result[i].cCity+"</option>");
				   }
			   }
			  })
		})
		
		 $("#s2").change(function(){
			   $("#s3 option:gt(0)").remove();
			   var cCity = $("#s2 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/city/area",
				   data:{"cCity":cCity},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#s3").append("<option value='"+result[i].cno+"'>"+result[i].cArea+"</option>");
				   }
			   }
			  })
		})
		
		
		
		
		
		$(function(){	  
			   $.ajax({
				   type:"post",
				   url:"${pageContext.request.contextPath}/city/provice",
				   dataType:"json",
				   success:function(result){
					   for(var i=0;i<result.length;i++ ){
						   $("#d1").append("<option value='"+result[i].cProvince+"'>"+result[i].cProvince+"</option>");
					   }
				   }
			   });
		})
		
			 $("#d1").change(function(){
			   $("#d2 option:gt(0)").remove();
			   $("#d3 option:gt(0)").remove();
			   var cProvince = $("#d1 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/city/city2",
				   data:{"cProvince":cProvince},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#d2").append("<option value='"+result[i].cCity+"'>"+result[i].cCity+"</option>");
				   }
			   }
			  })
		})
		
		 $("#d2").change(function(){
			   $("#d3 option:gt(0)").remove();
			   var cCity = $("#d2 option:selected").val();
					$.ajax({
					type:"post",
				   url:"${pageContext.request.contextPath}/city/area",
				   data:{"cCity":cCity},
				   dataType:"json",
				   success:function(result){
				   for(var i=0;i<result.length;i++ ){
						   $("#d3").append("<option value='"+result[i].cno+"'>"+result[i].cArea+"</option>");
				   }
			   }
			  })
		})
		
		function doAjaxPost(){
			var poSender = $("#poSender").val();
			var poSenderPhone = $("#poSenderPhone").val();
			var poStarAddress = $("#poStarAddress").val();
			var poAddressee = $("#poAddressee").val();
			var poAddresseePhone = $("#poAddresseePhone").val();
			var poEndAddress = $("#poEndAddress").val();
			var poWeight = $("#poWeight").val();
			var poPrice = $("#poPrice").val();
			var cnoStar = $("#s3").val();
			var cnoEnd = $("#d3").val();
			if(poSender == null || poSender == ""||poSenderPhone == null ||
					poSenderPhone == ""||poStarAddress == null || poStarAddress == ""||
					poAddresseePhone == null || poAddresseePhone == ""||poAddressee == null || 
					poAddressee == ""||poEndAddress == null || poEndAddress == ""||poWeight == null || poWeight == ""||
					poPrice == ""||cnoEnd==null||cnoStar==null) {
				layer.msg("请完整输入信息！", {time:2000, icon:5, shift:6}, function(){
                });
				return;
			} 
			
			
			var loadingIndex = null;
			$.ajax({
	        	type : "POST",
	        	url  : "${pageContext.request.contextPath}/post/submitExpress",
	        	//async: false,
	        	data : {
	        		"poSenderPhone" : poSenderPhone,
	        		"poSender" : poSender,
	        		"poStarAddress" : poStarAddress,
	        		"poAddressee" : poAddressee,
	        		"poAddresseePhone" : poAddresseePhone,
	        		"poEndAddress" : poEndAddress,
	        		"poWeight" : poWeight,
	        		"cnoStar" : cnoStar,
	        		"cnoEnd" : cnoEnd,
	        		"poPrice" : poPrice
	        	},
	        	beforeSend : function(){
	        		loadingIndex = layer.msg('处理中', {icon: 16});
	        	},
	        	success : function(result) {
	        		layer.close(loadingIndex);
	        		
	        		var resObj = JSON.parse(result);
	        		
	        		if (resObj.result) {
	        			window.location.href = "${pageContext.request.contextPath}/post/pay";
	        		} else {
	                    layer.msg("信息录入失败，请重试", {time:2000, icon:5, shift:6}, function(){
	                    	
	                    });
	        		}
	        	},
	        	error : function(err){
	        		
	        	}
	        });
		}
		
		
		
		
		//onfocus="this.value = '';" onblur="if (this.value == '')" 
	</script>

	
	<!-- jQuery -->
	<!--  
	<script src="${pageContext.request.contextPath}/plug/js/jquery.min.js"></script>
	 -->

