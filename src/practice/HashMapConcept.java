package practice;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapConcept {

	int RollNumber;
	String Name, Class;

	public HashMapConcept(int RollNumber, String Name, String Class) {
		this.RollNumber = RollNumber;
		this.Name = Name;
		this.Class = Class;
	}

	public static void HashMaptwo() {
		HashMapConcept Student1 = new HashMapConcept(10, "Tajamul", "1st");
		HashMapConcept Student2 = new HashMapConcept(11, "Zahid", "2nd");
		HashMapConcept Student3 = new HashMapConcept(12, "Zamin", "3rd");
		HashMap<String, HashMapConcept> hm1 = new HashMap<String, HashMapConcept>();
		
		hm1.put("First", Student1);
		hm1.put("Second", Student2);
		hm1.put("Third", Student3);
		
	for(Entry<String, HashMapConcept> entry:hm1.entrySet()) {
		String key=entry.getKey();  
		HashMapConcept b=entry.getValue();  
    System.out.println(key+" Details:");  
    System.out.println(b.RollNumber+" "+b.Name+" "+b.Class);   
}    

	}

	public static void main(String[] args) {
		//HashMapOne();
		HashMaptwo();
	}

	public static void HashMapOne() {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Tajamul", 35);
		hm.put("Zahid", 30);
		hm.put("Zamin", 25);

		System.out.println(hm);

		for (Entry am : hm.entrySet()) {
			System.out.println(am.getKey() + " " + am.getValue());
		}

	}
}