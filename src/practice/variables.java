package practice;

public class variables {
    public static void main(String[] args) {
        integerVariable();
        doubleVariable();
        booleanVaariable();
        charVariable();
        stringVariable();
        dotequalConcept();
    }

    public static void integerVariable() {
        int age = 35;
        System.out.println("this is integer variable example " + age);
    }

    public static void doubleVariable() {
        double salary = 1200.500;
        System.out.println(salary);
    }

    public static void booleanVaariable() {
        boolean intsCanHoldDecimals = false;
        System.out.println(intsCanHoldDecimals);
    }

    public static void charVariable() {
        char grade = 'A';
        System.out.println(grade);
    }

    public static void stringVariable(){
        String greeting = "A String literal is any sequence of characters enclosed in double-quotes ";
        System.out.println(greeting);
        String Salutation= new String("I Have Used String class: yes");
        System.out.println(Salutation);
        String uppercase =Salutation.toUpperCase();
        System.out.println(uppercase);
        String lowercase =Salutation.toLowerCase();
        System.out.println(lowercase);
        String[] splitExample =Salutation.split(":");
        for (String a : splitExample)
            System.out.println("Splited text" + a);
        System.out.println("\"printing values in quotes\"");
        System.out.println("This is the backslash symbol: \\");
        System.out.println("Hello\nGoodbye");
    }

    public static void dotequalConcept(){
        String Song1 ="hum hogai kamhaab";
        String Song2 ="hum hogai kamhaab";
        String Song3 ="hum hogai kamhaabb";
        System.out.println(Song1.equals(Song2));
        System.out.println(Song2.equals(Song3));
    }
}
