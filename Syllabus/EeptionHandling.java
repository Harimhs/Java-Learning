package Syllabus;

class PowerPreamException extends Exception{
	public void PreamPot(String message) {
		
	}
	public PowerPreamException(String message) {
		super(message);
	}
}

class EeptionHandling{
	public static void main(String args[]) {
		int num= 0;
		int val= 5;
		int[] arr= new int[3];
		
		try{
			if(num==0) {
				throw new PowerPreamException("Pream is a SuperStar!");
			}
			int res= val/num;
		}
		catch(PowerPreamException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("The val can't "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("This is an error!" + e.getMessage());
		}
		finally {
			System.out.println("Final Block");
		}
		System.out.println("Below Block");
		
	}
	
}