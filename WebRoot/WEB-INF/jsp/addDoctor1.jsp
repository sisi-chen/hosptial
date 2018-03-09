<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  	 
  	 function toManagementDoctor()
  	 {
    	window.location.href = 'ManagementDoctor';
  	 }
  	  
 	 
  	 
	</script>
  <body>
	
		<form action="ManagementDoctor" method="post">
			<table  border="1">
    <tr>
      <td>编号</td>
	  <td><input type="text" name="DNo"></td>
	</tr>
	<tr>
      <td>职称</td>
	  <td><input type="text" name="Drank"></td>
	</tr>
	<tr>
      <td>所属科室</td>
	  <td><input type="text" name="AOName"></td>
	</tr>
	<tr> 
      <td>姓名</td>
	  <td><input type="text" name="DName"></td>
	</tr>
	<tr> 
      <td>性别</td>
	  <td><input type="text" name="Sex"></td>
	</tr>
	<tr> 
      <td>联系方式</td>
	  <td><input type="text" name="Tel"></td>
	</tr>
	<tr> 
      <td>年龄</td>
	  <td><input type="text" name="Age"></td>
	</tr>
	
      <td>状态</td>
	  <td><input type="text" name="State"></td>
	</tr>
   
    
     <tr colspan="2">
      <td><input type="submit" value="确认">&nbsp;<input type="button" value="返回" onClick="toManagementDoctor()"></a></td>
    </tr>
	</table>
		</form>
	</body>
</html>