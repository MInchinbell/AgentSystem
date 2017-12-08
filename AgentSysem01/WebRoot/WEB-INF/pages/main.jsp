<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
   <jsp:include page="/ioc/head.jsp"></jsp:include>
      <div class="mbxnav">
          代理商管理\当前账户信息
   
     </div>
      <div class="container">
     <div class="container">
            您好！<s:property value="currentUser.userName"/>
     </div>
     </div>
       <jsp:include page="/ioc/foot.jsp"></jsp:include>
     </body>
</html>
