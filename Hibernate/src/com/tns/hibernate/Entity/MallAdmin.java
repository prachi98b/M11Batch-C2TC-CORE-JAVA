package com.tns.hibernate.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name="malladmin")
public class MallAdmin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private String password;
	private String phone;
	
	private mall Mall;
	
	@OneToOne
	@JoinColumn(name="id")
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public mall getMall() {
		return Mall;
	}
	public void setMall(mall mall) {
		Mall = mall;
	}
	
	public MallAdmin(int id, String name, String password, String phone, mall mall) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		Mall = mall;
	}
	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", Mall="
				+ Mall + "]";
	}
	
	
	
}
