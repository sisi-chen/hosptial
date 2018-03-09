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
    
    <title>My JSP 'MessageBoard.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script src="js/jquery.js"></script>
<style type="text/css">
*{ padding:0; margin:0; list-style:none; text-decoration:none;}
html,body{ width:90%; margin:0 auto;}

#d1{ display:none;}
#d2{ }
#d3{ display:none;}
#d4{ display:none;}
#leavemess{display:none;position: fixed;top:65%; left:80%;}
#leavemess ul li{ border: 2px solid #BBC8B7;}
#leavemess ul li:nth-child(1){ font-size: 20px; background: gray;}
#leavemess ul li:nth-child(3){text-align: center;}

#d5{   height:60px; width:700px; border:20px solid #7DA2B5; margin-top:30px; margin-left:80px; text-align:center; font-family:微软雅黑; font-size:24px; padding-top:20px; 
-moz-border-image:url(image/yisheng4.png) 50 50 stretch;	/* Old Firefox */
-webkit-border-image:url(image/yisheng4.png) 100 100 stretch;	/* Safari and Chrome */
-o-border-image:url(image/yisheng4.png) 50 50 stretch;	/* Opera */
border-image:url(image/yisheng4.png) 50 50 stretch;
}
#d6{ height:350px; width:700px; border:20px solid #7DA2B5; margin-top:30px; margin-left:80px; border-radius:30px;
-moz-border-image:url(image/yisheng3.png) 50 50 stretch;	/* Old Firefox */
-webkit-border-image:url(image/yisheng3.png) 100 100 stretch;	/* Safari and Chrome */
-o-border-image:url(image/yisheng3.png) 50 50 stretch;	/* Opera */
border-image:url(image/yisheng3.png) 50 50 stretch; }

.d61{ border-radius:25px; border:2px solid #BBAEA4; width:500px; height:150px; margin-left:50px;}
.d61 p:nth-child(1){ font-size:20px; color:#CB9C69; background-color:#C6C6C6; margin-top:5px; border-radius:10px; width:450px; height:50px; margin-left:20px;}
.d61 p:nth-child(2){ font-size:20px; color:#CB9C69; background-color:#C6C6C6; margin-top:5px; border-radius:10px; width:450px; height:50px; margin-left:20px;}
.d61 p a{ color:black;}
.d61 input{ float:right; margin-right:20px; width:80px; height:30px; background-color:#CC8F6F;transition:all 1s;}
.d61 input:hover{ transform:scale(1.2); color:#DC4138;}

.d62{ border-radius:25px; border:2px solid #BBAEA4; width:500px; height:150px; margin-left:50px;}
.d62 p:nth-child(1){ font-size:20px; color:#CB9C69; background-color:#C6C6C6; margin-top:5px; border-radius:10px; width:450px; height:50px; margin-left:20px;}
.d62 p:nth-child(2){ font-size:20px; color:#CB9C69; background-color:#C6C6C6; margin-top:5px; border-radius:10px; width:450px; height:50px; margin-left:20px;}

.d62 input{ float:right; margin-right:20px; width:80px; height:30px; background-color:#CC8F6F;transition:all 1s;}
.d62 input:hover{ transform:scale(1.2); color:#DC4138;}

.d63 input{  float:right; margin-right:20px; width:80px; height:30px; background-color:#CC8F6F; transition:all 2s;}
.d63 input:hover{ transform:scale(1.2); color:#DC4138;}

.title{ width:100%; height:200px; border:2px solid #999; background:url(image/yisheng1.png) no-repeat; margin-top:20px; background-size:100% 100%;}
.title ul li:nth-child(1) div:nth-child(1){width:150px; height:150px; background:url(image/img6.jpg); background-size:100% 100%; float:left; margin-top:35px; margin-left:40px; }
.title ul li:nth-child(2) div:nth-child(1){width:150px; height:150px; background:url(image/img7.jpg); background-size:100% 100%; float:left; margin-top:35px; margin-left:40px;}
.title ul li:nth-child(3) div:nth-child(1){width:150px; height:150px; background:url(image/img8.jpg); background-size:100% 100%; float:left; margin-top:35px; margin-left:40px;}
.title ul li:nth-child(4) div:nth-child(1){width:150px; height:150px; background:url(image/img9.jpg); background-size:100% 100%; float:left; margin-top:35px; margin-left:40px;}

.function{ width:200px; height:180px; border:2px solid #9CD088; border-radius:20px; float:right; margin-right:20px; margin-top:10px;}
.function p{ background-color:#DACCE3; margin-top:5px; border-radius:20px; font-size:16px; height:30px; padding-left:5px; }

.in1{ margin-left:100px; background-color:#A9BBDA; width:130px; height:32px; text-align:center; float:left; margin-top:10px;transition:all 1s;  }
.in1:hover{ transform:scale(1.2); background-color:#BAB65A;}
.in2{ margin-left:30px; background-color:#A9BBDA; width:100px; height:32px; text-align:center; float:left; margin-top:10px;
transition:all 1s;}
.in2:hover{ transform:scale(1.2) translateX(10px); background-color:#64B955;}
.in3{ margin-left:30px; background-color:#A9BBDA; width:100px; height:32px; text-align:center; float:left; margin-top:10px;
transition:all 1s;}
.in3:hover{ transform:scale(1.2) translateX(10px); background-color:#64B955;}
.in4{ margin-left:30px; background-color:#A9BBDA; width:100px; height:32px; text-align:center; float:left; margin-top:10px;
transition:all 1s;}
.in4:hover{ transform:scale(1.2) translateX(10px); background-color:#64B955;}

.title ul li ul { width:100px; height:100px; margin-top:50px; margin-left:30px; float:left; }
.title ul li ul li{border:2px solid #BBC8B7; margin-top:5px; width:200px; }
#a2{ width: 150px; background-color: gray;}

.content{width:100%; height:600px; border:2px solid #999; position:relative;}


.content_left{ width:20%; height:600px; float:left; border:2px solid #909; position:absolute;}

.content_left ul h2{ margin-top:20px; }
.content_left ul li{ margin-top:20px; width:120px; height:40px; background:#94D7DA; border-radius:50px; text-align:center; font-size:24px; margin-left:40px; transition:all .5s; }
.content_left ul li:hover{ transform:scale(1.2); color:#F00;}

.content_right{ width:80%; height:600px; float:right; border:2px solid #999; position:relative;}

.content_right {}
</style>

<script>
	$(document).ready(function() {
		
		$("#d1").hide();
        $("#a1").click(function(){
			$("#d2").hide();
			$("#d3").hide();
			$("#d4").hide();
			$("#d1").show();
		});
    });
		$(document).ready(function() {
		
		
        $("#a2").click(function(){
			$("#d1").hide();
			$("#d3").hide();
			$("#d4").hide();
			$("#d2").show(); 
			
		});
    });
	$(document).ready(function() {
		
		$("#d3").hide();
        $("#a3").click(function(){
			$("#d1").hide();
			$("#d2").hide();
			$("#d4").hide();
			$("#d3").show();
		});
    });
		$(document).ready(function() {
		
		$("#d4").hide();
        $("#a4").click(function(){
			$("#d1").hide();
			$("#d2").hide();
			$("#d3").hide();
			$("#d4").show();	
		});
		  $("#butt").click(function(){
		
			$("#leavemess").show();	
		});
    });
	
</script>

<script type="text/javascript">
function fun(){
	window.location.href='doctor';
}
function reply(){
	alert("<tr></tr>")
	window.location.href='reply';
}

</script>

</head>

<body>
<div class="title">
	<ul>
    	<li id="d1">
    	
        	<div ></div>
        	<ul>
            	<li>宋仲基</li>
                <li>科室：</li>
                <li>联系方式：</li>
                <li>描叙：</li>
            </ul>
            
            <div class="function">
            <p>登录后可进行操作</p> 
            <input class="in2" type="button" value="功能界面" onclick="fun()"/>
            
            </div>
        </li>
        <li id="d2">
        	<div ></div>
        	<ul>
            	<li>${doctor.dname }</li>
                <li>科室：${doctor.aoName }</li>
                <li>联系方式：${doctor.dTel }</li>
                <li>描叙：${doctor.dState }</li>               
            </ul>
            
           <div class="function">
            <p>登录后可进行操作</p> 
            <input class="in2" type="button" value="功能界面" onclick="fun()"/>
            
            </div>
        </li>
        <li id="d3">
        	<div ></div>
        	<ul>
            	<li>金秀贤</li>
                <li>科室：</li>
                <li>联系方式：</li>
                <li>描叙：</li>
            </ul>
            <div class="function">
            <p>登录后可进行操作</p> 
            <input class="in2" type="button" value="功能界面" id="doctor"  onclick="fun()"/>
            
            </div>
        </li>
        <li id="d4">
        	<div ></div>
        	<ul>
            	<li>杨洋</li>
                <li>科室：</li>
                <li>联系方式：</li>
                <li>描叙：</li>
            </ul>
            <div class="function">
            <p>登录后可进行操作</p> 
            <input class="in2" type="button" value="功能界面" onclick="fun()"/>
            
            </div>
        </li>
    </ul>
 </div>
<div class="content">
<div class="content_left">
	<ul>
    	<h2>本院医生</h2>      
     	<li id="a1">宋仲基</li>
        <li id="a2">李钟硕</li>
        <li id="a3">金秀贤</li>
        <li id="a4">杨洋</li>
    </ul>
 </div>
<div class="content_right"> 
	<div id="d5"><p>欢迎查看本医生的留言版！</p> </div>
	<div class="d63">
	
	<input type="button"  value="留言" id="butt"/></div>
    <div id="d6">
   		 
   		 <c:if test="${!empty messlist }">
				<c:forEach items="${messlist}" var="mess">
				<div class="d61">
					<p> 留言：<a>${mess.content}</a></p>
            		<p> 回复：<a>${mess.reply}</a></p>
            		
            		<input type="button"  value="回复" onclick="reply()"/>
            		</div>
				</c:forEach>
			</c:if>
         	
        
            
         </div>
         
        
         
         <form action="leavemess" method="post" id="leavemess" >
       		<ul>
       		<li>请填写您的留言：</li>
       		<li><input type="text" name="message"></li>
       		<li><input type="submit" value="确定" onclick="alert('留言成功！')"></li>
       		</ul>      
       		</form>
     </div>
    <div id="d7"> </div>
</div>

</body>
</html>
