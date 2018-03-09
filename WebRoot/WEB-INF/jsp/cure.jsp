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
    
    <title>My JSP 'Doctor.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


<script src="js/jquery.js"></script>


<script>
$(document).ready(function(){
	var aa = "${flag}";
	alert(aa);
		if(aa != 1)
		{
		$("#content_left").load("jsp_doctortwo");
		alert("sb");
		}
		else
		if(aa)
		
  $("#in1").click(function(){
  
    $("#content_left").load("html/doctorone.html");
	$("#all").hide();
  });
  $("#in2").click(function(){
    $("#content_left").load("jsp_doctortwo");
	$("#all").hide();
  });
});
</script>

<script type="text/javascript">

$(document).ready(function(){

});
</script>

<script>
$(document).ready(function(){

  $("#d1").click(function(){
    $("#content_left").load("html/doctorthree1.html");
  });
  $("#d2").click(function(){
    $("#content_left").load("html/doctorthree2.html");
  });
  $("#d3").click(function(){
    $("#content_left").load("html/doctorthree3.html");
  });
  $("#d4").click(function(){
    $("#content_left").load("html/doctorthree4.html");
  });
});
</script>

<script>
$(document).ready(function(){
  $("#in3").click(function(){
    $("#all").show();
	$("#all2").hide();
  });
  $("#in4").click(function(){
    $("#all2").show();
	$("#all").hide();
  });
});
</script>
<script type="text/javascript">
function showreg() {
	window.location.href='showReg';
}
function showcase(){
	window.location.href='showcase';
}
</script>

<style type="text/css">
*{ padding:0; margin:0; list-style:none; text-decoration:none;}
html,body{ width:90%; margin:0 auto;}

    .all{  position:absolute; top:10%; left:10%; height:200px; width:180px; text-align:center; display:none;}
	.all form{ margin-top:20px; width:180px; height:70px; border:2px solid #A7A7A7; border-radius:20px;}
	#d1{ background:#CDCDCD; border:2px solid #ABF1C1; width:150px; height:40px; border-radius:25px; text-align:center; font-size:24px; margin-top:40px; }
	
	#d2{background:#CDCDCD; border:2px solid #ABF1C1; width:150px; height:40px; border-radius:25px;text-align:center; font-size:24px;margin-top:40px; }
	#d3{background:#CDCDCD; border:2px solid #ABF1C1; width:150px; height:40px; border-radius:25px;text-align:center; font-size:24px;margin-top:40px; }
	#d1:hover{ transform:scale(1.2); background:#C69DDB; }
	#d2:hover{ transform:scale(1.2); background:#C69DDB; }
	#d3:hover{ transform:scale(1.2); background:#C69DDB; }

.title{ width:100%; height:150px; border:2px solid #999; background:url(image/yisheng1.png) no-repeat; margin-top:20px; background-size:100% 100%;}
.title h1{ border-radius:20px; background:#FFFF79; width:400px; height:50px; font-size:36px; text-align:center; margin-left:350px; }
.title p{ font-size:20px; color:#CC94E4; margin-top:10px; padding-left:300px; }
.in1{ margin-left:100px; background-color:#A9BBDA; width:130px; height:32px; text-align:center; float:left; margin-top:30px;transition:all 1s;  }
.in1:hover{ transform:scale(1.2); background-color:#BAB65A; color:#F06;}
.in2{ margin-left:100px; background-color:#A9BBDA; width:130px; height:32px; text-align:center; float:left; margin-top:30px;transition:all 1s;  }
.in2:hover{ transform:scale(1.2); background-color:#BAB65A; color:#F06;}
.in3{ margin-left:100px; background-color:#A9BBDA; width:130px; height:32px; text-align:center; float:left; margin-top:30px;transition:all 1s;  }
.in3:hover{ transform:scale(1.2); background-color:#BAB65A; color:#F06;}
.in4{ margin-left:100px; background-color:#A9BBDA; width:130px; height:32px; text-align:center; float:left; margin-top:30px;
transition:all 1s;  }
.in4:hover{ transform:scale(1.2); background-color:#BAB65A; color:#F06;}

.content{width:100%; height:450px; border:2px solid #999; position:relative;}
.content_left{ width:79%; height:450px; float:left; border:2px solid #909; position:absolute;}
.content_right{ width:20%; height:450px; float:right; border:2px solid #999; position:relative;}
</style>

</head>

<body>
<div class="title">
			<h1>医生业务职能</h1>
           	<p> -- xxx  --，欢迎进入医生职能界面，您有以下的功能，希望能给您带来便捷！！！</p>
			<input class="in1" id="in1" type="button" value="修改个人密码" />
            <input class="in2" id="in2" type="button" value="查看挂号信息" onclick="showreg()" />
            <input class="in3" id="in3" type="button" value="处理病例" />
            <input class="in4" id="in4" type="button" value="查询历史病例" onclick="showcase()"/>
</div>
<div class="content">

<div class="content_left" id="content_left"></div>
<div class="content_right" id="content_right">
<div class="all" id="all">
<div id="d1">填写患者信息</div>
<div id="d2">填写病例信息</div>
<div id="d3">填写处方信息</div>
</div>

</div>
</div>
  </body>
</html>
