package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.User;


@Controller
public class CommonController {
	
	
	
	public CommonController() {
		System.out.println("Inside controller");
	}

	/*@RequestMapping(value="/sayHi")
	public ModelAndView sayHi() {
		System.out.println("Hell");
		return new ModelAndView("index");
	}*/
	
	@RequestMapping(value="/sayHi")
	public String sayHi() {
		System.out.println("Hell");
		return "redirect:/index.html";
	}
	
	@RequestMapping(value="/testUser", method=RequestMethod.POST)
	public void testUser(@RequestBody User user) {
		System.out.println(user.getId());
	}

}
