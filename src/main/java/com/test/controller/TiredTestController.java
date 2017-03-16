package com.test.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TiredTestController {
	
	public TiredTestController() {
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHH");
	}

	@RequestMapping("/tiredTestController")
	public String test(Model model, @RequestParam(value="userName")String name, @RequestParam(value="pwd")String pwd){
		if(name.equals("123")){
			model.addAttribute("userName", name);
		}else{
			model.addAttribute("userName", "UU");
		}
		 if(pwd.equals("456")){
			 model.addAttribute("pwd", pwd);
		 }else{
				model.addAttribute("pwd", "pp");
			}
		
		return "success";
	}
}
