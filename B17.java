package moduel1;

import java.util.Scanner;

public class B17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc = new Scanner(System.in);
	    System.out.println("Enter value of Character:");
	    char ch = Sc.next().charAt(0);
	    
	    if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
	    	
	    	System.out.println("This is Vowel");
	    		
	    }
	    else if (ch>2) {
	    	
	    	System.out.println("Error Character");
	    	
	    }
		
	    else {
	    	System.out.println(" Consonanat");
	    	
	    }
		
		
		
		
		
		
		
	}

}
