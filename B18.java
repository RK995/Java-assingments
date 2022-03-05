package moduel1;

import java.util.Scanner;

public class B18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
	    System.out.println("Enter Year :");
		int a =Sc.nextInt();
		
		if(a%4==0){
			
			System.out.println("Leap Year");
			
		}
		else {
			
			System.out.println(" General Year");
			
			
		}
		
	}

}
