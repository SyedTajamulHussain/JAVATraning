package practice;

public class child_two extends child_one_Class {
	int markss = 59;
	
	
	public static void main(String[] args) {
	
		
		child_two obj3 = new child_two();
		
		obj3.personalmethod();
		obj3.sum();
		obj3.concatation();
		obj3.forloopconcept();
		obj3.whileloopconcept();
		obj3.for_loop_decrement();
		obj3.personalmethod();
		obj3.ifelseconcept();
		obj3.elseifconcept();
		
	}
	
	public void ifelseconcept() {
			
	if(markss >= 49) {
		System.out.println("pass");
	} else {
		System.out.println("fail");
	}
	
	}
	
	public void elseifconcept() {
		
		if(markss <= 50 ) {
			System.out.println("C grade");
		
		}
		else if (markss > 50 && markss <60) {
			System.out.println("B grade");
		}
	}

}
