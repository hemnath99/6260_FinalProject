package com.spring.Entity;
import javax.persistence.*;

@Entity
public class HospitalEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int patientId;
		@Column 
		private String tokenNumber;
		@Column
		private String  patientName;
		@Column
		private String  patientAge;
		@Column
		private String patientGender;
		@Column
		private String patientProblem;
		@Column
		private String patientContact;
		@Column
		private String fixedDate;
		@Column
		private String fixedTime;
		@Column
		private String patientType;
		
		
		public HospitalEntity() {
			super();
		}


		public HospitalEntity(int patientId, String tokenNumber, String patientName, String patientAge,
				String patientGender, String patientProblem, String patientContact, String fixedDate, String fixedTime,
				String patientType) {
			super();
			this.patientId = patientId;
			this.tokenNumber = tokenNumber;
			this.patientName = patientName;
			this.patientAge = patientAge;
			this.patientGender = patientGender;
			this.patientProblem = patientProblem;
			this.patientContact = patientContact;
			this.fixedDate = fixedDate;
			this.fixedTime = fixedTime;
			this.patientType = patientType;
		}


		public int getPatientId() {
			return patientId;
		}


		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}


		public String getTokenNumber() {
			return tokenNumber;
		}


		public void setTokenNumber(String tokenNumber) {
			this.tokenNumber = tokenNumber;
		}


		public String getPatientName() {
			return patientName;
		}


		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}


		public String getPatientAge() {
			return patientAge;
		}


		public void setPatientAge(String patientAge) {
			this.patientAge = patientAge;
		}


		public String getPatientGender() {
			return patientGender;
		}


		public void setPatientGender(String patientGender) {
			this.patientGender = patientGender;
		}


		public String getPatientProblem() {
			return patientProblem;
		}


		public void setPatientProblem(String patientProblem) {
			this.patientProblem = patientProblem;
		}


		public String getPatientContact() {
			return patientContact;
		}


		public void setPatientContact(String patientContact) {
			this.patientContact = patientContact;
		}


		public String getFixedDate() {
			return fixedDate;
		}


		public void setFixedDate(String fixedDate) {
			this.fixedDate = fixedDate;
		}


		public String getFixedTime() {
			return fixedTime;
		}


		public void setFixedTime(String fixedTime) {
			this.fixedTime = fixedTime;
		}


		public String getPatientType() {
			return patientType;
		}


		public void setPatientType(String patientType) {
			this.patientType = patientType;
		}


		@Override
		public String toString() {
			return "HospitalEntity [patientId=" + patientId + ", tokenNumber=" + tokenNumber + ", patientName="
					+ patientName + ", patientAge=" + patientAge + ", patientGender=" + patientGender
					+ ", patientProblem=" + patientProblem + ", patientContact=" + patientContact + ", fixedDate="
					+ fixedDate + ", fixedTime=" + fixedTime + ", patientType=" + patientType + "]";
		}


	

				
				
}
