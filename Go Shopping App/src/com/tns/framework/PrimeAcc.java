package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	private boolean isPrime=true;
	
	public boolean isPrime() {
		return isPrime;
	}
	
	private static final float deliveryCharges=0;
	
	
	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
		this.isPrime=isPrime;
		
	}
	
	@Override
	public void bookProduct(float x) {
		System.out.println();
	}
	
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	

}
