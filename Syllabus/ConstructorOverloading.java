package Syllabus;

public class ConstructorOverloading{
	
	String name;
	int age;
	
	public ConstructorOverloading(){
		System.out.print("Default constructor!");
	}
	public ConstructorOverloading(String name, int age){
		this.age= age;
		this.name= name;
	}
	public ConstructorOverloading(ConstructorOverloading obj1){
		this.name= obj1.name;
		this.age= obj1.age;
	}
	public static void main(String[] args) {
		ConstructorOverloading obj= new ConstructorOverloading();
		ConstructorOverloading obj1= new ConstructorOverloading("abc", 10);
		ConstructorOverloading obj2= new ConstructorOverloading(obj1);
	}
}