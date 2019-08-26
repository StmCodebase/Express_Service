<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">
	<div class="row text-center" style="margin: 30px 30px;">	
		<div>
			<table class="table table-striped table-bordered">	  			
		  				<tr>						  				
			  				<td>${notice.noticeTitle}</td>						  									  				
		  				</tr>
		  				<tr>						  				
			  				<td>${notice.noticeText}</td>						  									  				
		  				</tr>		  			
			</table>				  
		</div>	
	</div>
</div>