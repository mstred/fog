package com.mstred;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("managedBean")
public class ManagedBean {
	
	public String getHello() {
		return String.format("Hello, this is %s.", this.getClass().getSimpleName());
	}

	@Autowired
	private Repository<Entity> repo;
	
	public List<Entity> findAll() {
		return repo.findAll();
	}
	
	public ManagedBean() {
		if (repo == null) {
			Logger.getLogger(getHello()).log(Level.WARNING, "@Inject not valid");
		} else {
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
}
