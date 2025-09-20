package Syllabus;

public abstract class Abstraction {
	
	Abstraction(){
		
	}
	
	int age= 12;
	int sub= 12;
	
	abstract int add();
	abstract int div();
//	abstract static void number();
	
	public int diff() {
		return 11;
	}
	
	public static void mul() {
		System.out.println("static method");
	}
	
}