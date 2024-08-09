package template;

public class UpiOrderProcessor extends OrderProcessor {
    @Override
    protected void makePayment() {
        System.out.println("Payment made using UPI.");
    }

    @Override
    protected void shipItems() {
        System.out.println("Items shipped via Standard Shipping.");
    }
}
