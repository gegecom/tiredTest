package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.UserInf;
import com.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="uname",defaultValue="")String userName,
						@RequestParam(value="upass",defaultValue="")String password,
						Model model){
		String path = "";
		
		UserInf user = new UserInf();
		user.setUserName(userName);
		user.setPassword(password);
		
		if(userService.isLogin(user)){
			model.addAttribute("userName", userName);
			path = "success";
		}else{
			model.addAttribute("loginStatus", "fail");
			path = "login";
		}
		
		
		return path;
	}
}
