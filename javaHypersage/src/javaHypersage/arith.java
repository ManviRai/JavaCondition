package javaHypersage;

public class arith {
    public static void main(String args[]) {
    	arith op=new arith();
    	op.operation(5,3);
    			
    }
    void operation(int a,int b) {
    	int sum=a+b;
    	int sub=a-b;
    	float div=a/b;
 
    	System.out.println("sum =" + sum);
    	System.out.println("sub =" + sub);
    	System.out.println("div =" + div);
    	System.out.println("mul =" + a*b);
    	System.out.println("mod =" + a%b );
    	
    	
    	
    	
   
}
}
