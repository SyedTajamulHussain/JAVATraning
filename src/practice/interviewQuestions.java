package practice;

public class interviewQuestions {
	public static String statement = "Kashmir is Great State";

	public static void main(String[] args) {
		reverseTheString();
		printCharBasedOnIndex();
		checkHowManyTimesDoesAcharcterExistInString();
	}
	public static void reverseTheString(){
		StringBuffer st =new StringBuffer(statement);
		System.out.println(st.reverse());
	}

	public static void printCharBasedOnIndex(){
		System.out.println(statement.charAt(1));  //charAt is used to fetch single char based on index
		System.out.println(statement.substring(0,4));  //substring method is used to fetch range in string.
	}

	public static void checkHowManyTimesDoesAcharcterExistInString(){
		int count = 0;
		for(int i=0;i <=statement.length() -1;i++) {
			if (statement.charAt(i) == 'a') {
				count++;
			}
		}
			System.out.println(statement + " have " + count + " times the character 'a'");

	}


}
