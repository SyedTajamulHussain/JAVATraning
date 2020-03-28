package part_12_ExceptionHandling;

public class ExceptionHandling_try_catch {

	public static void main(String[] args) {
	// un caught exception
	//	int i = 9/0;		
	//	System.out.println(i);  // it will give you error after running the program

		// Caught exception
		 //Thread.sleep(2000);  // it will immediately give error and suggestion.
		
		//exception handling 
		//1st :  try catch block.
		
		try{
			int i = 10/0;  // this code wil throw the error
		}
		catch(ArithmeticException  e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("ABC"); //  this code is still running even when exception is observed
		
	}

}
