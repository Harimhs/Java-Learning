package Syllabus;

class Demo{
	
	public void show() {
		System.out.println("This is Show method!");
	}
	
	public double price(double mrp) {
		return mrp;
	}
}

class Methods{
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.show();

		double obj2= obj.price(10.00);//referencing with same object
		System.out.println(obj2);
	}
}