package com.base.controller.vo;

import javax.validation.constraints.NotEmpty;

public class UserLoginVo {
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	/**
	 * 验证码
	 */
	private String vCode;
	
	public String getvCode() {
		return vCode;
	}
	public void setvCode(String vCode) {
		this.vCode = vCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
