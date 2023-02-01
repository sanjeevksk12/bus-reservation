package com.example.Bus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Passenger {
    @Id
	private int passengerId;
    private String passengerName;
    private String Gender;
    private int Age;
    private Long contactNumber;
    private String emailId;
	public int getId() {
		return passengerId;
	}
	public void setId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Passenger(int id, String passengerName, String gender, int age, int contactNumber, String emailId) {
		super();
		this.passengerId = id;
		this.passengerName = passengerName;
		Gender = gender;
		Age = age;
		this.contactNumber = (long) contactNumber;
		this.emailId = emailId;
	}

    
    
}
