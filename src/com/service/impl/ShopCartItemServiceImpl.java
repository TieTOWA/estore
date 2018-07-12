package com.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bean.ShopCartItem;
import com.bean.User;
import com.mysql.cj.protocol.Resultset;
import com.service.IShopCartItemService;
import com.utils.BaseDao;

public class ShopCartItemServiceImpl implements IShopCartItemService {

	/**
	 * 将商品保存到购物车里
	 */
	@Override
	public void saveShopCartItem(ShopCartItem shopCartItem) {
		BaseDao baseDao = new BaseDao();
		
		Connection connection = baseDao.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from s_shopcart_item where user_id = ? and product_id = ?");
			ps.setInt(1, shopCartItem.getUser().getId());
			ps.setInt(2, shopCartItem.getProduct().getId());
			ResultSet rs = ps.executeQuery();
			ShopCartItem shopInfo = new ShopCartItem();
			while (rs.next()) {
				int id = rs.getInt("id");
				int num = rs.getInt("num");
				shopInfo.setId(id);
				shopInfo.setNum(num);
			}
			baseDao.closeAll(connection, ps, rs);
			//判断用户是否加入表中
			if (shopInfo == null) {
				//说明没有加进去,执行添加语句
				String sql = "insert into s_shopcart_item(user_id,product_id,num) values(?,?,?)";
				Object[] params = {
						shopCartItem.getUser().getId(),
						shopCartItem.getProduct().getId(),
						shopCartItem.getNum()
				};
				baseDao.executeUpdate(sql, params);
			}else {
				//用户添加过语句，执行update语句
				String sql = "update s_shopcart_item set num = ? where id = ?";
				Object[] params = {
						shopCartItem.getNum()+shopInfo.getNum(),
						shopInfo.getId()
				};
				baseDao.executeUpdate(sql, params);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void shopInfo(int id, int user_id, int product_id, int num) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 获取用户的购物车列表
	 * @param user
	 * @return List<ShopCartItem>
	 */
	@Override
	public List<ShopCartItem> listAllShopCartItem() {
		BaseDao baseDao = new BaseDao();
		String sql = "select ";
		Object[] params = {};
		baseDao.find(sql, params, ShopCartItem.class);
		return null;
	}

}
