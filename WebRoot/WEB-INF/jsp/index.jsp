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
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<script src="js/jquery.js"></script>
<script type="text/javascript" src="js/myfocus-2.0.1.min.js"></script>
<script type="text/javascript" src="js/mF_slide3D.js"></script>
<link href="js/mF_slide3D.css" type="text/css" />



<script type="text/javascript">
  $(function(){
	 $(".navmenu").mouseover(function(){
		 
		 $(this).children("ul").show();		 		 
		 });
	 $(".navmenu").mouseout(function(){
		 
		 $(this).children("ul").hide();		 
		 }); 
	  });
</script>

<script type="text/javascript">
  $(function(){
	 $("#log1").click(function(){
		 $(".form1").show();
		 $(".form2").hide();
		 $(".form3").hide();		 		 
		 });
		 $("#log2").click(function(){
		 $(".form2").show();
		 $(".form1").hide();
		 $(".form3").hide();		 		 
		 });
		 $("#log3").click(function(){
		 $(".form3").show();
		 $(".form1").hide();
		 $(".form2").hide();		 		 
		 });
	
	  });
</script>

    				
<script type="text/javascript">
  myFocus.set({
	  id:'boxID',
	  pattern:'mF_slide3D',
	  time:3,
	  trigger:'click',
	  height:380,
	  width:650, 
  });
</script>

<script>
	//hover 两个时间  一个是鼠标移入的事件   第二个是鼠标移出的事件
	$('#warp ul li').hover(function(){
		$(this).stop(true).animate({
			opacity:1},500);
		$(this).find('.cover').stop(true).animate({
			opacity : 1,
			top : '450px'
		},500);
	},function(){
		$(this).stop(true).animate({
			opacity:0.6},500);
		$(this).find('.cover').stop(true).animate({
			opacity : 0,
			top : '470px'
		},500);
	});
</script>

<script> 
$(document).ready(function(){
  $("d61").mouseover(function(){
  		$("d61").css("width","200px");
  });
});
</script>

<script>
function cancel(){
	$(".form1").hide();
	$(".form2").hide();
	$(".form3").hide();
	}
</script>

<script>
function onChangeSelect(){
document.getElementById("AOName").value=document.getElementById("selectKK").value;
}
</script>

<style>

*{ padding:0; margin:0; list-style:none; text-decoration:none;}
html,body{ width:100%;}

	#stretch{ width:98%; height:410px; border:20px solid #F00;-moz-border-image:url(image/img10.jpg) 50 50 stretch;	/* Old Firefox */
-webkit-border-image:url(image/img10.jpg) 100 100 stretch;	/* Safari and Chrome */
-o-border-image:url(image/img10.jpg) 50 50 stretch;	/* Opera */
border-image:url(image/img10.jpg) 50 50 stretch;}
	#warp{ width:100%; height:280px;margin:10px 10px; float:left; }

	#warp ul li{ width:250px; height:250px; background:#000; list-style-type:none; float:left; position:relative; opacity:.6;margin-left:20px;  }
	
	#warp ul li:hover{ opacity:1; transition:all 1s;}
	
	.form1{background-color:#B1E9DB;display:none; position:fixed; top:9%; left:19%; width:300px; height:100px; font-size:18px; text-align:center;}
	.form2{background-color:#B1E9DB;display:none; position:fixed; top:9%; left:19%; width:300px; height:100px; font-size:18px; text-align:center;}
	.form3{background-color:#B1E9DB;display:none; position:fixed; top:9%; left:19%; width:300px; height:100px; font-size:18px; text-align:center;}

	
	.info{ width:200px; height:120px; margin:120px auto 0; background:rgba(0,0,0,.5)}
	.info h4 { font-size:18px; font-family:'Microsoft yahei'; font-weight:300; text-align:center; line-height:60px; color:#FFF; border-bottom:1px solid #FFF;}
	.info p { font-size:12px; color:#FFF; text-align:center; margin-top:8px; }
	
	.cover{ width:200px; height:140px; background:#E7E7E7; position:absolute; top:120px; left:50%; margin-left:-100px; font-family:'Microsoft yahei'; text-indent:20px; box-shadow:0 0 5px #fff; opacity:0;}
	
	#warp ul li:hover .cover{ top:110px; opacity:1; transition:all 1s;}
	
	.p1{ line-height:35px; font-size:14px; border-bottom:1px solid #d4d4d4;}

	.p2{ font-size:12px; padding-top:5px;}
	
	.p3{ font-size:12px; padding-bottom:25px;  border-bottom:1px solid #d4d4d4;}
	
	.p4{ font-size:12px; color:#4B8FD0; }
	

.d1{  background-color:#CCC; height:40px; width:100%; margin:0 auto;}
.d2{ text-align:center; width:500px; height:40px; position:absolute; top:10%; left:400px;}
.d3{ width:200px; height:100px; margin-top:10px; margin-left:50px; float:left; background:url(image/pnoto2.png); background-size:100% 100%;}
.d4{ background-image:url(image/photo1.png); width:250px; height:100px; float:right; margin-right:80px;}
.d5{ width:250px; height:400px; border:2px solid #D3E0DA; margin-left:5px;	}

.d6{ height:400px; width:700px; position:absolute; left:21%; }

.d7{ width:800px; height:35px; margin-top:10px;}
.d8{ background:url(image/pnoto4.png); width:200px; height:280px; float:left; background-size:100% 100%; }
.d9{  width:100%; height:140px; background:#C9CCBB; margin-top:20px; }
 
.d1 ul li{ list-style:none; float:left; margin-left:50px;  line-height:40px;}

.d31{  width:600px; height:40px; margin-top:20px; margin-left:-50px;}
.d31 ul li{ list-style:none; float:left; margin-left:40px;margin-top:10px; font-family:黑体;font-size:20px;}
.d31 ul li:hover{ color:#0F9; transform:scale(1.2);}

.d51{ width:250px; height:30px; background:#D3E0DA; }
.p51{ float:left; font-size:20px;  font-family:黑体;margin-top:3px;}
.p52{ float:right; font-size:16px; margin-top:5px; margin-right:10px;}
.d52{ width:250px; height:30px; margin-top:40px; }
.d52 select{ width:200px; height:30px; font-size:16px; margin-left:20px;}
.d53{ width:250px; height:30px; margin-top:40px; }
.d53 select{ width:200px; height:30px; font-size:16px; margin-left:20px;}
.d54{ width:250px; height:30px; margin-top:40px; }
.d54 input{ width:160px; height:33px; font-size:16px; margin-left:30px; background:#CF9;}
.d55{ width:250px; height:50px; margin-top:40px; background:url(image/photo3.png);}
.d56{width:250px; height:40px; font-size:20px; text-align:right; background:#D3E0DA; margin-top:30px; }

.d61{ width:300px; height:400px; font-size:25px;  float:right; margin-right:20px;} 
.d61 ul li { border-radius:25px; border:2px solid #FCF; width:250px; margin-top:4px; color:#3CF; transition:all .5s; transform-origin:center center;}
.d61 ul li:hover{color:#F06; transform:translate(5px,0); }


.d62 { background:url(image/photo6.png); height:200px; width:250px; background-size:100% 100%; position:absolute; margin-top:5px;  }
.d62 a{ position:absolute; color:#A5B4BA;}

.ul1{list-style:none; float:right; margin-right:100px; }

 ul li ul li{border:1px solid #0FF0F0; text-align:center;  width:100px; float:none; background-color:#eee; } 
 ul li ul li:hover{ background-color:#9F9; }
 
 ul li ul{ position:fixed; width:200px; margin-left:70px;  left:0px; top:40px; display:none;}
 

.input1{ width:400px; height:40px; }
.input2{ width:100px; height:44px; background-color:#74CA4A; margin-left:-7px; float:right; font-size:30px;}
</style>

  </head>
  
  <body>
    <div style="width:100%; height:180px; ">
	<div class="d1" >
    <ul>
    	<li >您好，</li>
        <li class="navmenu"><a >请登录</a>
        	<ul>
        	 <li id="log1"><a >医生登录</a></li>                 
        	 <li id="log2"><a >工作人员登录</a></li>
        	 <li id="log3"><a >管理员登录</a></li>
        	 
      </ul>
      
        </li>
    </ul>
    
    <ul class="ul1">
    	<li>导航</li>
        	
        <li>首页</li>  
    </ul> 
    </div>
    
    <div class="d3" ></div>
    
    <div  class="d2">
    	<input type="text" id="searchBox" class="input1"  placeholder="请输入疾病名、医生名、医院名"  />
        <input type="button" class="input2"  value="搜索" onclick="search()"/>
        <script>
        function search(){
        	var target = $('#searchBox').val();
        	window.location.href='http://www.baidu.com.cn/s?wd='+target;
        }
        </script>
        <div class="d31">
       	<ul>
        	<li><a href="#" style="color:#5AE261;">首页</a></li>
            <li><a>预约挂号</a></li>
            <li><a>咨询医生</a></li>
            <li><a>健康体检</a></li>
            <li><a>特殊服务</a></li>
        </ul>
        
        </div>
    </div>
    
    
    
    <div class="d4"></div>
    </div>
    
    <div  class="form1" >
    <form action="login1" method="post"  >
    <p>医生登录</p>
             用户名：<input type="text" name="Uname" /><br />
             密码：<input type="password" name="password" /><br />
             <input type="submit" value="提交" />
             <input type="button" value="取消" onclick="cancel()" />
             </form>   
             </div>
             
              <div  class="form2" >
    <form action="login2" method="post"  >
    <p>工作人员登录</p>
             用户名：<input type="text" name="Uname" /><br />
             密码：<input type="password" name="password" /><br />
             <input type="submit" value="提交" />
             <input type="button" value="取消" onclick="cancel()" />
             </form>   
             </div>
             
              <div  class="form3" >
    <form action="login3" method="post"  >
    <p>管理员登录</p>
             用户名：<input type="text" name="Uname" /><br />
             密码：<input type="password" name="password" /><br />
             <input type="submit" value="提交" />
             <input type="button" value="取消" onclick="cancel()" />
             </form>   
             </div>
             
  <div id="stretch">  
 <div class="d6">

<div id="boxID">
  <div class="pic">
  	<ul>
        <li ><a href="#"><img src="image/img1.jpg"  alt="本医院的护士1"  /></a></li>
        <li ><a href="#"><img src="image/img2.jpg"  alt="标题2"  /></a></li>
        <li ><a href="#"><img src="image/img3.jpg"  alt="标题3"  /></a></li>
        <li ><a href="#"><img src="image/img4.jpg"  alt="标题4"  /></a></li>
        <li ><a href="#"><img src="image/img5.jpg"  alt="标题5"  /></a></li>
  	</ul>
  </div>
</div> 
</div>
<div class="d61">
	<ul>
    	<li>一流护士，服务体贴</li>
        <li>一流检查，一家健康</li>
        <li>一流药物，及时治病</li>
        <li>一流条件，身心舒适</li>
        <li>一流服务，喜笑颜开</li>
    </ul>
    <div class="d62">
    <a >有问题，您说话</a>
    </div>
 </div>

<div class="d5">
	<div class="d51">
    <p class="p51">快速预约</p>
    <p class="p52">挂号记录</p>
	</div>
   <div class="d52">
   <form action="addreg" method="post">
    				<select name="AOName" >
    					<optgroup label="-请选择科室-" ></optgroup>
 
    					<option value="呼吸内科">呼吸内科</option>
                        <option value="口腔科">口腔科</option>
                        <option value="皮肤科">皮肤科</option>
                        <option value="中医科">中医科</option>
                        <option value="骨科">骨科</option>
    				</select>
       </div>
        <div class="d53">
    				<select name="DName">
    					<optgroup label="-请选择主治医生-" ></optgroup>
    					
    		<c:if test="${!empty Doctorlist }">
				<c:forEach items="${Doctorlist}" var="doctor">
					<option value="${doctor.dname}">${ doctor.dname}</option>		
				</c:forEach>
			</c:if>
    					
                         
    				</select>
       </div>
       <div class="d54"> 
       <input type="submit"  value="立即挂号" onclick="alert('挂号成功,请等待医生就诊!')" />
       </form>
 </div>
<div class="d54"> 
      
       <div class="d55"></div>
       <div class="d56">在线挂号，为君解忧！</div>
    
    
</div>
</div>


  <div class="d7">
  		<a style=" color:#FC9; font-size:30px;">本医院著名主治医生</a><a style=" color:#B9B9B9; font-size:18px; padding:20px;">只有你想不到的病，没有他们治不好的病！</a>     
  </div>
  <hr />
  
<div id="warp">
<div class="d8"></div>
	<ul>
        <li style="background:url(image/img6.jpg); background-size:100% 100%;">
        	<div class="info">
            	<h4>宋仲基</h4>
                <p>呼吸内科</p>
                <p>擅长人工呼吸</p>
            </div>
            <div class="cover">
            	<p class="p1">挑战人性的黑暗面</p>
                <p class="p2">中医药大学医学博士</p>
                <p class="p3">给你不一样的呼吸感受</p>
                <p class="p4">1680人预约</p>
            </div>
        </li>
        <li style="background:url(image/img7.jpg);background-size:100% 100%;">
        	<div class="info">
            	<h4>李钟硕</h4>
                <p>口腔科</p>
                <p>研究出100种接吻的方法</p>
            </div>
            <div class="cover">
            	<p class="p1">唇红齿白</p>
                <p class="p2">获得口腔界“杰出人才”称号</p>
                <p class="p3">小福利：第一次提供免费的口腔检查</p>
                <p class="p4">168011人预约</p>
            </div>
        </li>
        <li style="background:url(image/img8.jpg);background-size:100% 100%;">
        	<div class="info">
            	<h4>金秀贤</h4>
                <p>皮肤科</p>
                <p>皮肤的二次发育</p>
            </div>
            <div class="cover">
            	<p class="p1">拥有一个全新的自己，做我的“千颂伊”</p>
                <p class="p2">获得皮肤界“一把手”称号</p>
                <p class="p3">给你不一样的触摸体验，来一次医学界的马杀鸡！！</p>
                <p class="p4">168000人预约</p>
            </div>
        </li>
        <li style="background:url(image/img9.jpg);background-size:100% 100%;">
        	<div class="info">
            	<h4>杨洋</h4>
                <p>中医科</p>
                <p>男神为你熬药</p>
            </div>
            <div class="cover">
            	<p class="p1">中药乃润物细无声</p>
                <p class="p2">100%的照顾，暖男与小鲜肉的结合体</p>
                <p class="p3">爱我，你怕了吗？</p>
                <p class="p4">168022人预约</p>
            </div>
        </li>
    </ul>
</div>
<hr />
<div class="d9"> </div>
  </body>
</html>
     