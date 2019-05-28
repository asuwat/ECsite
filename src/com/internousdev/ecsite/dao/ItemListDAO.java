package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	private ArrayList<ItemListDTO>  ItemListDTO = new ArrayList<ItemListDTO>();
	public ArrayList<ItemListDTO> getItemList(){
		String sql ="SELECT item_name,item_price,item_stock from item_info_transaction";

		try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while(rs.next()) {
					ItemListDTO dto = new ItemListDTO();
					dto.setItemName(rs.getString("item_name"));
					dto.setItemPrice(rs.getInt("item_price"));
					dto.setItemStock(rs.getInt("item_stock"));
					ItemListDTO.add(dto);
				}
			} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}return ItemListDTO;


	}

}
