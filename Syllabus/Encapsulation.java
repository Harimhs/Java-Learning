package Syllabus;

class encap{
	private int age;
	private String name;
	
	public void setter(String name1, int age1){
		name= name1;
		age= age1;
	}
	
	public int getterAge(){
		return age;
	}
	
	public String getterName(){
		return name;
	}
}

public class Encapsulation{
	public static void main(String[] args){
		encap obj= new encap();
		obj.setter("abc", 10);
		System.out.print(obj.getterAge());;
		obj.getterName();
	}
}