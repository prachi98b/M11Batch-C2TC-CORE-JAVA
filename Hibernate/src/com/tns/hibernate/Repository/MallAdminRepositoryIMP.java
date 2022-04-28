package com.tns.hibernate.Repository;

import javax.persistence.EntityManager;
import com.tns.hibernate.Entity.MallAdmin;

public class MallAdminRepositoryIMP implements IMallAdminRepository {


	private EntityManager entitymanager;
	
	public MallAdminRepositoryIMP() {
		entitymanager = JPAUtil.getEntityManager();
	}
	
	@Override
	public MallAdmin addMallAdmin(MallAdmin malladmin) {
		// TODO Auto-generated method stub
		entitymanager.persist(malladmin);
		return malladmin;	
	}

	@Override
	public void updateMallAdmin(MallAdmin malladmin) {
		
	}
	
	@Override
	public MallAdmin getMallAdminById(int id) {
		
		MallAdmin malladmin = entitymanager.find(MallAdmin.class, id);
		
		return malladmin;
	}

	@Override
	public MallAdmin removeMallAdmin(int id) {
		// TODO Auto-generated method stub
		entitymanager.remove(removeMallAdmin(0));
		return removeMallAdmin(0);	
	}
		
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
	}
	
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
	}
	
}
