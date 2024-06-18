package functionsHypersage;

import java.util.Scanner;

public class WoRetWoPar {

	public static void main(String[] args) {
		WoRetWoPar func=new WoRetWoPar();
		func.add();

	}
	
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int sum=a+b;
		System.out.println("Result = "+sum);
	}

}
