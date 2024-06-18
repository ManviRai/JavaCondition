package functionsHypersage;

import java.util.Scanner;

public class WoRetWithPar {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b = sc.nextInt();
	  WoRetWithPar func=new WoRetWithPar();
	  func.add(a,b);
}
  
  
  public void add(int x,int y) {
	  int sum= x+y;
	  System.out.println("Result = "+sum);
  }
}
