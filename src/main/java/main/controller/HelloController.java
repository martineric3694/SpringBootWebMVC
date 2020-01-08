package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.TestDao;

@Controller
public class HelloController {
	
	@Autowired
	TestDao testDao;

	@RequestMapping("hello")
	public void coba() {
		System.out.println("===coba method===");
//		return "welcome";
	}
	
	@RequestMapping("landing")
	public String showPage(Model model) {
		System.out.println("===show Page===");
//		model.addAttribute("message", "Welcome Page Spring Boot Web MVC + Thymeleaf");
		model.addAttribute("message",testDao.getTestDaoMessage());
		return "welcome";
	}
}
