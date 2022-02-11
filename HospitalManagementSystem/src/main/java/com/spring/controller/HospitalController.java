package com.spring.controller;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.AdminEntity;
import com.spring.Entity.DoctorEntity;
import com.spring.Entity.PatientEntity;
import com.spring.Entity.StaffEntity;
import com.spring.service.AdminService;
import com.spring.service.DoctorService;
import com.spring.service.PatientService;
import com.spring.service.StaffService;


@Controller
public class HospitalController 
{
	@Autowired
	private PatientService patientService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private DoctorService doctorService;
	 @Autowired
	  private AdminService adminService;
			
	
	@GetMapping("/login")
	private String login() {
		return"login";
	}
	
		@GetMapping("/home")
		private String display1() {
			return"home";
		}
		
		@GetMapping("/doctor")
		private String display2() {
			return"doctor";
		}
		
		@GetMapping("/dashboard")
		private String display3() {
			return"dashboard";
		}
		
		@GetMapping("/admin")
		private String display5() {
			return"admin";
		}
		@GetMapping("/staff")
		private String display6() {
			return"staff";
		}
		
		@GetMapping("/home2")
		private String display7() {
			return"home2";
		}

		@GetMapping("/patient")
		private String display8() {
			return"patient";
		}
		
		@PostMapping("/next")
		public String next (@ModelAttribute PatientEntity patient, Model model) 
		{
			 
			patientService.addpatient(patient);
			model.addAttribute(patient);
	
			return"home2";
			
		}
		
		@PostMapping("/nextpage")
		public String staff (@ModelAttribute StaffEntity staff, Model model1) 
		{		 
			staffService.addstaff(staff);
			model1.addAttribute(staff);
			return"home2";
			
		}
		
		@PostMapping("/nextpage1")
		public String doctor (@ModelAttribute DoctorEntity doctor, Model model2) 
		{		
			doctorService.adddoctor(doctor);
			model2.addAttribute(doctor);
			return"home2";
			
		}
	
		@PostMapping("/adminLoginCheck")
		public String login(@ModelAttribute AdminEntity adminEntity)
		 {	
			  AdminEntity admin= adminService.findByAdminLoginAndAdminPassword(adminEntity.getAdminLogin(),
						  adminEntity.getAdminPassword());

				  if(Objects.isNull(admin))
				  {
					      return "redirect:/login";
				  }
				  else
				  {
					    return   "redirect:/admin";   
				  }
		  }
}
