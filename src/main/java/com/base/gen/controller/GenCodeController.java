package com.base.gen.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.base.gen.GenCodeService;

@Controller
@RequestMapping("gen-code")
public class GenCodeController {
	@Autowired
	private GenCodeService genCodeService;
	
	@RequestMapping("list")
	public ModelAndView list() throws SQLException {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("/gen-code/list");
		modelAndView.addObject("listData", genCodeService.getAllTable());
		return modelAndView;
	}
}
