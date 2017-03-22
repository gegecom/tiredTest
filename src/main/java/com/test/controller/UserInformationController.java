package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.UserInformation;
import com.test.service.UserInformationService;
@Controller
@RequestMapping("/userInformation")
public class UserInformationController {
	@Autowired
	UserInformationService userInformationService;
	

	@RequestMapping("/information")
	public String users(@RequestParam(value="userName",defaultValue="")String userName,
						@RequestParam(value="information",defaultValue="")String information){
		UserInformation uu = new UserInformation();
		uu.setInformation(information);
		uu.setUserName(userName);
		
		List<UserInformation> uInformation = userInformationService.userInformation(uu);
		
		if(uInformation.size()>0){
			return "success";
		}else{
			return "login";
		}
		
	}
}
