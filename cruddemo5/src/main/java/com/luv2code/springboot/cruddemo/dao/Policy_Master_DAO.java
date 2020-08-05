package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Policy_Master;

@Repository
public class Policy_Master_DAO {

	private EntityManager entityManager;
	
	@Autowired
	public  Policy_Master_DAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
		
	@Transactional
	public Policy_Master customer_policy_info(String W0POLNUM)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		Query result = 
				currentSession.createQuery("from Policy_Master where Policy_Number = :W0POLNUM ");
		result.setParameter("W0POLNUM", W0POLNUM);
		@SuppressWarnings(value = { "unchecked" })
		List<Policy_Master> W0TEMP = result.getResultList();
		return W0TEMP.get(0);
	}
		
	
	
}
