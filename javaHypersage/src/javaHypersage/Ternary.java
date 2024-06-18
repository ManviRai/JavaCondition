package javaHypersage;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("enter the value of a and b");
   	int a =sc.nextInt();
   	int b =sc.nextInt();
   	
   	int res= (a>b)? (a+b):(b-a);
   	System.out.println("result=" +res);
   	
   	
}
}
