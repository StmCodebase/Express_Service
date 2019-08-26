<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	function doPost(){
		var noticeTitle = $("#noticeTitle").val();
		var noticeText = $("#noticeText").val();
		
		if(noticeTitle == ""||noticeText == ""){
			layer.msg("内容不能为空", {time:2000, icon:5, shift:6});
			return false;
		}else{
			return true;
		}
		
    }
		
		
	
</script>

<div align="center" style="padding-top: 50px;">
	<form action="${pageContext.request.contextPath}/notice/add" method="post" accept-charset="utf-8" onsubmit="return doPost()">
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td class="text-right">
					<strong>题目:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="noticeTitle" name="noticeTitle">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>内容:</strong>
				</td>
				<td class="text-left">				
					<textarea name="noticeText" id="noticeText"  cols="1"   rows="20"   class="form-control"></textarea>
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