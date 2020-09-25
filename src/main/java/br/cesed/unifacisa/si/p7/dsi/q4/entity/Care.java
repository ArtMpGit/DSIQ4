package br.cesed.unifacisa.si.p7.dsi.q4.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Care implements Serializable {
	
	private static final long serialVersionUID = 2030811428002140437L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCare;
	private Integer idStaff;
	private Integer idSupportedPeople;
	
	public Integer getIdCare() {
		return idCare;
	}
	
	public void setIdCare(Integer idCare) {
		this.idCare = idCare;
	}
	
	public Integer getIdStaff() {
		return idStaff;
	}
	
	public void setIdStaff(Integer idStaff) {
		this.idStaff = idStaff;
	}
	
	public Integer getIdSupportedPeople() {
		return idSupportedPeople;
	}
	
	public void setIdSupportedPeople(Integer idSupportedPeople) {
		this.idSupportedPeople = idSupportedPeople;
	}
	

}
