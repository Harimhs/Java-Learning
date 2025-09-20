package Collections;

public class DynamicStack extends StaticStack{
	
	DynamicStack(){
		super();
	}
	
	DynamicStack(int size){
		super(size);
	}
	 
	public boolean push(int item) {
		if(this.isFull()) {
			int[] temp= new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]= data[i];
			}
			data= temp;
		}
		return super.push(item);
	}

	public static void main(String[] args) throws Exception {
		StaticStack stack= new DynamicStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(10);
		
		System.out.println("Peek function: "+stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
