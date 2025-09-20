package Syllabus;

class riding{
	
	public static int leg(int num) {
		return num;
	}
	
	
}


class Poly{
	
	public static String leg(String name, int meter) {
		return "The boy "+ name+ " ran "+ meter;
	}
	
	public static String leg(String name) {
		return "The boy "+ name+ " walk";
	}
	
	public static String leg(String name, int actual, int expected) {
		return "The boy "+ name+ " jump in a long jump event "+ actual+ " is his rate "
				+ "and"+ expected+ " is he aimed";
	}
	
	public static int leg(int num) {
		return num;
	}
	
	public static void main(String args[]) {
//		Poly obj= new ();
		String res= Poly.leg("langa", 2, 4);
		System.out.println(res);
		System.out.println(Poly.leg(2));
	}
	
}

