<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<div class="table-responsive text-center">
				  		<form action="">
				  			<div>
				  				<div>
				  					<h1>角色列表</h1>
				  				</div>
				  				
				  				<div class="container" >
									<div class="input-group col-xs-3">
										<input type="text" class="form-control input-sm" id="search" name="search">
										<span class="input-group-addon btn btn-primary" href="javascript:;" onclick="doSearch();">搜索</span>
									</div>
								</div>
				  			</div>
				  			<div>
				  				<table class="table table-striped table-bordered">
					  			<tr class="demo-table-hover">
					  				<td>编号		</td>
					  				<td>角色		</td>
					  				<td>角色备注	</td>
					  				<td>
					  					<a class="btn btn-success btn-xs" role="button" href="javascript:;" onclick="doAdd();">新&nbsp;增</a>
					  				</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="roles">
					  				<tr>
						  				<td>${roles.roNo}</td>
						  				<td>${roles.roName}</td>
						  				<td>${roles.roText}</td>
						  				<td>
						  					<a class="btn btn-warning btn-xs" role="button" href="javascript:;" onclick="doAssign('${roles.roNo}');">权限</a>
						  					<a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${roles.roNo}');">修改</a>
						  					<a class="btn btn-danger btn-xs" role="button" href="javascript:;" onclick="doDel('${roles.roNo}');">删除</a>
						  				</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="roleTable?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="roleTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="roleTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="roleTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>
			  	
<script type="text/javascript">
	function doAssign(roNo) {
		window.location.href = "${pageContext.request.contextPath}/role/assignTable?roNo="+roNo;
	}
	
	function doAdd() {
		window.location.href = "${pageContext.request.contextPath }/role/insertRole";
	}
	
	function doDel(roNo) {
		
		layer.confirm('确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath }/role/delete?roNo="+roNo;
			}, function(){
			  
			});

	}
	
	function doUpdate(roNo) {		
		window.location.href = "${pageContext.request.contextPath }/role/updateRole?roNo="+roNo;
		}
	
	function doSearch(){
		var search = $("#search").val();
		if(search == ""){
			window.location.href = "${pageContext.request.contextPath}/role/roleTable";
		}else{
			window.location.href = "${pageContext.request.contextPath}/role/search?search="+search;
		}
	}
</script>