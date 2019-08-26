<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/plug/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/layer/layer.js"></script>
<link 	rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/layer/skin/default/layer.css">

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/user/updateAdmin" method="post" accept-charset="utf-8" >
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td class="text-right">
					<strong>用户姓名:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uName" name="uName" value="${user.uName }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>用户邮箱	:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uEmail" name="uEmail" value="${user.uEmail }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>用户电话	:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uPhone" name="uPhone" value="${user.uPhone }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>用户性别:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uSex" name="uSex" value="${user.uSex }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>身份证号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="uNum" name="uNum" value="${user.uNum }">
				</td>
			</tr>	
			
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=uNo name="uNo" value="${user.uNo }"/>
				<input class="form-control" type="hidden" id="gNo" name="gNo" value="${user.gNo }">
					<input class="btn btn-default" type="button" value="提交" onclick="doAjaxUpdate()"/>
				</td>
			</tr>
		</table>
	</form>
</div>

<script type="text/javascript">
	
		
		
		function doAjaxUpdate(){
			var uName = $("#uName").val();
			var uEmail = $("#uEmail").val();
			var uPhone = $("#uPhone").val();
			var uSex = $("#uSex").val();
			var uNum = $("#uNum").val();
			var uNo = $("#uNo").val();
			if(uName == null || uEmail == ""|| uPhone == ""|| uSex == ""|| uNum == "") {
				layer.msg("请完整填写信息！", {time:2000, icon:5, shift:6}, function(){
                });
				return;
			} 
			
			
			var loadingIndex = null;
			$.ajax({
	        	type : "POST",
	        	url  : "${pageContext.request.contextPath}/worker/updateAdmin",
	        	//async: false,
	        	data : {
	        		"uName" : uName,
	        		"uEmail"  : uEmail,
	        		"uPhone" : uPhone,
	        		"uSex"  : uSex,
	        		"uName" : uName,
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
	        			window.location.href = "${pageContext.request.contextPath}	/adminMain";
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
	
	
				