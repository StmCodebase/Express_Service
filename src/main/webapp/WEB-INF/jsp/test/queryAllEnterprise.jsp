<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta 	charset="UTF-8">
		<meta 	http-equiv="X-UA-Compatible" content="IE=edge">
		<meta 	name="viewport" content="width=device-width, initial-scale=1 , user-scalable=no">
		<meta name="description" content="">
    	<meta name="author" content="">
		<script type="text/javascript" src="${APP_PATH}/plug/jquery/jquery-2.1.1.min.js"></script>
		<script src="${APP_PATH}/plug/bootstrap/js/bootstrap.min.js"></script>
		<link 	rel="stylesheet" href="${APP_PATH}/plug/bootstrap/css/bootstrap.min.css" type="text/css" />
		<link 	rel="stylesheet" href="${APP_PATH}/plug/css/font-awesome.min.css">
		<link 	rel="stylesheet" href="${APP_PATH}/plug/css/main.css">
		
		
		<title>Insert title here</title>
	</head>
	<body>
		<div class="table-responsive text-center">
			<table class="table  table-bordered text-center">
            
              <thead>
                <tr style="text-align: center">
                  <th width="30" style="text-align: center">#</th>
				  <th width="30" style="text-align: center"><input type="checkbox"></th>
                  <th style="text-align: center">合作企业</th>
                  <th style="text-align: center">企业地址</th>
                  <th style="text-align: center">负责人</th>
                  <th style="text-align: center">电话</th>
                  <th style="text-align: center">企业邮箱</th>
                  <th style="text-align: center">合作期限</th>
                  <th width="100" style="text-align: center">操作</th>
                </tr>
              </thead>
              
              <tbody>
              	<c:forEach items="${enterprises}" var="enterprise" varStatus="status">
              		<tr>
	                  <td>${status.count}</td>
					  <td><input type="checkbox"></td>
	                  <td>${enterprise.entName}</td>
	                  <td>${enterprise.entAddress}</td>
	                  <td>${enterprise.entPerson}</td>
	                  <td>${enterprise.entPhone}</td>
	                  <td>${enterprise.entEmail}</td>
	                  <td>${enterprise.entDate}</td>
	                  <td>
					      <button type="button" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>
					      <button type="button" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>
						  <button type="button" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>
					  </td>
					</tr>

              	</c:forEach>
                
				  
              </tbody>
              <tfoot>
              	<tr>
              		<td colspan="9" align="center">
              			结束
              		</td>
              	</tr>
              </tfoot>
              <!--  
			  <tfoot>
			     <tr >
				     <td colspan="6" align="center">
						<ul class="pagination">
							<c:if test="${pageno > 1}">
						        <li><a href="#" onclick="changePageno(${pageno-1})">上一页</a></li>
						    </c:if>
						    <c:forEach begin="1" end="${totalno}" varStatus="status">
						        <c:if test="${pageno == status.count}">
						            <li class="active"><a href="#">${status.count}</a></li>
						        </c:if>
						        <c:if test="${pageno != status.count}">
						            <li ><a href="#" onclick="changePageno(${status.count})">${status.count}</a></li>
						        </c:if>
						    </c:forEach>
						    <c:if test="${pageno < totalno}">
						        <li><a href="#" onclick="changePageno(${pageno+1})">下一页</a></li>
						    </c:if>
						</ul>
					 </td>
				 </tr>

			  </tfoot>
			  -->
			  
            </table>
		</div>
		

	</body>
</html>