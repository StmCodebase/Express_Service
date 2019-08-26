<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	function doSearch(){
		var search = $("#search").val();
		if(search == ""){
			window.location.href = "${pageContext.request.contextPath}/courier/courierTable";
		}else{
			window.location.href = "${pageContext.request.contextPath}/courier/search?search="+search;
		}
	}
	
	function doAdd() {
		window.location.href = "${pageContext.request.contextPath }/courier/insertCourier";
	}
	
	function doDel(courierNo) {
		
		layer.confirm('确认删除？', {
			  btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath }/courier/delete?courierNo="+courierNo;
			}, function(){
			  
			});

	}
	
	function doUpdate(courierNo) {		
		window.location.href = "${pageContext.request.contextPath }/courier/updateCourier?courierNo="+courierNo;
		}
	
</script>

				  <!-- 此处往上禁止修改 -->
				  	
				  	<div class="table-responsive text-center">
				  		<form action="">
				  			<div>
				  				<div>
				  					<h1>快递员列表</h1>
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
					  				<td>网点编号	</td>
					  				<td>姓名		</td>
					  				<td>手机		</td>
					  				<td>性别		</td>
					  				<td>邮箱		</td>
					  				<td>身份证号	</td>
					  				<td>
					  					<a class="btn btn-success btn-xs" role="button" href="javascript:;" onclick="doAdd();" >新&nbsp;增</a>
					  				</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="couriers">
					  				<tr>
						  				<td>${couriers.courierNo}</td>
						  				<td>${couriers.staNo}</td>
						  				<td>${couriers.courierName}</td>
						  				<td>${couriers.courierPhone}</td>
						  				<td>${couriers.courierSex}</td>
						  				<td>${couriers.courierEmail}</td>
						  				<td>${couriers.courierNum}</td>
						  				<td>
						  					<a class="btn btn-primary btn-xs" role="button" href="javascript:;" onclick="doUpdate('${couriers.courierNo}');">修改</a>
						  					<a class="btn btn-danger btn-xs" role="button" href="javascript:;" onclick="doDel('${couriers.courierNo}');">删除</a>
						  				</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="courierTable?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="courierTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="courierTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="courierTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>

				  <!-- 此处往下禁止修改 -->
