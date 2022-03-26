package MyJavaPrograms;
import java.util.Scanner;

public class ArmstrongNumberCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for checking is it armstrong or not! :");
		
		num = sc.nextInt();
					  
		if(isArmstrong(num))  
		{
		System.out.print("Armstrong. "); 
		}
		else {
			System.out.print("Not an Armstrong. "); 
		}
		sc.close();
	}

	static boolean isArmstrong(int n) {
	int ab, digit=0, z=0, sum=0;
	ab=n;
	while(ab>0)
	{
		ab = ab/10;
		digit++;
	}
	
	ab = n;
	while(ab>0) {
		z = ab % 10;
		sum += (Math.pow(z,digit));
		ab = ab/10;
	}
	
	if(n==sum) {
		return true;
	}
	else 
		return false;
	}	
}
