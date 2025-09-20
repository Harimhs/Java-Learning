package Syllabus;

class Novel{
	public String name;
	public int chapters;
	Novel(String name, int chapters){
		this.name= name;
		this.chapters= chapters;
	}
}

public class ArrayObjects{
	public static void main(String[] args){
		Novel[] arr;
		arr= new Novel[3];
		arr[0]= new Novel("ORV", 250);
		arr[1]= new Novel("TBATE", 200);
		arr[2]= new Novel("LOTM", 100);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("The Novel "+arr[i].name+ " has "+arr[i].chapters+ " chapters.");
		}
	}
	
}