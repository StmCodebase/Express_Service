<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	function doPost(){
		
		var staName = $("#staName").val();
		var staAddress = $("#staAddress").val();
		var staPerson = $("#staPerson").val();
		var staPhone = $("#staPhone").val();
		if(staName == ""||staAddress == ""||staPerson == ""||staPhone == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/station/add" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">			
			<tr>
				<td class="text-right">
					<strong>网点名称:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="staName" name="staName">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>网点地址	:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="staAddress" name="staAddress">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>网点负责人:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="staPerson" name="staPerson">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>负责人电话:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="staPhone" name="staPhone">
				</td>
			</tr>			
			<tr>
				<td colspan="2" class="text-center">
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>




				  