package conditionalCodeHypersage;

import java.util.Scanner;

public class NestedIfNum {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first number");
	    int num1=sc.nextInt();
	    System.out.println("Enter second number");
	    int num2=sc.nextInt();
	    if(num1>num2) {
	    	if(num1%2==0) {
	    		System.out.println("First number is greater than second number and is even");
	    	} 
	    	else {
	    		System.out.println("First number is greater than second and is odd");
	    	}
	    	
	    }
	    	else {
	    		System.out.println("First number is less than second");
	    	}
	    	
	    
	    
}
}
