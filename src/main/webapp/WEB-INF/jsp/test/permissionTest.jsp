<%@ page 	language="java" 
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
	  <title>天软物流管理平台</title>
	  
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/bootstrap/css/bootstrap.min.css">
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/layui/css/layui.css">
	  <link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/css/font-awesome.min.css">
	  <link		rel="stylesheet"	href="${pageContext.request.contextPath}/plug/zTree/css/zTreeStyle/zTreeStyle.css">
	  <style 	type="text/css">
	  	.layui-demo-maincard{
	  		margin: 20px 20px;
	  		height: 95%;
	  	}
	  	
	  	table tr:hover td{
	  		background:#e7eaf6;
	  	}
	  </style>
	</head>

		<body class="layui-layout-body">
		<div class="layui-layout layui-layout-admin">
		  <div class="layui-header">
		    <div class="layui-logo">天软物流管理平台</div>
		    
		    <!-- 头部区域（可配合水平导航） -->
		    
		    <ul class="layui-nav layui-layout-right">
		      <li class="layui-nav-item">
		      	<!-- 顶部右上角用户框 -->
		        <a href="javascript:;">
		          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
		          username位置
		        </a>
		        
		        <dl class="layui-nav-child">
		          <dd><a href="">基本资料</a></dd>
		          <dd style="margin-top:10px ;"><a href="">退出登录</a></dd>
		        </dl>
		        
		      </li>
		    </ul>
		  </div>
		  
		  <!-- 左侧导航最高层 -->
		  <div class="layui-side layui-bg-black">
		    <div class="layui-side-scroll">
		    	
		      <!-- 左侧导航区域（可配合垂直导航） -->
		      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
		      	
		        <li class="layui-nav-item">
		          <a href="javascript:;">企业信息管理</a>
		          <dl class="layui-nav-child">
		            <dd><a href="javascript:;">列表一</a></dd>
		            <dd><a href="javascript:;">列表二</a></dd>
		            <dd><a href="javascript:;">列表三</a></dd>
		            <dd><a href="">超链接</a></dd>
		          </dl>
		        </li>
		        
		        <li class="layui-nav-item">
		          <a href="javascript:;">人员信息管理</a>
		          <dl class="layui-nav-child">
		            <dd><a href="javascript:;">列表一</a></dd>
		            <dd><a href="javascript:;">列表二</a></dd>
		            <dd><a href="javascript:;">列表三</a></dd>
		            <dd><a href="">超链接</a></dd>
		          </dl>
		        </li>
		        
		        <li class="layui-nav-item"><a href="">云市场</a></li>
		        
		        <li class="layui-nav-item"><a href="">发布商品</a></li>
		        
		      </ul>
		      
		      
		    </div>
		  </div>
		  
		  
		  
		  <div class="layui-body layui-bg-gray">
		  	
		    <!-- 内容主体区域 -->
		    <!--<div style="padding: 15px;">内容主体区域</div>-->
		    <div class="layui-card layui-demo-maincard">
				  <div class="layui-card-header" style="text-align:center">合作企业信息</div>
				  <!-- 正式编写内容区域 -->
				  <div class="layui-card-body">
				  	
				  <!-- 此处往上禁止修改 -->
				  	
				  	<ul id="permissionTree" class="ztree"></ul>
					

				  <!-- 此处往下禁止修改 -->
						
				  </div>
				</div>
		  </div>
		  
	  		 <!-- 此处往下禁止修改 -->
		  
		  <div class="layui-footer">
		  	<!-- 底部固定区域 -->
		    <div class="text-center">© 2019-天软快递版权所有</div>
		  </div>
		  
		  
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/plug/layui/layui.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/plug/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/plug/zTree/js/jquery.ztree.all.min.js"></script>
		
		<script type="text/javascript">
			layui.use('element', function(){
			  var element = layui.element;
			});
		
			
			
			$(function(){
				
				var setting = {
						async: {
							enable: true,
							url:"${pageContext.request.contextPath}/permission/loadData",
							autoParam:["id", "name=n", "level=lv"]
						}
				};
			
				$.fn.zTree.init($("#permissionTree"), setting);
			
			})
		
			
			
			$(document).ready(function(){
				

			});
		</script>
	</body>
</html>