package functionsHypersage;

public class Chain {
    public static void main(String[] args) {
	 Student stu=new Student().studName().studUsn();
	 
	 
	}
}

class Student{
	 public Student studName() {
	      System.out.println("Student name is Raksha");
	      return new Student();
	     
	 }
	 
	 public Student studUsn() {
		 System.out.println("student usn is 4gh20cs024");
		 return new Student();
	 }
}
