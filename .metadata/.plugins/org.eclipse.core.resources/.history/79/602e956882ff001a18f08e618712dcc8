package com.si.dsi.questao4.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffTypes implements Serializable {
	
	private static final long serialVersionUID = 64125083847583624L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer staffType;
	private String description;
	
	public Integer getStaffType() {
		return staffType;
	}
	
	public void setStaffType(Integer staffType) {
		this.staffType = staffType;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
