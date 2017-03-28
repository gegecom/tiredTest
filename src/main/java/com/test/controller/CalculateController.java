package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.Calculate;
import com.test.service.CalculateService;

@Controller
@RequestMapping("/calculater")
public class CalculateController {
	@Autowired
	CalculateService calculateService;
	
	@RequestMapping("/hh")
	public String hh(){
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
		return "";
	}
	
	@RequestMapping("/calculate")
	public String calculate(
			@RequestParam(value = "value1",required=false) int value1,
			@RequestParam(value = "value2",required=false) int value2,
			@RequestParam(value = "flag",required=false) int flag,Model model
			) {
		Calculate cal = new Calculate();
		int result = 0;
		if (flag == 0) {
			result = value1 + value2;
			cal.setFlag("+");
		} else if (flag == 1) {
			result = value1 - value2;
			cal.setFlag("-");
		} else if (flag == 2) {
			result = value1 * value2;
			cal.setFlag("-");
		} else if (flag == 3) {
			result = value1 / value2;

			cal.setFlag("-");
		}
		cal.setValue1(value1);
		cal.setValue2(value2);
		cal.setResult(result);
		model.addAttribute("result", result);
		calculateService.calculate(cal);

		return "calculateResult";
	}
}
