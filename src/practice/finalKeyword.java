package practice;

public class finalKeyword {
    final static int p1 = 1;

    public static void main(String args[]) {

        finalkeywordd();
        int re =returnExtample();
        System.out.println(re);
        int addtionA =returnwithArgs(10 , 10);
        int addtionb =returnwithArgs(10 , 20);
        System.out.println(addtionA);
        System.out.println(addtionb);

    }
    public static void finalkeywordd() {
        //p1 = 14;  // can not assign value to final variable.
        System.out.println(p1);
    }

    public static int returnExtample(){
        int x= 8;
        int y =8;
        int z = x+y;
        return z;

    }

    public static int returnwithArgs(int b,int c){
        int a = b+c;
        return a;

    }
}
