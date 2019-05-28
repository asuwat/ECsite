package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemCreateCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();

	private String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock)"
			+ " VALUES(?,?,?)";
	public void insertItem(String itemName,int itemPrice,int itemStock) {


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,itemName);
			ps.setInt(2, itemPrice);
			ps.setInt(3, itemStock);

			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}



}
