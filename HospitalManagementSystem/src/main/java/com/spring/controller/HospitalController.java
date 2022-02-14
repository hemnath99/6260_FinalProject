package com.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.Entity.DoctorEntity;
import com.spring.service.DoctorService;

@Controller
public class HospitalController 
{
	@Autowired
	private DoctorService doctorService;
	
			@GetMapping("/base")
			private String base() 
			{
				return"base/base";
			}
			
			@GetMapping("/index")
			private String index() 
			{
				return"base/index";
			}
			
			@GetMapping("/home")
			private String home() 
			{
				return"base/home";
			}
			
			@GetMapping("/dashboard")
			private String dashboard()
			{
				return"base/dashboard";
			}
			
			@GetMapping("/admin")
			private String admin()
			{
				return"admin/admin";
			}
			
			@GetMapping("/adminlogin")
			private String adminlogin() 
			{
				return"admin/adminlogin";
			}
			
			
			@GetMapping("/doctorlogin")
			private String doctorlogin() 
			{
				return"doctor/doctorlogin";
			}
			
			@GetMapping("/doctor")
			private String doctor() 
			{
				return"doctor/doctor";
			}
			
			@GetMapping("/doctorform")
			private String doctorform() 
			{
				return"doctor/doctorform";
			}
			
			@GetMapping("/doctorsdetail2")
			private String doctorlist(Model model) 
			{
				
				List<DoctorEntity>  list =  doctorService.displayAllDoctorList();
				model.addAttribute("doctorform", list);
				
				
				return"doctor/doctorsdetail";
			}
			
			@GetMapping("/staffsdetail")
			private String stafflist() 
			{
				return"staff/staffsdetail";
			}
			
			@GetMapping("/stafflogin")
			private String stafflogin() 
			{
				return"staff/stafflogin";
			}
				
			@GetMapping("/staffform")
			private String staffform() {
				return"staff/staffform";
			}

			
			@GetMapping("/staff")
			private String staff() {
				return"staff/staff";
			}

			@GetMapping("/patient")
			private String patient()
			{
				return"patient/patient";
			}	
		
			@GetMapping("/patientsdetail")
			private String patientlist()
			{
				return"patient/patientsdetail";
			}	
		
			@GetMapping("/newfile")
			private String newfile()
			{
				return"newfile";
			}	

}
