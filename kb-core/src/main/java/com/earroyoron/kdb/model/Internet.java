package com.earroyoron.kdb.model;

import javax.persistence.Entity;

@Entity
public class Internet extends AccionMejora {

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
