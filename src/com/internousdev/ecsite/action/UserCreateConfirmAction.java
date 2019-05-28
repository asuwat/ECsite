package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.internousdev.ecsite.dto.UserCreateConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;
	private String errorMessage="";

	public String execute() {
		String result=ERROR;

		if(!(loginUserId.matches("[A-Za-z0-9]{3,20}"))){
			errorMessage="idは3文字以上の半角英数字にしてください。";
		}
		if(!(loginPassword.matches("[A-Za-z0-9]{6,20}"))) {
			errorMessage+="passは6文字以上の半角英数字にしてください。";
		}
		if((userName.equals(""))) {
			errorMessage+="ユーザー名が空白です。";
		}
		if(errorMessage=="") {
			UserCreateConfirmDAO userCreateConfirmDAO =new UserCreateConfirmDAO();
			UserCreateConfirmDTO userCreateConfirmDTO =userCreateConfirmDAO.idConfirm(loginUserId);
			if(userCreateConfirmDTO.getAbleId()){
				session.put("loginUserId",loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("userName", userName);
				result=SUCCESS;

			}else{
				setErrorMessage("すでに使われているIDです。");
			}

		}

		return result;
	}


	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session) {
		this.session=session;
	}

}
