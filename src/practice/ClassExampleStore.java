package practice;

public class ClassExampleStore {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public ClassExampleStore(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        ClassExampleStore lemonadeStand = new ClassExampleStore("lemonade", 42, .99);
        ClassExampleStore cookieShop = new ClassExampleStore("cookies", 12, 3.75);
        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }

}
