package conditionalCodeHypersage;

import java.util.Scanner;

public class IfNumber {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num>=10) {
		System.out.println("Number is greater than or equal to 10");
	}
}
}
