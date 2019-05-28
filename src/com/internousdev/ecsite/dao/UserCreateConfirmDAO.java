package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.UserCreateConfirmDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection =dbConnector.getConnection();
	public UserCreateConfirmDTO idConfirm(String loginUserId)  {
		UserCreateConfirmDTO userCreateConfirmDTO = new UserCreateConfirmDTO();
		String sql="select login_id from login_user_transaction where login_id=?";

		try {
		PreparedStatement preparedStatement =connection.prepareStatement(sql);
		preparedStatement.setString(1, loginUserId);
		ResultSet rs = preparedStatement.executeQuery();

		boolean ableId = true;
		if(rs.next()) {
				ableId=false;
		 }
		userCreateConfirmDTO.setAbleId(ableId);
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }finally {
		  try {
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	  }return userCreateConfirmDTO;
	}
}
