package Syllabus;

interface Computer{
	void code();
}

interface ModelYear{
	void year();
}

class laptop implements Computer, ModelYear{
	public void code() {
		System.out.println("Running in laptop");
	}
	public void year() {
		System.out.println("2020 Model");
	}
}

class desktop implements Computer, ModelYear{
	public void code() {
		System.out.println("Running in desktop");
	}
	public void year() {
		System.out.println("2022 Model");
	}
}

class develop{
	develop(Computer obj, ModelYear obj1){
		obj.code();
		obj1.year();
	}
}

public class InterfaceClass{
	public static void main(String[] args) {
		Computer lap= new laptop();
		Computer desk= new desktop();
		ModelYear lap1= new laptop();
		ModelYear desk1= new desktop();
		develop obj= new develop(desk, desk1);
	}
}