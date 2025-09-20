package Syllabus;

class Out{
	int num= 10;
	public void show() {
		System.out.println("in show");
	}
	class In{
		public void display() {
			System.out.println("in display");
		}
	}
}

class InnerClass{
	public static void main(String[] args) {
		Out obj= new Out();
		obj.show();
		Out.In obj1= obj.new In();
		obj1.display();
	}
}

//only inner class can be static class 
//then Out.In obj1= obj.new In(); is Out.In obj1= new Out.In();