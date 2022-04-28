package com.tns.hibernate.ServiceInterface;

import com.tns.hibernate.Entity.*;

public abstract interface IAdminService {
	
	public abstract MallAdmin updateUser(User user);
	public abstract MallAdmin approveNewShop(Shop Boolean);
	
	public abstract MallAdmin login(User user);
	public abstract MallAdmin logout(long Boolean);
	
	
}
