package MyJavaPrograms;

import java.util.Scanner;

public class LeapYearCheckingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter an Year to check it is a leap year or not: ");
	    year = sc.nextInt();

	    //logical AND "&&" operator & logical OR "||" operator..
	    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 
	      System.out.println(year + " is a leap year");
	    else
	      System.out.println(year +" is not a leap year");

	}

}
