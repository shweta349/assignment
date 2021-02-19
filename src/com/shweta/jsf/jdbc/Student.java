package com.shweta.jsf.jdbc;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String age;
	private String gender;
	private String email;
	private String address;
	
	public Student() {
	}
	
	public Student(int id, String firstName, String lastName, String age, String gender, String email, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age=age;
		this.gender=gender;
		this.email = email;
		this.address=address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", gender=" + gender + ",  email=" + email + ", address=" + address + " ]";
	}

}
