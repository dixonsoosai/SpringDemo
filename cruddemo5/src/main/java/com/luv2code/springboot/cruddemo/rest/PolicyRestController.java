package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luv2code.springboot.cruddemo.entity.Policy_Master;

@RestController
@RequestMapping("/api")
public class PolicyRestController {

	@Autowired
	private EntityManager entity_manager;
	
	// expose "/policies" and return list of policies
	@GetMapping("/policy/{W0POLNUM}")
	public Policy_Master findpolnum(@PathVariable String W0POLNUM) {
		Session currentsession = entity_manager.unwrap(Session.class);
		Query W0RESULT = currentsession.createQuery("from Policy_Master where Policy_Number = :W0POLNUM");
		W0RESULT.setParameter("W0POLNUM", W0POLNUM);
		@SuppressWarnings(value = { "unchecked" })
		List<Policy_Master> W0TEMP = W0RESULT.getResultList();		
		return W0TEMP.get(0);
	}

	
}










