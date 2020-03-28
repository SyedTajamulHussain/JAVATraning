package Part_5_Collections;

import java.util.HashMap;
import java.util.Map.Entry;



public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("Zahra", 1);
		hm.put("Tajamul", 2);
		
		System.out.println(hm.get("Zahra"));
		
		
		for(Entry ab : hm.entrySet()){
			System.out.println(ab.getKey()+ " "+ab.getValue());
			
		}
		hm.remove("Tajamul");
		System.out.println(hm);
	}

}
