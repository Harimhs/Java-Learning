package Collections;

public class CustomQueue {
	private int[] data;
	private final static int DEFAULT_VALUE= 10;
	int ptr= 0;
	
	CustomQueue(){
		this(DEFAULT_VALUE);
	}
	
	CustomQueue(int size){
		this.data= new int[size];
	}
	
	private boolean isFull() {
		return ptr==0;
	}
}
  