<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

 
<script type="text/javascript">
	
	function outStock() {
		
		window.location.href = "${pageContext.request.contextPath }/access_records/outAccess_recordsTable";
	
	}
	
	function inStock(accNo) {
		layer.confirm('确认入库？', {
			  btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath }/access_records/inStock?accNo="+accNo;

			}, function(){
			  
			});
	}
	
	function send(accNo) {
		layer.confirm('确认送达？', {
			  btn: ['确认','取消'] //按钮
			}, function(){
				window.location.href = "${pageContext.request.contextPath }/access_records/send?accNo="+accNo;

			}, function(){
			  
			});
	}
	
	
	
</script>

				  <!-- 此处往上禁止修改 -->
				 	
				  		<div class="table-responsive text-center">
				  		<form action="">
				  			<div>
				  				<div>
				  					<h1>入库列表</h1>
				  				</div>				  				
				  				
				  			</div>
				  			<div>
				  				<table class="table table-striped table-bordered">
					  			<tr class="demo-table-hover">
					  				<td>记录序号	</td>
					  				<td>快递单号		</td>
					  				<td>发件人		</td>
					  				<td>发件地址	</td>
					  				<td>发件人电话	</td>
					  				<td>收件人		</td>
					  				<td>收件地址	</td>
					  				<td>收件人电话	</td>
					  				<td>出库时间	</td>
					  				<td>操作	</td>
					  				<td>
					  					<a class="btn btn-success btn-xs" role="button" href="javascript:;" onclick="outStock();" >出&nbsp;库</a>
					  				</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="access_records">
					  				<tr>
						  				<td>${access_records.accNo}</td>
						  				<td>${access_records.poNo}</td>
						  				<td>${access_records.post.poSender}</td>
						  				<td>${access_records.post.poStarAddress}</td>
						  				<td>${access_records.post.poSenderPhone}</td>
						  				<td>${access_records.post.poAddressee}</td>
						  				<td>${access_records.post.poEndAddress}</td>
						  				<td>${access_records.post.poAddresseePhone}</td>						  				
						  				<td><fmt:formatDate value="${access_records.accEndTime}" pattern="yyyy-MM-dd hh:mm:ss "/></td>						  				
						  				<td>						  					
						  					<a class="btn btn-danger btn-xs" role="button" href="javascript:;" onclick="inStock('${access_records.accNo}');">入库</a>
						  				</td>
						  				<td>						  					
						  					<a class="btn btn-danger btn-xs" role="button" href="javascript:;" onclick="send('${access_records.accNo}');">送达</a>
						  				</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  			</div>
				  		
				  		</form>
				  	</div>
 
				  	<div class="text-center">
				  		<p>当前 ${pageInfo.pageNum}页,&nbsp;总${pageInfo.pages}页,&nbsp;总 ${pageInfo.total}条记录</p>
				  		<a class="btn btn-info" href="inAccess_recordsTable?pageNum=1">首&nbsp;页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a class="btn btn-info" href="inAccess_recordsTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a class="btn btn-info" href="inAccess_recordsTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a class="btn btn-info" href="inAccess_recordsTable?pageNum=${pageInfo.pages}">尾&nbsp;页</a>
				  	</div>
				  	
				  <!-- 此处往下禁止修改 -->
				