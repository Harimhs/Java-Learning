package Syllabus;

class TryCatch{
	public static void main(String[] arg) {
		int i=3;
		int j=0;
		int[] arr= new int[4];
		try {
			j= 19/j;
			System.out.println(arr[8]);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index value not exist");
		}
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}finally {
			System.out.println("complete");
		}
		System.out.println("Execution complete");
		
	}
}