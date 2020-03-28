package part_12_ExceptionHandling;

public class ExceptionHandling_throwsKeyword {

	public static void main(String[] args) {
		ExceptionHandling_throwsKeyword obj = new ExceptionHandling_throwsKeyword();
		obj.sum();
System.out.println("ABC");
	}
  public void sum () {
	  try{
		  div();
	  } catch (ArithmeticException e) {  // object -->throwable --> error and exception
		  e.printStackTrace();
		  e.getMessage();
	  }
  }
  
  public void div() throws ArithmeticException {
		  int i= 9/0;  // excepiton line 
  }
}

//throws stops the program on the line of exception. to handle that we can put try catch to run programe.
