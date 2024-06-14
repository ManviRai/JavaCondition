package controlStatementsHypersage;

import java.util.Scanner;

public class DowhileAdd {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int num=sc.nextInt();
	   int sum=0;
	do {
		
         sum+=num%10;
         num=num/10;
	
	}
	while(num>0);
	System.out.println("sum of the digit is " +sum);

}
}
