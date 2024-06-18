package javaHypersage;
import java.util.*;

public class Assign {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the value of a and b");
    	int a =sc.nextInt();
    	int b =sc.nextInt();
    	Assign assi=new Assign();
    	assi.assign(a, b);
		
	}
    public void assign(int a,int b) {
    	int c=5;
    	a=c;
    	a+=b;
    	a-=b;
    	c/=b;
    	b*=a;
    	System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c);
    }
}
