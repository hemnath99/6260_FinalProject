package com.spring.Entity;
import javax.persistence.*;

@Entity
public class HospitalEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column
	private String Name;
}
