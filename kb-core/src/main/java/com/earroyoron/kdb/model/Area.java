package com.earroyoron.kdb.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Area {

	@Id
	@GeneratedValue
	private Long id;
	private String descripci�n;
	@ManyToMany(mappedBy = "�reas")
	private Set<Conocimiento> conocimientos;
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
	public Set<Conocimiento> getConocimientos() {
		return conocimientos;
	}
	public void setConocimientos(Set<Conocimiento> conocimientos) {
		this.conocimientos = conocimientos;
	}
	
	
	
}
