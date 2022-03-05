package moduel1;

import java.util.Scanner;

public class B16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
	    System.out.println("Enter value of A:");
		int a =Sc.nextInt();
		
		 System.out.println("Enter value of B:");
			int b =Sc.nextInt();
			
			 System.out.println("Enter value of C:");
				int c =Sc.nextInt();
		
		
		if (a>b && a>c) {
			
			System.out.println("A is Greater");
			}
		else if (b>a && b>c) {
			System.out.println("B is Greater");
			
			
			
		}
		
		else {
			
			System.out.println("C is greater");
			
			
		}
	}
}

