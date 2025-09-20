package Syllabus;

class TypeCasting{
	public static void main(String[] args) {
		byte b= 10;
		int i= b; //small to large conversion
		System.out.println("Casting byte to int: "+i);//10
		
		int in= 10;
//		byte by= in; not possible for large to small conversion
		byte by= (byte)in;
		System.out.println("Casting int to byte: "+by);//10
		
		int num= 10;
		float f= num; //small to large conversion
		System.out.println("Casting int to float: "+f);//10.0
		
		float fl= 10.00f;
//		int val= fl; not possible for large to small conversion
		int val= (int)fl;
		System.out.println("Casting float to int: "+val);//10
		
		String str = "123";
		int num1 = Integer.parseInt(str);
		System.out.println("Casting String to int: "+num1);
		
		int num2 = 101;
		String str1 = Integer.toString(num2);
		System.out.println("Casting int to String: "+str1); 
	} 	
}