package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;
	private Map<String,Object>session;

	public String execute() {
		String result=ERROR;

		if(itemName.equals("") || itemPrice<=0 || itemStock<=0) {

		}else {
			session.put("itemName",itemName);
			session.put("itemPrice",itemPrice);
			session.put("itemStock",itemStock);
			result=SUCCESS;
		}

		return result;
	}



	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session) {
		this.session=session;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}


}
