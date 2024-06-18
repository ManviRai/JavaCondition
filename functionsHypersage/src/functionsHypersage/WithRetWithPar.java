package functionsHypersage;

import java.util.Scanner;

public class WithRetWithPar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b = sc.nextInt();
		WithRetWithPar func=new WithRetWithPar();
		int res=func.add(a, b);
		System.out.println("result = "+res);

	}


public int add(int a,int b) {
	return a+b;
}
}