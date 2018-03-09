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
  	 
  	 function toPatient()
  	 {
    	window.location.href = 'Patient';
  	 }
  	  
 	 
  	 
	</script>
  <body>
		<form action="addPatientDo" method="post">
			<table  border="1">
    <tr>
      <td>住院编号</td>
	  <td><input type="text" name="hosNO"></td>
	</tr>
	<tr>
      <td>病房号</td>
	  <td><input type="text" name="hNo"></td>
	</tr>
	<tr>
      <td>年龄</td>
	  <td><input type="text" name="age"></td>
	</tr>
	<tr> 
      <td>监护人</td>
	  <td><input type="text" name="family"></td>
	</tr>
	<tr> 
      <td>监护人电话</td>
	  <td><input type="text" name="fTel"></td>
	</tr>
	<tr> 
      <td>本人电话</td>
	  <td><input type="text" name="selfTel"></td>
	</tr>
	<tr> 
      <td>病症</td>
	  <td><input type="text" name="ill"></td>
	</tr>
	<tr>
      <td>入院时间</td>
	  <td><input type="text" name="ClDate"></td>
	
	<tr>
      <td>出院时间</td>
	  <td><input type="text" name="CODate"></td>
	</tr>
   	
    <tr colspan="2">
      <td><input type="submit" value="确认"></td>
    </tr>
	</table>
		</form>
	</body>
</html>
