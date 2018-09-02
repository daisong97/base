package com.base.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.base.controller.vo.UserLoginVo;
import com.base.controller.vo.UserVo;
import com.base.entities.User;

@Controller
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static final String login_page = "/common/login";
	
	public static final String index_page = "/common/index";

	@RequestMapping("/login")
	public String login() {
		return login_page;
	}
	@RequestMapping("/index")
	public String index() {
		return index_page;
	}


	@RequestMapping("/loginUser")
	@ResponseBody
	public Object loginUser(@RequestBody UserLoginVo userLoginVo, HttpSession session) throws Exception {
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userLoginVo.getUsername(),
				userLoginVo.getPassword());
		Subject subject = SecurityUtils.getSubject();

		subject.login(usernamePasswordToken); // 完成登录
		User user = (User) subject.getPrincipal();
		session.setAttribute("user", user);
		return new UserVo(user);
	}

	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
//        session.removeAttribute("user");
		return "login_page";
	}
}