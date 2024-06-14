package controlStatementsHypersage;

import java.util.Scanner;

public class While {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the deposit amount");
	int num=sc.nextInt();
	while(num>=0) {
		System.out.println(num);
		num-=2000;
	}
	
	System.out.println("Amount is insufficient");
}
}
