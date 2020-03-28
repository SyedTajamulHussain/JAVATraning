package practice;

public class parent_class {

	double z = 1.5;
	int x = 2;

	public static void main(String[] args) {

		//parent_class OBJ = new parent_class();  //Constructor is used to intialize newly created obj.  in this case default constructor is called automatically.
		
		
		
		/*OBJ.sum();
		OBJ.concatation();
		OBJ.forloopconcept();
		OBJ.whileloopconcept();
		OBJ.for_loop_decrement();
*/
	}

	public void sum() {
		int a = 10;
		int b = 20;
		System.out.println(z + x);
		System.out.println(a + b);

	}

	public void concatation() {

		String D = "Syed";
		String E = "Tajamul";
		System.out.println("concatation : " + (D + E));
		System.out.println(z * x);
	
	}

	public void forloopconcept() {

		for (int z = 1; z <= 5; z++)
			System.out.println(z);
	}

	public void whileloopconcept() {
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a = a + 1;
		}
	}

	public void for_loop_decrement() {
		for (int y = 1; y >= -10; y--)
			System.out.println(y);
	}
}
