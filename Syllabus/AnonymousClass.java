package Syllabus;

class show{
	public void show() {
		System.out.println("In Show Class!");
	}
}

public class AnonymousClass{
	public static void main(String[] args) {
		show obj= new show() {
			public void show() {
				System.out.println("In New Class!");
			}
		};
		obj.show();
	}
}

//only works if only one method to override