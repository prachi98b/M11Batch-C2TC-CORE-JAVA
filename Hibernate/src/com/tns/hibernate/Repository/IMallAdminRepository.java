package com.tns.hibernate.Repository;

import com.tns.hibernate.Entity.MallAdmin;

public interface IMallAdminRepository {
	
	public abstract MallAdmin addMallAdmin(MallAdmin malladmin);
	public abstract void updateMallAdmin(MallAdmin malladmin);
	
	public abstract MallAdmin getMallAdminById(int id);
	public abstract MallAdmin removeMallAdmin(int id);
		
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
