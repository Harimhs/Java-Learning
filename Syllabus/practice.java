package Syllabus;

class ver{
	public int add(int n1, int n2) {
		return n1+n2;
	}
}

class call extends ver{
	public int sub(int n1, int n2) {
		return n1-n2;
	}
}

public class practice{
	public static void main(String[] args) {
		ver p= new call();
		int n= p.add(2, 4);
		System.out.println(n);
	}
}