package com.earroyoron.kdb.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Conocimiento {
	
	@Id
	@GeneratedValue
	private Long id;
	private String descripci�n;
	@ManyToMany()
	private Set<Area> �reas;
	@ManyToMany()
	private Set<AccionMejora> mejoras;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripci�n() {
		return descripci�n;
	}
	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}
	public Set<Area> get�reas() {
		return �reas;
	}
	public void set�reas(Set<Area> �reas) {
		this.�reas = �reas;
	}
	public Set<AccionMejora> getMejoras() {
		return mejoras;
	}
	public void setMejoras(Set<AccionMejora> mejoras) {
		this.mejoras = mejoras;
	}
	
	

}
