package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_iterator {

	public static void main(String[] args) {
		
		arraylistconcept();

	}
	
	public static void arraylistconcept() {
		
		student student1 = new student("Tajamul", 37,"Science");
		student student2 = new student("Syed Tajamul", 37,"Math");
		student student3 = new student("Hussain", 37,"Biology");
		
		ArrayList<student> ar = new ArrayList<student>();
		
		ar.add(student1);
		ar.add(student2);
		ar.add(student3);
		
		Iterator<student>it=ar.iterator();
		while (it.hasNext()) {
			student st = it.next();
				System.out.println(st.Name);
				System.out.println(st.age);
				System.out.println(st.Department);
			}		
		}
	}