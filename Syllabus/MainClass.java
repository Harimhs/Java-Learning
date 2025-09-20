package Syllabus;

public interface MainClass {
	
//	MainClass(MainClass obj){
//		
//	}
	
	String lap();
	String desk();
	int age= 2;
	
	public static void adds() {
		System.out.println(age);
	}
	
	default int show() {
		return 0;
	}
}
