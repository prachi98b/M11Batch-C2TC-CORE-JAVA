package com.tns.hibernate.ServiceInterface;

//import java.util.*;
import com.tns.hibernate.Repository.*;
import com.tns.hibernate.Entity.*;
import javax.persistence.EntityManager;
//import javax.persistence.Query;


public class AdminServiceIMP implements IAdminService 
{
	private EntityManager entitymanager;
	
	public AdminServiceIMP() {
		setEntitymanager(JPAUtil.getEntityManager());
	}
	
	@Override
	public MallAdmin updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallAdmin approveNewShop(Shop Boolean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallAdmin login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallAdmin logout(long Boolean) {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager getEntitymanager() {
		return entitymanager;
	}

	public void setEntitymanager(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}
}
