package Syllabus;

class MyTask extends Thread{
	
	String task;
	
	MyTask(String task){
		this.task= task;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Task: "+task+ " "+ i);
		}
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

public class ConcurrenyThread{
	public static void main(String[] arg) {
		MyTask obj= new MyTask("Studying");
		MyTask obj1= new MyTask("Taking notes");
		MyTask obj2= new MyTask("Coding");
		
		obj.start();
		obj1.start();
		obj2.start();
	}
}