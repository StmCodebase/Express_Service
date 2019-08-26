<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


				  <!-- 此处往上禁止修改 -->
				  	
				  	<div class="table-responsive text-center">
				  		<form action="">
				  		
				  			<table class="table table-striped table-bordered">
					  			<tr class="demo-table-hover">
					  				<td><input type="checkbox"></td>
					  				<td>编号		</td>
					  				<td>网点编号	</td>
					  				<td>姓名		</td>
					  				<td>手机		</td>
					  				<td>性别		</td>
					  				<td>邮箱		</td>
					  				<td>身份证号	</td>
					  				<td>操作		</td>
					  				<td>邮箱		</td>
					  				<td>身份证号	</td>
					  				<td>操作		</td>
					  				<td>邮箱		</td>
					  				<td>身份证号	</td>
					  				<td>操作		</td>
					  				<td>邮箱		</td>
					  				<td>身份证号	</td>
					  				<td>操作		</td>
					  			</tr>
					  			<c:forEach items="${pageInfo.list}" var="posts">
					  				<tr>
						  				<td><input type="checkbox"></td>
						  				<td>${posts.poNo}</td>
						  				<td>${posts.cnoStar}</td>
						  				<td>${posts.poStarAddress}</td>
						  				<td>${posts.poSender}</td>
						  				<td>${posts.poSenderPhone}</td>
						  				<td>${posts.courierStar}</td>
						  				<td>${posts.poStarTime}</td>
						  				<td>${posts.poPrice}</td>
						  				<td>${posts.cnoEnd}</td>
						  				<td>${posts.poEndAddress}</td>
						  				<td>${posts.poAddressee}</td>
						  				<td>${posts.poAddresseePhone}</td>
						  				<td>${posts.courierEnd}</td>
						  				<td>${posts.poEndTime}</td>
						  				<td>${posts.poWeight}</td>
						  				<td>${posts.poPay}</td>
						  				<td>${posts.poAppraise}</td>
						  				
						  				<td>【按钮位】</td>
					  				</tr>
					  			</c:forEach>
				  			</table>
				  		
				  		</form>
				  	</div>
 
				  	<div>
				  		<p>当前 ${pageInfo.pageNum}页,总${pageInfo.pages}页,总 ${pageInfo.total}条记录</div></p>
				  		<a href="postTable?pageNum=1">第一页</a>
				        <c:if test="${pageInfo.hasPreviousPage}">
				            <a href="postTable?pageNum=${pageInfo.pageNum-1}">上一页</a>
				        </c:if>
				        <c:if test="${pageInfo.hasNextPage}">
				            <a href="postTable?pageNum=${pageInfo.pageNum+1}">下一页</a>
				        </c:if>
				        <a href="postTable?pageNum=${pageInfo.pages}">最后页</a>
				  	</div>

				  <!-- 此处往下禁止修改 -->
