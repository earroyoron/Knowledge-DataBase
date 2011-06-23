package com.earroyoron.kdb.model;

import javax.persistence.Entity;

@Entity
public class Libro extends AccionMejora {

	private String autor;
	private String editorial;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
}
