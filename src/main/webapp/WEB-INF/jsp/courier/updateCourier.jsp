<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var courierName = $("#courierName").val();
		var staNo = $("#staNo").val();
		var courierPhone = $("#courierPhone").val();
		var courierSex = $("#courierSex").val();
		var courierEmail = $("#courierEmail").val();
		var courierNum = $("#courierNum").val();
		
		if(courierName == ""||staNo == ""||courierPhone == ""||courierSex == ""||courierEmail == ""||courierNum == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/courier/update" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;" >		
		
			<tr>
				<td class="text-right">
					<strong>网点编号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="staNo" name="staNo" value = "${courier.staNo }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>姓名:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="courierName" name="courierName" value = "${courier.courierName }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>手机:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="courierPhone" name="courierPhone" value = "${courier.courierPhone}">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>性别:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="courierSex" name="courierSex" value = "${courier.courierSex}">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>邮箱:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="courierEmail" name="courierEmail" value = "${courier.courierEmail}">
				</td>
			</tr><tr>
				<td class="text-right">
					<strong>身份证号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="courierNum" name="courierNum" value = "${courier.courierNum}">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=courierNo name="courierNo" value="${courier.courierNo }"/>
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
			
		</table>
		
		
		
	</form>
</div>
