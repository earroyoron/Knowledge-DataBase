package com.earroyoron.kdb.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AccionMejora {

	@Id
	@GeneratedValue
	private Long id;
	private String descripción;
	private int completado;
	@ManyToMany(mappedBy = "mejoras")
	private Set<Conocimiento> conocimientos;
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
	public int getCompletado() {
		return completado;
	}
	public void setCompletado(int completado) {
		this.completado = completado;
	}
	public Set<Conocimiento> getConocimientos() {
		return conocimientos;
	}
	public void setConocimientos(Set<Conocimiento> conocimientos) {
		this.conocimientos = conocimientos;
	}
	
	
}
