package observer.observer;

import observer.observable.StocksObservable;

public class PhoneAlertObserverImpl implements NotificationAlertObserver {

    String phoneNo;
    StocksObservable stocksObservable;

    public PhoneAlertObserverImpl(StocksObservable stocksObservable, String phoneNo) {
        this.stocksObservable = stocksObservable;
        this.phoneNo = phoneNo;
    }

    @Override
    public void upadate() {
        sendAlertOnPhone(phoneNo);
    }

    private void sendAlertOnPhone(String phoneNo) {
        System.out.println(String.format("Product is in Stock hurry Up !  %s  ", phoneNo));
    }
}
