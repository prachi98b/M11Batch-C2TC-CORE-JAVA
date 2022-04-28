package com.tns.hibernate.Repository;

import com.tns.hibernate.Entity.ShopOwner;

public interface IShopOwnerRepository {
	
	public abstract ShopOwner addShopOwner(ShopOwner shopowner);
	public abstract ShopOwner updateShopOwner(ShopOwner shopowner);
	
	public abstract ShopOwner searchShopOwnerById(int id);
	public abstract ShopOwner removeShopOwner(ShopOwner shopowner);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
