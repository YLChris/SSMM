package com.chenzilong.system.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("login.html")
	public String login(){
		
		return "system/login";
	}
}
