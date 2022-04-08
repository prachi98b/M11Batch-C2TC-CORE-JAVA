package com.tns.framework;

public abstract class ShopAcc {
	
	private int accNo;

	public int getAccNo() {
		return accNo;
	}
	
	private String accNm;

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	private float charges;

	public float getCharges() {
		return charges;
	}

	public ShopAcc(int accNo, String accNm, float charges) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public void bookProduct(float a)
	{
		
	}
		
	public void items (float y) {
		System.out.println("Computer: 45,000/-\n");
		System.out.println("Mobile: 24,000/-\n");
		System.out.println("iPad: 76,000/-\n");
		
	}

	public String toString() {
		return accNm;
	}
	
}
