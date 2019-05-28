package com.internousdev.ecsite.action;

import java.util.ArrayList;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport {

	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	public String execute() {
		ItemListDAO dao = new ItemListDAO();
		itemList=dao.getItemList();

		return SUCCESS;
	}
	public ArrayList<ItemListDTO> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<ItemListDTO> itemList) {
		this.itemList = itemList;
	}



}
