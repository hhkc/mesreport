package com.jrh.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String index(){
		
		return "home/index";
	}
	
	@RequestMapping("/center")
	public String center(){
		return "home/center";
	}
}
