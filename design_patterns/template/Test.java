package template;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        OrderProcessor processor1 = new CreditCardOrderProcessor();
        processor1.processOrder();
        System.out.println("-----------------------------------------------");
        OrderProcessor processor2 = new UpiOrderProcessor();
        processor2.processOrder();
        System.out.println("-----------------------------------------------");
    }
}
