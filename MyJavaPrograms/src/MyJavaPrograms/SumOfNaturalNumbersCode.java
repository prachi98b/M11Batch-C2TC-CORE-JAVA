package MyJavaPrograms;
import java.util.Scanner;

public class SumOfNaturalNumbersCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int upto, from, sum = 0;  
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Enter the natural numbers you want to add it from and upto.");  
		
		System.out.println("From: ");  
		from = sc.nextInt();  
		
		System.out.println("Up to: ");    
		upto = sc.nextInt();  

		while(from <= upto)  
		{  
		sum = sum + from;  
		  
		from++;  
		}  
		System.out.println("Sum of Natural Numbers = " + sum);  
		sc.close();
	}

}
