package javaHypersage;

public class Min {
	public static void main(String[] args) {
		int a= 80,b=40,c=30,d=50;
		int min=(a<b)? a :b;
		int min2=(min<c)?min:c;
		int res=(min2<d)?min2:d;
		System.out.println("The minimum vaalue is"+ " "+res);
	}

}
