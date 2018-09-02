package com.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	@RequestMapping("getUser")
	public String user() {
		return "/user/user";
	}
}
