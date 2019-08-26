<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	function doPost(){
		
		var entName = $("#entName").val();
		var entAddress = $("#entAddress").val();
		var entPerson = $("#entPerson").val();
		var entPhone = $("#entPhone").val();
		var entEmail = $("#entEmail").val();
		var entDate = $("#entDate").val();
		if(entName == ""||entAddress == ""||entPerson == ""||entEmail == ""||entPhone == ""||entDate == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/enterprise/add" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			
			<tr>
				<td class="text-right">
					<strong>企业名称:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entName" name="entName">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>企业地址	:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entAddress" name="entAddress">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>企业负责人:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entPerson" name="entPerson">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>负责人电话:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entPhone" name="entPhone">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>负责人邮箱:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entEmail" name="entEmail">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>合作期限:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="date" id="entDate" name="entDate">
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




				  