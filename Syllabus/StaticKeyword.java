package Syllabus;

class Novels{
	String name;
	int chapters;
	static String type;
	
	public void show() {
		System.out.println(name+ " : " +chapters+" , "+ type);
	}
	
	public static void show1(Novels n1) {
		System.out.println(n1.name+ " : " +n1.chapters+" , "+ type);
	}
}

public class StaticKeyword{
	public static void main(String[] args) {
		Novels n1= new Novels();
		n1.name= "ORV";
		n1.chapters= 250;
		n1.type= "Manhwa";
		
		Novels n2= new Novels();
		n2.name= "LOTM";
		n2.chapters= 100;
		n2.type= "Manhua";
		
		Novels.type= "Novel"; //will affect the n1.types and n2.types
		
		n1.show();
		n2.show();
		
		Novels.show1(n1);
	}
}