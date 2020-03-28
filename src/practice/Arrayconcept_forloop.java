package practice;

import java.util.ArrayList;

public class Arrayconcept_forloop {

	public static void main(String[] args) {

		Arrayconceptmethod();

	}

	public static void Arrayconceptmethod() {

		ArrayList ar = new ArrayList();

		ar.add("tajamul");
		ar.add(123);
		ar.add(12.5);

		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
	
	

}
