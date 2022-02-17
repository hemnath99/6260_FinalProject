package com.spring.service;

import java.util.List;

import com.spring.Entity.HospitalEntity;

public interface HospitalService {

	public void addhospital(HospitalEntity hospital);



	public List<HospitalEntity> displayAllHospitalList();

	public void deleteByHospitalId(int id);

	public HospitalEntity findByPatientId(int id);

}
