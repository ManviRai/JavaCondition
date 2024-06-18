package javaHypersage;
import java.util.*;

public class logical {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the internal mark of student");
	 int n=sc.nextInt();
	 System.out.println("Enter the external mark of student");
	 int m=sc.nextInt();
	 if(((m>=50)&&(m<=60)) &&(( n>=30)&&(n<=40))){
		System.out.println("Student has secured distinction"); 
	 }
	 else if (((m>=40)&&( m<=49))||((n>35)&&(n<=40)) ){
		 System.out.println("student passed the test");
	 }
	 else if((m<=35)&&(n<=29)){
		 System.out.println("Student failed");
	 }
	 else {
		 System.out.println("Invalid");
	 }
}
}
