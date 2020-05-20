package net.myslipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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
		JSONArray jsonArray= new JSONArray();
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("tag", "Tom");
		jsonObj.put("flag", true);
		
		
		
		model.addAttribute("name", name);
		model.addAttribute("json", jsonObj);
		return "view1";
	}
	
	@RequestMapping("view2")
	public String view2(String name,Model model) {
		System.out.println("name : "+name);
		JSONArray jsonArray= new JSONArray();
		JSONObject jsonObj1=new JSONObject();
		jsonObj1.put("tag", "Tom");
		jsonObj1.put("flag", true);
		
		JSONObject jsonObj2=new JSONObject();
		jsonObj2.put("tag", "John");
		jsonObj2.put("flag", false);
		
		
		jsonArray.add(jsonObj1);
		jsonArray.add(jsonObj2);
		
		
		model.addAttribute("jsons", jsonArray);
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
