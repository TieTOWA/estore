<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-注册页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<div class="container2">
    	<div class="header2">
        	<div>
            	<a href="index.html"><img class="logo" src="images/logon_register.png"></a>
            </div>
            <div>
            	<ul class="tabs">
                	<li class="phone current">用手机登陆</li>
                </ul>
            </div>
            <div class="tlg">
            	已有账号 <a href="login.html">登陆</a>
            </div>
        </div>
        <div class="content2">
        <form id="register" action="" method="post">
			<ul class="reg_box">
            	<li>
                	<span><b>*</b>用户名：</span>
                    <input type="text" name="name" id="name"/>
                </li>
               <li>
                	<span><b>*</b>密码：</span>
                    <input type="password" name="password" id="password"/>
                </li>
                <li>
                	<span><b>*</b>邮编：</span>
                    <input type="text" name="zip" id="zip"/>
                </li>
                <li>
                	<span><b>*</b>地址：</span>
                    <input type="text" name="address" id="address"/>
                </li>
                <li>
                	<span><b>*</b>电话：</span>
                    <input type="text" name="telephone" id="telephone"/>
                </li>
                <li>
                	<span><b>*</b>电子邮箱：</span>
                    <input type="text" name="email" id="email"/>
                </li>
            </ul>
			<p>
            	<input type="checkbox" checked/>
               	 我已阅读并同意
                <a href="#">用户注册协议</a>
            </p>
            <input class="btn_submit" type="submit" value="立即注册"/>
        </form>
        </div>
       </div>
    <script>     
       $('#register').bind('submit',function(){
        var name = $('#name').val();
        var password = $('password').val();
        var zip = $('zip').val();
        var address =  $('address').val();
        var telephone = $('telephone').val();
        var email = $('email').val();
        if(name==''){
            alert('请输入用户名！');
            return false;
        }
        if(password==''){
            alert('请输入密码！');
            return false;
        }
        if(zip==''){
            alert('请输入邮政编码！');
            return false;
        }
        if(address==''){
            alert('请输入地址！');
            return false;
        }
        if(telephone==''){
            alert('请输入电话号码！');
            return false;
        }
        if(email==''){
            alert('请输入邮箱！');
            return false;
        }
        $.ajax({
            url:"Register",
            method:"post",
            dataType:"text",
            async:true,
            data:$('#register').serialize(),
        });
    });
</script>
</body>
</html>
