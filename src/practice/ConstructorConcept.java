package practice;

public class ConstructorConcept  {
    String Cartype;
    double CarPrice;
    String color;

 //constructor 1
    public ConstructorConcept(String Car,double Price){
        Cartype=Car;
        CarPrice=Price;
        System.out.println("this is constructor 1 code");
    }
    //constructor 2
    public ConstructorConcept(String Car,double Price,String colorofthecar){
        Cartype=Car;
        CarPrice=Price;
        color=colorofthecar;

        System.out.println("this is constructor 2 code");
    }

    public static void main(String args[]){
        System.out.println("this is main method");
        ConstrterComcept();

    }

    public static  void ConstrterComcept(){
        ConstructorConcept cc = new ConstructorConcept("Maruti ",1000);
        ConstructorConcept cc1 = new ConstructorConcept("Ford ",2000);
        ConstructorConcept cc2 = new ConstructorConcept("Ford ",2000,"RED");


        System.out.println("Car model is " + cc.Cartype + "Car Price is " +  cc.CarPrice);
        System.out.println("Car model is " + cc1.Cartype + "Car Price is " + cc1.CarPrice);
        System.out.println(" Car model is " + cc2.Cartype + "Car Price is " + cc2.CarPrice + " car color: " + cc2.color);

    }
}
