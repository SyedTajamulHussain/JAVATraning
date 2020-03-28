package part_10_AbstractionConcept;

// to make any class abstract use abstract keyword
// atleast one method should be there which is abstract method
//abstract class is partial abstraction
public abstract class Bank {
	
	public abstract void loan(); {  //abstract method.. no body and abstract keyword
		
	}
	
	public void credit(){
		System.out.println("Credit method");
	}
	
	public void debt() {
		System.out.println("dept method");
	}
	
	

}
