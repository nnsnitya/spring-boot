package com.sprinitializr.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	
	@RequestMapping("/test")
	public String test() {
		return "Just for testing!!";
	}
	
	@RequestMapping("/test1")
	public String handleTest() {
		return "This is testing using sts";
	}
}
