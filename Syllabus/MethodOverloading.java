package Syllabus;

class cal{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	public double add(double n1, int n2) { //since adding double gives 0.0 so return double
		return n1+n2;
	}
}
class MethodOverloading{
	public static void main(String[] args) {
		cal obj= new cal();
		int val= obj.add(2, 5);
		System.out.println(val);
		
		int num= obj.add(2, 3, 5);
		System.out.println(num);
		
		double db= obj.add(10.00, num);
		System.out.println(db);	
	}
	
}