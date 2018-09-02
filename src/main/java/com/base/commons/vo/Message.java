package com.base.commons.vo;

public class Message {
	private Integer code;
	
	private String errorMsg;
	
	private String msg;
	
	private Object data;
	
	public static Message success(Object data) {
		Message message = new Message();
		message.data = data;
		message.msg = "成功";
		message.code = 200;
		return message;
	}
	
	public static Message error(Object data,String errorMsg,Integer code) {
		Message message = new Message();
		message.data = data;
		message.msg = "失败";
		message.code = 500;
		message.errorMsg = errorMsg;
		return message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
