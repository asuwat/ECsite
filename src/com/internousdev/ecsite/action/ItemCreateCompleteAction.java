package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	public String execute() {
		String result = SUCCESS;
		ItemCreateCompleteDAO dao = new ItemCreateCompleteDAO();
		dao.insertItem(session.get("itemName").toString(), ((Integer)session.get("itemPrice")).intValue(), ((Integer)session.get("itemStock")).intValue());

		return result;

	}

	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session) {
		this.session=session;
	}
}
