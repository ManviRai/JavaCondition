package conditionalCodeHypersage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Calculator ca=new Calculator();
		ca.Calci();
	   
	}
	  public void Calci() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter two numbers ");
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		  System.out.println("Choose the option \n 1.+ \n 2.- \n 3.* \n 4./");
		 int ch=sc.nextInt();
		  switch(ch) {
		  case 1: System.out.println("Addition "+(a+b)); 
		          break;
		  case 2: System.out.println("Subtraction "+(a-b)); 
		          break;
		  case 3: System.out.println("Multiplication "+(a+b)); 
                  break;
          case 4: System.out.println("Division "+(a+b)); 
                  break;  
          default : System.out.println("Invalid method");
                  break;
		  }
	  }
}
	


