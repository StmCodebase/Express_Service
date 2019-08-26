<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	function doUpdate(){
		var roName = $("#roName").val();
		var roText = $("#roText").val();
		
		if(roName == ""||roText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/role/update" method="post" accept-charset="utf-8" onsubmit="return doUpdate()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td class="text-right">
					<strong>角色:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="roName" name="roName" value="${role.roName }">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>角色备注:</strong>
				</td>
				<td class="text-left">				
					<textarea name="roText" id="roText"  cols="1"   rows="20"   class="form-control" >${role.roText }</textarea>
				</td>
			</tr>		
			
			<tr>
				<td colspan="2" class="text-center">
				<input type="hidden" id=roNo name="roNo" value="${role.roNo }"/>
					<input class="btn btn-default" type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</div>