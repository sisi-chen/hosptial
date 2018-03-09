<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    
    <title>My JSP 'ManagementPeople.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
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
<script type="text/javascript">
  	 
	function toManagementDoctor()
	{
		window.location.href = 'ManagementDoctor';
	}
 	function toNurse()
	{
		window.location.href = 'Nurse';
	}
	function toLogistic()
	{
		window.location.href = 'Logistic';
	}


	function fun(){
	 
		window.location.href = 'Staff';
	}
	
 	 
  	 function toaddStaff(){
  		 window.location.href = 'addStaff';
  	 }
	</script>
	
<body>
<div class="title">
	<p class="p1">医院管理系统-人事管理界面</p>
    <p class="p2">${user.id}，欢迎登陆本系统&nbsp; <a href="index">退出</a>&nbsp; <a href="">返回</a></p>
</div>
<div class="content">
	<div class="content_left" id="content_left">
    	<ul>
        	<li id="a1"><input type="button" id="b1" value="护士人员" onclick="toNurse()"/></li>
            <li id="a2"><input type="button" id="b2" value="工作人员" onclick="fun()"/></li>
            <li id="a3"><input type="button" id="b3" value="后勤人员" onclick="toLogistic()"/></li>
        	<li id="a4"><input type="button" id="b4" value="医生" onclick="toManagementDoctor()"/></li>
      
        </ul>
        
    </div>
    <div class="content_right" id="content_right">
    	<h4 align="center">工作人员信息区</h4>&nbsp;&nbsp;&nbsp;
   	<form action="SearchStaff" method="post">
   		<input type="text" name="search"  placeholder="请输入工作人员编号" required><input type="submit"  value="搜索">&nbsp <input type="button" onclick="toaddStaff()" value="添加" id="s1">
   	</form>
   	<table  border="1">
    <tr>
      <th>编号</th>
      <th>姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>电话</th>
      
      <th>状态</th>
      <th>选项</th>
      <th>操作</th>
    </tr>
    
    
      <c:if test="${!empty Stafflist }">
				<c:forEach items="${Stafflist}" var="staff">
					<tr>
	
						<td>${staff.sNo}</td>
						<td>${staff.sName }</td>
						<td>${staff.sSex }</td>
						<td>${staff.sAge}</td>
						<td>${staff.sTel }</td>
						<td>${staff.sState }</td>
						<td><a href="ModifyStaff?sNo=${staff.sNo }">修改</a></td>
      					<td><a href="">离职办理</a></td>
					</tr>				
				</c:forEach>
			</c:if>

      
   
</table>
   		
    </div>
</div>

</body>
</html>
