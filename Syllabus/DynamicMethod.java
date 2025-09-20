package Syllabus;

class one{
	public void show(){
		System.out.println("in one show!");
	}
}

class two extends one{
	public void show(){
		System.out.println("in two show!");
	}
}

class DynamicMethod{
	public static void main(String[] args) {
		one obj= new one();
		obj.show();
		
		obj= new two();
		obj.show();
	}
}