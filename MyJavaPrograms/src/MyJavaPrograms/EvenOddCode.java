package MyJavaPrograms;

import java.util.Scanner;

public class EvenOddCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int num = 5;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("The entered number is even.");
		else 
			System.out.println("The entered number is odd.");

	}

}
