package com.tns.hibernate.Entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="shopowner")
public class ShopOwner implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private LocalDate dob;
	private String address;
	
	private shop_id Shop;
	
	public ShopOwner(int id, String name, LocalDate dob, String address, shop_id shop) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		Shop = shop;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", Shop=" + Shop
				+ "]";
	}

	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public shop_id getShop() {
		return Shop;
	}
	public void setShop(shop_id shop) {
		Shop = shop;
	}
	
	
	
}
