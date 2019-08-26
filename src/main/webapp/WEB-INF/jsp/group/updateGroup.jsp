<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript">
	function doUpdate(){
		var gName = $("#gName").val();
		var roNo = $("#roNo").val();
		
		if(gName == ""||roNo == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/group/update" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;" >		
			<tr>
				<td class="text-right">
					<strong>用户组名	:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="gName" name="gName" value="${group.gName }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>角色编号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="roNo" name="roNo" value="${group.roNo }">
				</td>
			</tr>			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=gNo name="gNo" value="${group.gNo }"/>
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
			
		</table>
		
		
		
	</form>
</div>
