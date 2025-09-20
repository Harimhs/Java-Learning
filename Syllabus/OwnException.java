package Syllabus;

class OwnExceptionsBro extends Exception{
	public OwnExceptionsBro(String message) {
		super(message);
	}
}

class OwnException{
	public static void main(String[] arg) {
		int i=20;
		int j=0;
		try {
			j= 19/i;
			if(j==0)
				throw new OwnExceptionsBro("This is my exception!");
		}
		catch(OwnExceptionsBro e) {
			System.out.println("Something went wrong!\n"+ e);
		}
		catch(Exception e) {
			System.out.println("Can't divide by zero!");
		}
		System.out.println("Execution complete");
	}
}