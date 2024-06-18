package javaHypersage;

public class Max {
  public static void main(String[] args) {
	int a=80,b=40,c=30,d=50;
	int max1=(a>b)?a:b;
	int max2=(max1>c)?max1:c;
	int res=(max2>d)?max2:d;
	System.out.println("The maximum number is"+" "+res);
}
}
