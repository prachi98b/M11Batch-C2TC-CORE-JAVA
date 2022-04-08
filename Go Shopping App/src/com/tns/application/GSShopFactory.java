package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float Charges, boolean isPrime) {
		
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, Charges, isPrime);
		System.out.println(gsprime.toString());
		return gsprime;
		// return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) {
		
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, charges);
		System.out.println(gsnormal.toString());
		return gsnormal;
		// return null;
	}
	
	

}
