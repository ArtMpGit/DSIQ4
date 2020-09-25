package com.si.dsi.questao4.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SupportedPeople implements Serializable {

	private static final long serialVersionUID = -386057260652711675L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idSupportedPeople;
	private String forename;
	private String surname;
	private LocalDate dob;
	private String photo;
	
	public Integer getIdSupportedPeople() {
		return idSupportedPeople;
	}
	
	public void setIdSupportedPeople(Integer idSupportedPeople) {
		this.idSupportedPeople = idSupportedPeople;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
