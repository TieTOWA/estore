<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup安全中心</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/newmain.css" />
<link rel="stylesheet" href="css/verify.css" />
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/verify.min.js"></script>
</head>
<body>
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
            	<li><a href="index.jsp">退出</a>|</li>
                <li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="index.jsp"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            	<a href="#">文学类</a>|
            	<a href="#">教育类</a>|
                <a href="#">计算机</a>|
                <a href="#">儿童类</a>|
                <a href="#">漫画类</a>|
            </p>
        </div>
        <div class="h3_right">
        	<div class="myyy">
            	个人信息
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
            	去购物车结算
                <span class="sj_right"></span>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
                <li><a href="list.jsp">文学类</a></li>
                <li><a href="list.jsp">教育类</a></li>
                <li><a href="list.jsp">计算机</a></li>
                <li><a href="list.jsp">儿童类</a></li>
                <li><a href="list.jsp">漫画类</a></li>
            </ul>
        </div>
    </div>
    <div class="container4">
    	<div class="register_box">
    			<div class="head">
    				<h3>找回密码</h3>
    			</div>
    			<div class="security">
    				<ul class="step">
    					<li class="green">
    						<span class="line">1</span>
    						<span>填写账户名</span>
    					</li>
    					<li>
    						<span class="line">2</span>
    						<span>身份验证</span>
    					</li>
    					<li>
    						<span class="line">3</span>
    						<span>设置密码</span>
    					</li>
    					<li>
    						<span class="line">4</span>
    						<span>完成</span>
    					</li>
    				</ul>
    				<form action="forgetPassword1.jsp" method="post">
    					<ul class="list">
    						<li>
    							<input id="name" name="user" value="" type="text" placeholder="请输入用户名"/>
    							<div id="name" class="name">用户名</div>
    						</li>
    						<li>
                                <div class="name">图形验证码:</div>
                                <div id="mpanel2" >
                                </div>
                                <button type="button" id="check-btn" class="verify-btn" style="margin-left: 345px">确定</button>
    						</li>
    					</ul>
                    </form>
    			</div>
    	</div>
    </div>
 
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
         <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>
    <script>
        $('#mpanel2').codeVerify({
            type : 1,
            width : '224px',
            height : '40px',
            fontSize : '30px',
            codeLength : 4,
            btnId : 'check-btn',
            ready : function() {
            },
            success : function() {
                alert('验证匹配！');
                window.location.href="forgetPassword1.jsp?name="+$('#name').val();
            },
            error : function() {
                alert('验证码不匹配！');
            }
        });
    </script>
</body>
</html>