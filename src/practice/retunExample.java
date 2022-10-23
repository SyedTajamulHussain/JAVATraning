package practice;

public class retunExample {
    public static int retuntWithoutArgs(){
        int x=1;
        int y=2;
        int z =x+y;
        return z;
    }

    public static int returnWithArgs(int b, int c){
        int a = b+c;
        return a;
    }
    public static void main (String args []){
        int addtion =retuntWithoutArgs();
        System.out.println(addtion);
        int addtionwithArgs =returnWithArgs(10,20);
        int addtionwithArgs1 =returnWithArgs(20,20);
        System.out.println(addtionwithArgs);
        System.out.println(addtionwithArgs1);

    }
}
