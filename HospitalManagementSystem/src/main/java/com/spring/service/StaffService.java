package com.spring.service;

import com.spring.Entity.StaffEntity;

public interface StaffService {
	
	public void addstaff(StaffEntity staff);

	public StaffEntity findByStaffMailAndStaffPassword(String staffMail, String staffPassword);
}
