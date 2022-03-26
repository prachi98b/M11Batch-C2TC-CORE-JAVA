package MyJavaPrograms;
import java.util.Scanner;

public class SwitchCaseCalculatorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple calculator:");
	    System.out.println("Enter 1st number:");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter 2nd number:");
	    int b = sc.nextInt();	    
		
	    char operation;
	    System.out.println("Choose an operation to be performed: +, -, *, or /");
	    operation = sc.next().charAt(0);
	    
	    
	    switch (operation) {
	    case '+':
	    	res = a + b;
	    	System.out.println(a+ "+"+ b +"= " +res);
	    	break;
	    	
	    case '-':
	    	res = a - b;
	    	System.out.println(a+ "-"+ b +"= " +res);
	    	break;
	    	
	    case '*':
	    	res = a * b;
	    	System.out.println(a+ "*"+ b +"= " +res);
	    	break;
	    	
	    case '/':
	    	res = a / b;
	    	System.out.println(a+ "/"+ b +"= " +res);
	    	break;
	    	
	    }
	    sc.close();
	}
}
