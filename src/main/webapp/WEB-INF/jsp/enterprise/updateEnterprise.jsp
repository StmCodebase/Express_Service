<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<script type="text/javascript">
	function doUpdate(){
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
	<form action="${pageContext.request.contextPath}/enterprise/update" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td class="text-right">
					<strong>企业名称:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entName" name="entName"  value="${enterprise.entName}">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>企业地址	:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entAddress" name="entAddress"  value="${enterprise.entAddress}">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>企业负责人:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entPerson" name="entPerson"  value="${enterprise.entPerson}">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>负责人电话:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entPhone" name="entPhone"  value="${enterprise.entPhone}">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>负责人邮箱:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="entEmail" name="entEmail"  value="${enterprise.entEmail}">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>合作期限:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="date" id="entDate" name="entDate"  value="${enterprise.entDate}">
				</td>
			</tr>
			
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=entNo name="entNo" value="${enterprise.entNo }"/>
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>