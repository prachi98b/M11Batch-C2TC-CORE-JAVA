package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	
	public NormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}

	private final float deliverycharges=150;

	public float getDeliverycharges() {
		return deliverycharges;
	}
	
	@Override
	public void bookProduct(float f1) {
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + ", toString()=" + super.toString() + "]";
	}
	
	

}
