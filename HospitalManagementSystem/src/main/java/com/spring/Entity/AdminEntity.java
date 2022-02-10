package com.spring.Entity;
import javax.persistence.*;

@Entity
public class AdminEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AdminId;
	@Column
	private String AdminLogin;
	@Column
	private String Password;
}
