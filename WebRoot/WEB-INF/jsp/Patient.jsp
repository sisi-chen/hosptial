<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ManagementHospital.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
  	 
  	 function toaddPatient()
  	 {
    	window.location.href = 'addPatient';
  	 }
  	  
 	 
  	 
	</script>
  <style>
*{ margin:0; padding:0;}

html,body{ width:1000px; margin: 0 auto;}
.title{ width:100%; height:70px; border:1px solid #C33;background:url(image/yisheng1.png) no-repeat;background-size:100% 100%; margin-top:20px;background:-webkit-gradient(linear, 0% 0%, 0% 100%,from(#0ff0f0),to(#fff00f));}
.title p{height:45px;margin-top:10px;margin-left:20px;font-family:'微软雅黑';color:brack;}
.p1{float:left;font-size:24px;}
.p2{float:right;margin-right:100px;font-size:15px}
.content{ width:100%; border:1px solid #0C0;}
.content_left{ height:480px;width:20%; float:left;background-color:#699}
.content_left ul li{ display:block; list-style-type:none; background:#6F3; width:60%; height:50px; margin:30px auto 0px; border-radius:8px; position:relative; }
.content_left ul li a{display:block;width:120px; height:50px; line-height:50px;text-decoration:none; text-align:center; font-family:'微软雅黑'; font-size:20px; color:#000}
.content_left ul li a:hover{background:#F60;color:#FFF; border-radius:8px;}
.content_right{background:#CCC;width:800px;height:480px;float:left}
#b1{ height:50px; width:120px;}
#b2{ height:50px; width:120px;}
#b3{ height:50px; width:120px;}
#b4{ height:50px; width:120px;}


</style>

	

	
<body>
<div class="title">
	<p class="p1">医院管理系统-住院管理界面</p>
    <p class="p2"><a href="index">退出</a>&nbsp;&nbsp;&nbsp;<a href="FirstStaff">返回</a></p>
</div>
<div class="content">
	<div class="content_left" id="content_left">
    	<ul>
        	<li id="a1"><button type="button" id="b1"  />患者住院</li>
            <li id="a2"><button type="button" id="b2"  />查询病房信息</li>
            <li id="a3"><button type="button" id="b3"  />病人转房</li>
            <li id="a4"><button type="button" id="b4"  />出院办理</li>
      
        </ul>
        
    </div>
    <div class="content_right" id="content_right">
    	<h4 align="center">患者信息区</h4>&nbsp;&nbsp;&nbsp;
   	<form action="SearchPatient" method="post">
   		<input type="text" name="search"  placeholder="请输入住院编号" required><input type="submit"  value="搜索">&nbsp; <input type="button" onclick="toaddPatient()" value="添加" id="n1">
   	</form>
   	<table  border="1">
    <tr>
      <th>住院编号</th>
      <th>患者病房号</th>
      <th>患者年龄</th>
      <th>监护人</th>
      <th>监护人联系方式</th>
      <th>本人联系方式</th>
      <th>病症</th>
      <th>入院时间</th>
      <th>出院时间</th>
      
      <th>选项</th>
  
    </tr>
    
    
     <c:if test="${!empty Checkiolist }">
				<c:forEach items="${Checkiolist}" var="checkio">
					<tr>
						
						<td>${checkio.hosNo}</td>
						<td>${checkio.hNo}</td>
						<td>${checkio.age}</td>
						<td>${checkio.family}</td>
						<td>${checkio.fTel}</td>
						<td>${checkio.selfTel}</td>
						<td>${checkio.ill}</td>
						<td>${cehckio.clDate}</td>
						<td>${checkio.cODate}</td>
						<td><a href = "ModifyPatient">删除</a></td>
      					
					</tr>				
				</c:forEach>
			</c:if>
</table>
   	
	</table>
    </div>
</div>

</body>
</html>

