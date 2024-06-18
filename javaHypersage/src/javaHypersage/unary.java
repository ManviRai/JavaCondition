package javaHypersage;

public class unary {
  public static void main(String[] args) {
	int a=3, b=5;
	System.out.println("value of a is"+" "+a);
	System.out.println("value of b is"+" "+b);
	int e=a++;
	
	
	System.out.println("post increment value of a="+a);
     int c=a--;
	System.out.println("post decrement value of a="+a);
	int f= ++b;
	System.out.println("pre increment value of b="+b);
	int d= --b;
	System.out.println("post decrement value of b="+b);
}
}
