package functionsHypersage;

import java.util.Scanner;

public class WithRetWoPar {
	int a;
	int b;
  public static void main(String[] args) {
		WithRetWoPar func=new WithRetWoPar();
		int res=func.add();
	 System.out.println("Result is " +res);
}
  public int add() {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b = sc.nextInt();
	    int	sum=a+b;
	    return sum;
  }
}
