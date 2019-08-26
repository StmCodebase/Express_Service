<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<script type="text/javascript">
	function doUpdate(){
		var gNo = $("#gNo").val();
		var uName = $("#uName").val();
		var uEmail = $("#uEmail").val();
		var uPhone = $("#uPhone").val();
		var uSex = $("#uSex").val();
		var uNum = $("#uNum").val();
		if(gNo == ""||uName == ""||uEmail == ""||uPhone == ""||uSex == ""||uNum == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
    }
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/user/update" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
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
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>