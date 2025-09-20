package Syllabus;

class First{
	public First(){
		System.out.println("This is First class!");
	}
	public First(int n) {
		System.out.println("Int Class First: "+ n);
	}
}

class Second extends First{
	public Second(){
		super(3);
		System.out.println("This is Second class!");
	}
	public Second(int n) {
		super(n);
		System.out.println("Int Class Second: "+ n);
	}
}

public class SuperKey{
	public static void main(String[] args) {
		Second obj= new Second();
	}
}