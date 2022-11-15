package com.fatou.OneToOne.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "user_ profiles")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "phone_number")
	private String  phoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;
	
//	@Column(name = "birth_date")
//	@DateTimeFormat(style = "yyyy-MM-dd")
//	private LocalDate birthOfdate;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
	//@OneToOne
//	private User user;
	public UserProfile() {
		
	}
	
	public UserProfile(String phoneNumber, String address, Gender gender, LocalDate birthOfdate) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		//this.birthOfdate = birthOfdate;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
//	public LocalDate getBirthOdate() {
//		return birthOfdate;
//	}
//	public void setBirthOdate(LocalDate birthOdate) {
//		this.birthOfdate = birthOdate;
//	}
	

	
}
