package Collections;

public class StaticStack {
	protected int[] data;
	private static final int DEFAULT_INT= 10;
	int ptr= -1;
	
	StaticStack(){
		this(DEFAULT_INT);
	}
	
	StaticStack(int size){
		this.data= new int[size];
	}
	
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("The stack is already full!");
			 return false;
		}
		ptr++;
		data[ptr]= item;
		return true;
	}
	
	protected int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("The stack empty!");
		}
		return data[ptr--];
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Can't peek the stack is empty");
		}
		return data[ptr];
	}
	
	public boolean isFull() {
		return ptr == data.length-1;
	}
	
	public boolean isEmpty() {
		return ptr==-1;
	}
	
	public static void main(String[] args) throws Exception {
		StaticStack stack= new StaticStack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("Peek function: "+stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
	}
	
}
