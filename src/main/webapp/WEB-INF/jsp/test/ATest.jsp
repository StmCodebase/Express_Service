<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div align="center" style="padding-top: 50px;">
	<form action="BTest" method="post" accept-charset="utf-8">
		<table class="table table-bordered table-striped" style="width: 500px;">
			<tr>
				<td class="text-right">
					<strong>账号:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="accNum" name="accNum">
				</td>
			</tr>
			<tr>
				<td class="text-right">
					<strong>密 码:</strong>
				</td>
				<td class="text-left">
					<input class="form-control" type="text" id="accPwd" name="accPwd">
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