<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ManagementMedicine.jsp' starting page</title>
    
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

</style>
<script type="text/javascript">
  	 
  	 function toaddMedicine()
  	 {
    	window.location.href = 'addMedicine';
  	 }
  	  function toTakingMedicine()
  	 {
    	window.location.href = 'TakingMedicine';
  	 }
  	 function toCountMedicine()
 	 {
   	 	window.location.href = 'CountMedicine';
 	 }
  	 
 	 
  	 
	</script>
<body>
<div class="title">
	<p class="p1">医院管理系统-药品管理界面</p>
    <p class="p2"><a href="index">退出</a>&nbsp; <a href="FirstStaff">返回</a></p>
</div>
<div class="content">
	<div class="content_left" id="content_left">
    	<ul>
        	<li id="a1"><input type="button" id="b1" value="药品录入" onclick="toaddMedicine()"/></li>
            <li id="a3"><input type="button" id="b2" value="抓药" onclick="toTakingMedicine()"/></li>
            <li id="a4"><input type="button" id="b3" value="药品统计" onclick="toCountMedicine()"/></li>
      
        </ul>
        
    </div>
    <div class="content_right" id="content_right">
    	<h4 align="center">药品信息区</h4>&nbsp;&nbsp;&nbsp;
   	<form action="" method="post">
   		<input type="text" name="search"  placeholder="请输入处方编号" required><input type="submit"  value="搜索">
   	</form>
   	<table  border="1">
    <tr>
      <th>药品名称</th>
      <th>类别</th>
      <th>数量</th>
      <th>药品规格</th>
      <th>选项</th>
    </tr>
    
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>大小</td>
      <td><button type="button" id="takeMedicine">抓药</td>
    </tr>
	</table>
    </div>
</div>

</body>
</html>

