package com.mstred;

import java.text.MessageFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@javax.persistence.Entity
public class Entity {

	@Id @GeneratedValue
	private Long id;
	
	@Version
	private Long version; 
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getVersion() {
		return version;
	}
	
	public void setVersion(Long version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Entity [id={0}, version={1}, name={2}]", id, version, name);
	}
}
