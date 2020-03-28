package part_12_ExceptionHandling;

public class ExceptionHandling_throwKeyword {

	public static void main(String[] args) {
		System.out.println("ABC");
		
		try {
			throw new Exception("Tajamul ........Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DEF");

	}

}

// throw is used to create your own exception..

