package structural.adapter;

public class Test {
    public static void main(String[] args) {
        CheckoutService razorPay = new CheckoutService(new RazorPayAdapter());
        razorPay.checkout("12", 17890);

        CheckoutService payU = new CheckoutService(new PayUGateway());
        payU.checkout("13", 345343);
    }
}
