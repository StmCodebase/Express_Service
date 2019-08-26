<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

 
<script type="text/javascript">
	function doSearch(){
		var search = $("#search").val();
		if(search == ""){
			window.location.href = "${pageContext.request.contextPath}/enterprise/enterpriseTable";
		}else{
			window.location.href = "${pageContext.request.contextPath}/enterprise/search?search="+search;
		}
	}
	
	function doAdd() {
		window.location.href = "${pageContext.request.contextPath }/enterprise/insertEnterprise";
	}
	
	function doDel(entNo) {
		
		layer.confirm('确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath }/enterprise/delete?entNo="+entNo;

			}, function(){
			  
			});
	}
	
	function doUpdate(entNo) {		
		window.location.href = "${pageContext.request.contextPath }/enterprise/updateEnterprise?entNo="+entNo;
		}
	
</script>

				  <!-- 此处往上禁止修改 -->
				  	
				  		<div class="table-responsive text-center">
				  		<form action="">
				  			<div>
				  				<div>
				  					<h1>合作企业列表</h1>
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
					  				<td>企业编号		</td>
					  				<td>企业名称	</td>
					  				<td>企业地址		</td>
					  				<td>企业负责人	</td>
					  				<td>负责人电话	</td>
					  				<td>负责人邮箱		</td>
					  				<td>合作期限	</td>
					  				<td>
					  					<a class="btn btn-success btn-xs" role="button" href="javascript:;" onclick="doAdd();" >新&nbsp;增</a>
					  				</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="enterprises">
					  				<tr>
						  				<td>${enterprises.entNo}</td>
						  				<td>${enterprises.entName}</td>
						  				<td>${enterprises.entAddress}</td>
						  				<td>${enterprises.entPerson}</td>
						  				<td>${enterprises.entPhone}</td>
						  				<td>${enterprises.entEmail}</td>
						  				<td><fmt:formatDate value="${enterprises.entDate}" pattern="yyyy-MM-dd "/></td>
						  				
						  				<td>
						  					<a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${enterprises.entNo}');">修改</a>
						  					<a class="btn btn-danger btn-xs" role="button" href="javascript:;" onclick="doDel('${enterprises.entNo}');">删除</a>
						  				</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="enterpriseTable?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="enterpriseTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="enterpriseTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="enterpriseTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>

				  <!-- 此处往下禁止修改 -->
