<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <link href="/css/public.css" rel="stylesheet"/>
	<link href="/css/main.css" rel="stylesheet"/>
	<!--  -->
	<link rel="stylesheet" type="text/css" href="/css/main.css">
	 <link id='theme' rel='stylesheet' href='/humane/themes/original.css'/>
      <script src='/humane/humane.js'></script>
	
	<!-- jQuery -->
	<script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script> 
	<script type="text/javascript" src="/js/main.js" charset="UTF-8"></script> 
  </head>
  <div class="head">
  <ul>
   <li><h2></h2>
   <li class="headfunc">
     <ul>
     <li>欢迎您！<s:property value="currentUser.userName"/>
     <a id="modifypwdbtna">修改密码</a><br/><a href="exit">退出</a>
       </li>
     </ul>
     </li>
  </ul>
  </div>
  <div id="menu" class="menu"></div>
  <div class="subbox"></div>
  <!--修改密码  -->
  <div id="modifydiv" class="modifydiv">
  <div class="modifTop">修改密码</div>
  <div class="modifyPasswordContent">
  <ul>
     <li>请输入原密码:<input type="password" id="oldpwdtext"><span id="oldpwdtexttip">你本次登陆的密码！</span>
     <li>请输入新密码:<input type="password" id="newpwd"><span id="newpwdtip">新密码不得少于6个字符！</span>
     <li>请再确认密码:<input type="password" id="newpwd2"><span id="newpwd2tip">请再次输入！</span>
    <li class="btnli">
     <input  id="modifypwdbtn" type="button" value="确认修改密码"/>
     <input id="modifypwdcancel" type="button" value="取消"/>
     </li>
    
  </ul>
  </div>
  <div></div>
  
  
  </div>
  <body>
  
  
  