package Syllabus;

abstract class Car{
	final int num;
	Car(int num){
		this.num= num;
		System.out.println(num);
	}
	
	abstract public void drive();
	
	public void service() {
		System.out.println("service time!");
	}
}

class Model extends Car{
	Model(){
		super(3);
	}
	public void drive() {
		System.out.println("Driving!");
	}
}

public class AbstractKeyword{
	public static void main(String[] args) {
		Car obj= new Model();
		obj.drive();
		obj.service();		
	}
}