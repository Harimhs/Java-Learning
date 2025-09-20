package Syllabus;

public interface Desktop {
	public static final int age=2;
	public abstract void usingDesk();
}

interface Laptop extends Desktop{
	void usingLap();
}

class Work implements Desktop, Laptop{
	
	@Override
	public void usingDesk() {
		System.out.println("Langa working in desktop!!");
	}

	@Override
	public void usingLap() {
		System.out.println("Langa working in laptop!!");
	}
	
	public static void main(String args[]) {
		Laptop lap= new Work();
		Desktop desk= new Work();
		lap.usingLap();
	}

	
}
