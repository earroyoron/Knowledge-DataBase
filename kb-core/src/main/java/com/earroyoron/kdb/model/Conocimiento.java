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
	private String descripción;
	@ManyToMany()
	private Set<Area> áreas;
	@ManyToMany()
	private Set<AccionMejora> mejoras;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public Set<Area> getÁreas() {
		return áreas;
	}
	public void setÁreas(Set<Area> áreas) {
		this.áreas = áreas;
	}
	public Set<AccionMejora> getMejoras() {
		return mejoras;
	}
	public void setMejoras(Set<AccionMejora> mejoras) {
		this.mejoras = mejoras;
	}
	
	

}
