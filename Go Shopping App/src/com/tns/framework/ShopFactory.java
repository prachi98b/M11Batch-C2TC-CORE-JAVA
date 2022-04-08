package com.tns.framework;

public abstract class ShopFactory {
	
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float Charges, boolean isPrime);
	
	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float Charges, boolean isPrime);
	
}
