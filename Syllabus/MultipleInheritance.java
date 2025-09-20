package Syllabus;

class A{
	public String show(String name) {
		return name;
	}
}

class B extends A{
	
}

class C extends B{
	
}

public class MultipleInheritance{
	public static void main(String[] args) {
		C obj= new C();
		String str= obj.show("name method");
		System.out.print(str);
	}
}