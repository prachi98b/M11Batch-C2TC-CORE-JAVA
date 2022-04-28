package com.tns.hibernate.Repository;


import javax.persistence.EntityManager;
import com.tns.hibernate.Entity.ShopOwner;

public class ShopOwnerRepositoryIMP implements IShopOwnerRepository {

	private EntityManager entitymanager;
	
	public ShopOwnerRepositoryIMP() {
		entitymanager = JPAUtil.getEntityManager();
	}
	
	
	@Override
	public ShopOwner addShopOwner(ShopOwner shopowner) {
		entitymanager.persist(shopowner);
		return shopowner;
		
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopowner) {
		int a = ((com.tns.hibernate.Entity.ShopOwner)shopowner).getId();
		ShopOwner so = entitymanager.find(ShopOwner.class, a);
		try {
			if (so == null) {
				throw new ShopOwnerNotFoundException("Shop Owner Not Found");
			}else {
				entitymanager.merge(shopowner);
			}
		}catch (ShopOwnerNotFoundException e) {
			System.out.println(e);
		}
		return (com.tns.hibernate.Entity.ShopOwner) so;
		
	}
	

	@Override
	public ShopOwner searchShopOwnerById(int id) {
		
		ShopOwner shopowner = entitymanager.find(ShopOwner.class, id);
		try {
			if (shopowner == null) {
				throw new ShopOwnerNotFoundException("Shop Owner Not Found");
			}
		}catch (ShopOwnerNotFoundException e) {
			System.out.println(e);
		}
		return shopowner;
	}

	
	@SuppressWarnings("unused")
	@Override
	public ShopOwner removeShopOwner(ShopOwner shopowner) {
		// TODO Auto-generated method stub
		
		int a = ((com.tns.hibernate.Entity.ShopOwner)shopowner).getId();
		ShopOwner so = entitymanager.find(ShopOwner.class, a);
		try {
			if(shopowner == null) {
				throw new ShopOwnerNotFoundException("Shop Owner Not Found.");
			}else {
				entitymanager.remove(so);
			}
		}catch (ShopOwnerNotFoundException e) {
			System.out.println(e);
		}
		
		return null;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entitymanager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entitymanager.getTransaction().commit();
	}
	
	

}
