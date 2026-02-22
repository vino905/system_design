package structural.adapter;

public class RazorPayAdapter implements PaymentGateway {

    private RazorpayAPI razorpayAPI;

    public RazorPayAdapter() {
        this.razorpayAPI = new RazorpayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        razorpayAPI.makePayment(orderId, amount);
    }
}
