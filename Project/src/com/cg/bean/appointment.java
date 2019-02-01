package com.cg.bean;

import java.time.LocalDate;

public class appointment {

	private String name;
	private Long phone;
	private Integer id;
	private LocalDate date;
	private String email;
	private String doctor;
	private String status;
	private Integer age;

	private String gender;
	private String problem;
	
	
	public appointment()
	{
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getProblem() {
		return problem;
	}


	public void setProblem(String problem) {
		this.problem = problem;
	}


	public appointment(String name, Long phone, Integer id, LocalDate date,
			String email, String doctor, String status, Integer age,
			String gender, String problem) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.date = date;
		this.email = email;
		this.doctor = doctor;
		this.status = status;
		this.age = age;
		this.gender = gender;
		this.problem = problem;
	}

}
