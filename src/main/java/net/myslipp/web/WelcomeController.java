package net.myslipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("welcome")
	public String welcome(String name,Model model) {
		System.out.println("name : "+name);
		model.addAttribute("name", name);
		return "welcome";
	}
	@RequestMapping("welcome2")
	public String welcome2(String name,Model model) {
		System.out.println("name : "+name);
		model.addAttribute("name", name);
		return "test/welcome";
	}
	@RequestMapping("view1")
	public String view1(String name,Model model) {
		System.out.println("name : "+name);
		model.addAttribute("name", name);
		return "view1";
	}
	
	@RequestMapping("view2")
	public String view2(String name,Model model) {
		System.out.println("name : "+name);
		model.addAttribute("name", name);
		return "view2";
	}
	@RequestMapping("view3")
	public String view3(String name,Model model) {
		System.out.println("name : "+name);
		model.addAttribute("name", name);
		return "cj/view3";
	}
	
	
	

}
