package net.myslipp.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class UserController {
	private List<User> users=new ArrayList<User>();
	

//	@GetMapping("/create")
	@PostMapping("/create")
//	public String create(String userid,String password,String name) {
	public String create(User user) {
//		System.out.println("uid : "+userid+", pw : "+password+", name : "+name);
		System.out.println("user : "+user);
		users.add(user);
		return "redirect:list";
	}
	@GetMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		model.addAttribute("users", users);
		return "list";
	}
	//brch1
	
	
}
