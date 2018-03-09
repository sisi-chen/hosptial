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
  	 
  	 function toHouse()
  	 {
    	window.location.href = 'House';
  	 }
  	  
 	 
  	 
	</script>
  <body>
		<form action="House" method="post">
			<table  border="1">
    <tr>
      <td>病房编号</td>
	  <td><input type="text" name="NNo"></td>
	</tr>
	<tr>
      <td>病房床位数</td>
	  <td><input type="text" name="BNum"></td>
	</tr>
	<tr>
      <td>病房空床位数</td>
	  <td><input type="text" name="EBNum"></td>
	</tr>
	
    
     <tr colspan="2">
      <td><input type="submit" value="确认">&nbsp;<input type="button" value="返回" onClick="toHouse()"></a></td>
    </tr>
	</table>
		</form>
	</body>
</html>