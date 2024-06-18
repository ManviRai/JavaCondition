package functionsHypersage;

public class Sequence {
	public static void main(String[] args) {
		Calculation seq = new Calculation();
		int res1= seq.add(2, 3);
		int res2=seq.sub(res1, 3);
		int res=seq.mul(res2, 2);
		System.out.println("Result = "+res);
	}
}
 class Calculation{
   public int add(int a, int b) {
	   return a+b;
   }
   public int sub(int a, int b) {
	   return a-b;
   }
   public int mul(int a, int b) {
	   return a*b;
   }
 }
   

