package com.mstred;

import java.text.MessageFormat;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
// import org.springframework.beans.factory.annotation.Autowired;

@Controller("managedBean")
public class ManagedBean {
	
	public String getHello() {
		return MessageFormat.format("Hello, this is {0}.", this.getClass().getSimpleName());
	}

	//@Autowired
	@Inject
	private Repository<Entity> repo;
	
	public List<Entity> findAll() {
		return repo.findAll();
	}
	
	public ManagedBean() {
		Entity e = null;
		try {
			for (int i = 1; i <= 10; i++) {
				e = new Entity();
				e.setName("Entity " + i);
				e = null;
				repo.insert(e);
			}
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
	}
}
