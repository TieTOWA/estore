<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>briup安全中心</title>
        <link rel="stylesheet" href="css/common.css" />
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="css/icons.css" />
        <link rel="stylesheet" href="css/table.css" />
        <link rel="stylesheet" href="css/newmain.css" />
        <script src="js/jquery-3.2.1.min.js"></script>
    </head>

    <body>
        <!--顶部-->
        <div class="top">
            <div class="top_center">
                <ul class="top_bars">
                    <li>
                        <a href="Loginout">退出</a>|</li>
                    <li>
                        <a href="confirmList.jsp">我的订单
                            <span class="jt_down"></span>
                        </a>|</li>
                    <li>
                        <a href="#">关注杰普
                            <span class="jt_down"></span>
                        </a>|</li>
                    <li>
                        <a href="#">网站导航
                            <span class="jt_down"></span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!--头部-->
        <div class="header3">
            <a href="#">
                <img src="images/logo.png">
            </a>
            <div class="h3_center">
                <div class="search_box">
				<input type="text" name="key" /> 
				<input type="submit" value="搜索" style="background-color:white;width:100px;"/>
			</div>
                <p>
                    <c:forEach items="${cates}" var="cate">
            			<a href="listServlet?cateId=${cate.id}">${cate.name}</a>|
            		</c:forEach>
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
                    <c:forEach items="${cates}" var="cate">
            			<li><a href="listServlet?cateId=${cate.id}">${cate.name}</a></li>
            		</c:forEach>
                </ul>
            </div>
        </div>
        <div class="container4">
            <div class="register_box">
                <div class="head">
                    <h3>个人信息</h3>
                </div>
                <div class="security">
                    <form id="form" action="Update" method="post">
                        <ul class="list">
                            <li>
                                <input id="name" class="long" name="name" readonly="readonly" value="${user.username}" type="text" />
                                <div class="name">用户名:</div>
                            </li>
                            <li>
                                <input id="password" class="long" name="password" value="${user.password}" type="password" />
                                <div class="name">密码:</div>
                            </li>
                            <li>
                                <input id="zip" class="long" name="zip" value="${user.zip}" type="text" />
                                <div class="name">邮编:</div>
                            </li>
                            <li>
                                <input id="address" class="long" name="address" value="${user.address}" type="text" />
                                <div class="name">地址:</div>
                            </li>
                            <li>
                                <input id="phone" class="long" name="phone" value="${user.phone}" type="text" />
                                <div class="name">电话:</div>
                            </li>
                            <li>
                                <input id="email" class="long" name="email" value="${user.email}" type="text" />
                                <div class="name">电子邮箱:</div>
                            </li>
                            <li>
                                <input style="margin-left: 450px" type="submit" value="修改"/>
                            </li>
                        </ul>
                    </form>
                    <script>
                        $('#register').bind('submit', function () {
                            $.ajax({
                                method: "post",
                                dataType: "text",
                                async: true,
                                data: {
                                    'password': $('#name').val(),
                                    'zip': $('#zip').val(),
                                    'address': $('#address').val(),
                                    'phone': $('#phone').val(),
                                    'email': $('#email').val(),
                                }
                            });
                        });
                    </script>
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

    </body>

    </html>