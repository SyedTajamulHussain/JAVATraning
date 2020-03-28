package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class XYZ {

	public static void main(String[] args) {
		iteratorconcept();
		

	}
	
	public static void iteratorconcept() {
		
		Abc Student1 = new Abc("Tajamul",37,"Male");
		Abc Student2 = new Abc("Zahid",34,"Male");
		Abc Student3 = new Abc("Haadiya",1,"Female");
		
		
		ArrayList<Abc> AL = new ArrayList<Abc>();
		
		AL.add(Student1);
		AL.add(Student2);
		AL.add(Student3);
		
		
		Iterator<Abc>bo=AL.iterator();
		while (bo.hasNext()) {
			Abc pt=bo.next();
			System.out.println(pt.Name);
			System.out.println(pt.Age);
			System.out.println(pt.Gender);
		}
	
		
	}

}
