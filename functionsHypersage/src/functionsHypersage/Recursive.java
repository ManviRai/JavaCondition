package functionsHypersage;

import java.util.Scanner;

public class Recursive {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("The factorial of "+n+" is "+fact(n));	
}
   public static int fact(int n) {
	   if(n==0) {
		   return 1;
	   }
	   else {
		   return n * fact(n-1);
	   }
   }
}
