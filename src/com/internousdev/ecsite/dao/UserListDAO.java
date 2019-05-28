package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;


public class UserListDAO {
	DBConnector dbConnector =new DBConnector();
	Connection con =dbConnector.getConnection();

	String sql="SELECT *FROM login_user_transaction";

	private ArrayList<UserListDTO> userListDTO = new ArrayList<UserListDTO>();

	public ArrayList<UserListDTO> getUserList(){


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				UserListDTO dto = new UserListDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setInsertDate(rs.getString("insert_date"));
				userListDTO.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}return userListDTO;

	}
}
