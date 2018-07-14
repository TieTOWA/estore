<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		//点击X 删除效果
		$(".c4_b2_y .search_del").on("click", function() {
			var li = this.parentNode;
			var ul = li.parentNode;
			ul.removeChild(li);
		});
		//价格和出版社选择
		$(".c4_b3_search a").on(
				"click",
				function() {

					var ul = $(".c4_b2_y");

					var name = $(this).parent().parent().find(".c4_b3_name")
							.jsp();

					var old = $(".c4_b2_y .search_key");
					$.each(old, function(index, obj) {
						if (obj.innerHTML == name) {
							var li = this.parentNode;
							var ul = li.parentNode;
							ul.removeChild(li);
						}
					})

					var value = this.innerHTML;

					var li = $("<li><span class='search_key'>" + name
							+ "</span><span class='search_val'>" + value
							+ "</span><span class='search_del'></span></li>");
					ul.append(li);
					ul.find(".search_del").on("click", function() {
						var li = this.parentNode;
						var ul = li.parentNode;
						ul.removeChild(li);
					});

				});

		//销量等
		$(".c4_b4_nav a").on("click", function() {
			var mythis = this;
			$(this.parentNode).addClass("current");
			$.each($(".c4_b4_nav a"), function(index, obj) {
				if (mythis != obj) {
					$(obj.parentNode).removeClass("current");
				}
			});
		});

	});

	function addShopCart(bookName) {
		var remain = "${product.remain}";
        if(remain == 0){
            alert(bookname+"没库存了QAQ！！！请选择别的书吧！");
        }else{ 
            var productId = "${product.id}";
            var productNum = $('#productNum').val();
            $.ajax({
                url:"addShopCart",
                data:{
                    "productId":productId,
                    "productNum":productNum,
                },
                success:function(data){
                    alert(data);
                }
            });
        }
	}
</script>
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
				<input type="text" /> <span>搜索</span>
			</div>
		</div>
		<div class="h3_right">
			<div class="myyy">
				<a href="userinfo.jsp">个人信息</a> <span class="sj_down"></span>
			</div>
			<div id="g" class="tsc">
				<a href="shopCart.jsp">去购物车结算</a> <span class="sj_right"></span>
			</div>
		</div>
	</div>
	<!--头部导航-->
	<div class="nav_top">
		<div class="nav_top_center">
			<div>全部图书分类</div>
			<ul>
				<c:forEach items="${cates}" var="cate">
					<li><a href="listServlet?cateId=${cate.id}">${cate.name}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>

	<!--内容-->
	<div class="container4">
		<!--热卖-->
		<div class="c4_b1">
			<ul class="c4_b1_boxes">
				<c:forEach items="${hots}" var="hot">
					<li><img src="${hot.img.split('[#]')[0]}">
						<div class="c4_b1_box_txt">
							<p>${hot.name}</p>
							<h1>
								活动价：<b>￥${hot.price}</b>
							</h1>
							<h2>
								<a href="javascript:void(0)" onclick="addShopCart('${product.name}')">立即抢购</a>
							</h2>
						</div></li>
				</c:forEach>
			</ul>
		</div>
		<div class="c4_b2">
			<h1 class="c4_b2_x">
				<a href="#">计算机类&nbsp;&nbsp;&gt;</a> <span><a href="#">计算机类</a></span>
			</h1>

			<ul class="c4_b2_y">
				<li><span class="search_key">价格：</span> <span
					class="search_val">0-99</span> <span class="search_del"></span></li>
				<li><span class="search_key">出版社：</span> <span
					class="search_val">清华出版社</span> <span class="search_del"></span></li>
			</ul>
		</div>
		<div class="c4_b3">
			<h1></h1>
			<div>
				<ul class="c4_b3_search">
					<li class="c4_b3_name">价格：</li>
					<li class="c4_b3_vals"><a href="#">0-599</a> <a href="#">600-999</a>
						<a href="#">1000-1599</a> <a href="#">1600-1999</a> <a href="#">2000-2999</a>
						<a href="#">3000-3999</a> <a href="#">4000-4999</a> <a href="#">5000-5999</a>
						<a href="#">6000-6490</a></li>
				</ul>
				<ul class="c4_b3_search">
					<li class="c4_b3_name">出版社：</li>
					<li class="c4_b3_vals"><a href="#">清华出版社</a> <a href="#">清华出版社</a>
						<a href="#">清华出版社</a> <a href="#">清华出版社</a> <a href="#">清华出版社</a>
						<a href="#">清华出版社</a></li>
				</ul>
			</div>
		</div>
		<div class="c4_b4">
			<div class="c4_b4_x">
				<ul class="c4_b4_nav">
					<li class="current"><a href="#">默认</a></li>
					<li><a href="#">销量</a></li>
					<li><a href="#">价格</a></li>
					<li><a href="#">新品</a></li>
					<li><a href="#">点击量</a></li>
				</ul>

				<div class="clear"></div>
			</div>
			<div class="c4_b4_y">
				<ul>
					<li><input type="checkbox"> 仅显示有货</li>
				</ul>
			</div>
		</div>
		<!--商品列表-->
		<div class="c4_b5">
			<div class="c4_b5_content">
				<ul class="c4_b5_c_boxes">
					<c:forEach items="${cateProducts}" var="product">
						<li class="c4_b5_c_box">
							<!--图片-->
							<div class="c4_b5_c_box_pic">
								<div class="c4b5_pic_view">
									<a href="viewBook?productId=${product.id}"><img src="${product.img.split('[#]')[0]}"></a>
								</div>
							</div> <!--价钱-->
							<div class="c4_b5_c_box_txt">
								<h1>￥ ${product.price}</h1>
								<h2>
									<a href="viewBook?productId=${product.id}">${product.name}</a>
								</h2>
							</div> <!--购买等操作-->
							<div class="c4b5_el">
								<div class="c4b5_el_x">
									<span class="wjx01"></span>
								</div>
							</div>
							<ul class="c4b5_option">
								<li class="shopcar_box">
									<span class="shopcar01"></span>
									<a href="javascript:void(0)" onclick="addShopCart('${product.name}')">加入购物车</a>
								</li>
							</ul>
						</li>
					</c:forEach>
				</ul>
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
					<h1>客服中心</h1> <img src="images/qrcode_jprj.jpg" width="80px"
					height="80px">
					<p>抢红包、疑问咨询、优惠活动</p>
				</li>
			</ul>
		</div>
		<div class="f3_bottom">
			<p class="f3_links">
				<a href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>| <a
					href="#">供货商入驻</a>
			</p>
			<p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司</p>
			<img src="images/police.png">
		</div>
	</div>

</body>
</html>