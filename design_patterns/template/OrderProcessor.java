package template;

abstract class OrderProcessor {

    public final void processOrder(){
        selectItems();
        makePayment();
        generateInvoice();
        shipItems();
    }

    protected void shipItems() {
    }

    protected void generateInvoice() {
        System.out.println("Invoice is generated.....");
    }

    protected void makePayment() {
    }

    protected void selectItems() {
        System.out.println("Selection Items .....");
    }
}
