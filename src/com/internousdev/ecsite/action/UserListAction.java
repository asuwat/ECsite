package com.internousdev.ecsite.action;

import java.util.ArrayList;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {
	private ArrayList<UserListDTO> dto = new ArrayList<UserListDTO>();
	public String execute() {
		UserListDAO dao = new UserListDAO();
		dto=dao.getUserList();
		return SUCCESS;

	}

	public ArrayList<UserListDTO> getDto(){
		return dto;
	}

}
