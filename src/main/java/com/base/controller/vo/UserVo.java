package com.base.controller.vo;

import org.springframework.beans.BeanUtils;

import com.base.entities.User;

public class UserVo {
	private Long uid;
	private String userName;
	
	public UserVo() {
	
	}
	
	public UserVo(User user) {
		BeanUtils.copyProperties(user, this);
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
