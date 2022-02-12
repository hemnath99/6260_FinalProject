package com.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HospitalController 
{
		@GetMapping("/login")
		private String login() {
			return"login";
		}
	
		@GetMapping("/home")
		private String home() {
			return"home";
		}
		
		@GetMapping("/doctor")
		private String doctor() {
			return"doctor";
		}
		
		@GetMapping("/dashboard")
		private String dashboard()
		{
			return"dashboard";
		}
		
		@GetMapping("/admin")
		private String admin(){
			return"admin";
		}
		@GetMapping("/staff")
		private String staff() {
			return"staff";
		}
		
		@GetMapping("/base")
		private String base() {
			return"base";
		}

		@GetMapping("/patient")
		private String patient()
		{
			return"patient";
		}	
		@GetMapping("/newfile")
		private String newfile()
		{
			return"newfile";
		}	

}
