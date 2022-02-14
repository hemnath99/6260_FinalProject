package com.spring.controller;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.Entity.DoctorEntity;
import com.spring.service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/homed")
	public String doctor (@ModelAttribute DoctorEntity doctor, Model model) 
	{		
		doctorService.adddoctor(doctor);
		model.addAttribute(doctor);
		return"base/home";
		
	}
	
	@PostMapping("/doctorLoginCheck")
	public String doctorlogin(@ModelAttribute DoctorEntity doctorEntity)
	{
		DoctorEntity doctorLogin=doctorService.findByDoctorMailAndDoctorPassword
				(doctorEntity.getDoctorMail(),doctorEntity.getDoctorPassword());
		
		if(Objects.isNull(doctorLogin)) 
		{
			return"doctorlogin";
		}
		else 
		{
			return"doctor";
		}
		
	}

}
