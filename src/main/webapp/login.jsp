<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>管理员登录后台管理系统</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="../static/images/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./static/css/font.css">
	<link rel="stylesheet" href="./static/css/weadmin.css">
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
</head>
<body class="login-bg">
    <div class="login">
        <div class="message">管理登录</div>
        <div id="darkbannerwrap"></div>
            <input id="username" name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input id="password" name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
            <hr class="hr15">
            <input id="loginin" class="loginin" value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
            <div>
    </div>

    <script type="text/javascript">
	    $("#loginin").click(function(){
			var username=$("#username").val();
	    	var password=$("#password").val();
	    	var dataObj = {};
	    	dataObj.account=username;
	    	dataObj.password=password;
	    	$.ajax({
	    		type:"POST",
	    		async:false,
	    		url:"/12-maven-ssm-blog01/login.do",
	    		data:dataObj,
	    		dataType:"json",
	    		success:function(data){	  
	    			if(data.result == "success"){
	    				location.href='./indexPage.jsp';
	    			} else{
	    				alert("账号或密码错误!");
	    			}
	    		},
	    		error:function(xhr, status){
	    			alert("error!");
	    		}
	    	});
		});
            	
    </script>  
</body>
</html>