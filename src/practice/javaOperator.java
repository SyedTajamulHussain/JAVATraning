package practice;

public class javaOperator {

    public static void main (String args[]){
        unary();
        compondAssignmentOperator();
        orderOfOperation();

    }


    public static void unary(){
        int x=10;
        System.out.println(+x); // Unary Plus .It is used to represent positive values. Usually, we do not write the operator before the operand. Hence, it is optional.
        System.out.println(-x); // Unary Minus. It is used to convert a positive value into a negative one.
        System.out.println(++x); //Increment Operator .it is used to increment the value of an operand by one.
        System.out.println(--x);
        //System.out.println(!x);

    }

    public void arithmetic(){

    }

    public void shift(){

    }

    public void relational(){

    }

    public void bitwise(){

    }

    public void logical(){

    }
    public void ternary(){

    }

    public void assignment(){

    }

    public static void compondAssignmentOperator(){
        int numOfCookiesBaked =17;
        numOfCookiesBaked +=3;
        System.out.println(numOfCookiesBaked);
        numOfCookiesBaked -=3;
        System.out.println(numOfCookiesBaked);
        numOfCookiesBaked /=2;
        System.out.println(numOfCookiesBaked);

    }

    public static void orderOfOperation(){
//        The order is as follows:
//        Parentheses
//        Exponents
//        Modulo/Multiplication/Division
//        Addition/Subtraction
        int orderOfOperations = 5 * (10 - 4) + 4/2;
        System.out.println(orderOfOperations);
    }
}
