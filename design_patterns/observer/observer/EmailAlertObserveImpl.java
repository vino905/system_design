package observer.observer;

import observer.observable.StocksObservable;

public class EmailAlertObserveImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable stocksObservable;


    public EmailAlertObserveImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void upadate() {
        sendMail(emailId, " Product is in stock hurry up!");
    }

    private void sendMail(String emailId, String message) {

        System.out.println(String.format("Hi : %s , %s /n Thank you |", emailId, message));
    }
}
