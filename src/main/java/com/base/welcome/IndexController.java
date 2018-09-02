package com.base.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {
	@RequestMapping("welcome")
	public String welcome() {
		return "/welcome/welcome";
	}
}
