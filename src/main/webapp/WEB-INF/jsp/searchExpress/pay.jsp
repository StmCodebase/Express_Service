<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="col-md-8 col-lg-offset-2" style="background-color: white;height:100% ;">
		<div class="row text-center" style="margin: 30px 30px;">
            <div class="progress">
                <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                    <span class="sr-only">70% Complete</span>
                </div>
            </div>
            <div>
                <div class="row">
                    <div class="col-md-4 col-md-offset-4"><img src="${pageContext.request.contextPath }/plug/img/20190619124246.png" height="200" width="1"/></div>
                </div>
                <div><h1>下单成功！请等待<span id="begin">5</span>秒后自动跳转！</h1></div>
            </div>
        </div>
</div>
<script>
    var t=5;
    var timer=setInterval(time,1000);
    var spans=document.getElementById("begin");
    function time(){
        t--;
        spans.innerHTML='<span>'+t+'</span>';
        if (t==0){
            clearInterval(timer);
            return window.location.href='${pageContext.request.contextPath }/post/searchNumber';
        }console.log(t);
    }
</script>