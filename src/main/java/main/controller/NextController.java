package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.TestDao;

@Controller
@RequestMapping("next")
public class NextController {

	@Autowired
	TestDao testDao;
	
	@RequestMapping("")
	public String getNext() {
		System.out.println("Next Controller - getNext() method");
		return "Next Page";
	}
	
	@RequestMapping("dao")
	public void getDao() {
		System.out.println(testDao.getTestDaoMessage());
	}
	
	@RequestMapping("param/{id}")
	public String getParam(@PathVariable(name = "id")String id) {
		System.out.println(id+"======");
		return null;
	}
	
	@RequestMapping("par")
	public String getPar(@RequestParam("name")String name) {
		System.out.println("par : "+name+"======");
		return null;
	}
	
	@RequestMapping("form")
	public String form() {
		return "form";
	}
	
	@PostMapping("form")
	public String input(@RequestParam("nama")String nama,@RequestParam("kelas")String kelas,Model model) {
		model.addAttribute("nama", nama);
		model.addAttribute("kelas", kelas);
		return "result";
	}
}
