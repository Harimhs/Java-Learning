package Syllabus;

class Cal{
	
	int val= 19;
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public int sum(int n1, int n2) {
		return n1-n2;
	}
}

class Advcal extends Cal{ //Advcal can perform Cal's methods too	
	public int mul(int n1, int n2) {
		return val*n2;
	}
	
	public int div(int n1, int n2) {
		return val/n2;
	}
}

public class SingleInheritance{
	public static void main(String[] args) {
		Advcal obj= new Advcal();
		
		int r1= obj.add(2, 3);
		int r2= obj.div(10, r1);
		System.out.println(r1+ " "+ r2);
	}
}