package Syllabus;

class FClass{
	public void show() {
		System.out.print("F class show");
	}
}

class SClass extends FClass{
	public void show() {
		System.out.print("S class show");
	}
}

class MethodOveride{
	public static void main(String[] args) {
		FClass obj= new SClass();
		obj.show();
	}
}