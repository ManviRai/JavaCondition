package javaHypersage;

import java.util.Scanner;

public class Relation {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
   	System.out.println("enter the value of a and b");
   	int a =sc.nextInt();
   	int b =sc.nextInt();
   	if(a>b) {
   		System.out.println(a+"is greater than"+b);
   	}
   	else if(b>a) {
   		System.out.println(b+"is greater than"+a);
   	}
   	else {
   		System.out.println("both are equal");
   	}
}
   
}
