package com.ltts.project.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	
	
	
	
	@RequestMapping(" ")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/h")
	public String fun()
	{
		return "Home";
	}
	
	@RequestMapping("/Heart_Rate")
	public String heart()
	{
		return "Heart_Rate";
	}
	
	@RequestMapping("/home")
	public String hom()
	{
		return "Home";
	}
	
	@RequestMapping("/Home")
	public String ho()
	{
		return "Home";
	}
	
	@RequestMapping("/Blood_Pressure")
	public String blood()
	{
		return "Blood_Pressure";
	}
	
	@RequestMapping("/Oxygen_Level")
	public String oxygen()
	{
		return "Oxygen_Level";
	}
	
	@RequestMapping("/About")
	public String about()
	{
		return "About";
	}
	
	@RequestMapping("/Contact")
	public String cont()
	{
		return "Contact";
	}
	
	@GetMapping("/data")
	public String welc()
	{
		return "db";
	}
	
	

       

}
