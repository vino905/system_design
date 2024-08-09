package template;

public class CreditCardOrderProcessor extends OrderProcessor {
    @Override
    protected void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }

    @Override
    protected void shipItems() {
        System.out.println("Items shipped via Standard Shipping.");
    }
}
