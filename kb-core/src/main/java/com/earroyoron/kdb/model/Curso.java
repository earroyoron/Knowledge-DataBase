package com.earroyoron.kdb.model;

import javax.persistence.Entity;

@Entity
public class Curso extends AccionMejora {
	
	private String impartido;

	public String getImpartido() {
		return impartido;
	}

	public void setImpartido(String impartido) {
		this.impartido = impartido;
	}
	

}
