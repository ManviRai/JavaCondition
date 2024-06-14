package conditionalCodeHypersage;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%3==0) {
			System.out.println("Number is multiple of 3");
		}
		else {
			System.out.println("Number is not multiple of 3");
		}


	}

}
