package observer;

import observer.observer.EmailAlertObserveImpl;
import observer.observer.NotificationAlertObserver;
import observer.observable.IphoneStocksObservableImpl;
import observer.observable.StocksObservable;
import observer.observer.PhoneAlertObserverImpl;

public class Test {
    public static void main(String[] args) {
        StocksObservable observable = new IphoneStocksObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserveImpl("vinodkalwani@gmail.com",observable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserveImpl("karankalwani@gmail.com",observable);
        NotificationAlertObserver notificationAlertObserver3 = new EmailAlertObserveImpl("rahulkalwani@gmail.com",observable);
        NotificationAlertObserver notificationAlertObserver4 = new PhoneAlertObserverImpl(observable,"9304520433");

        observable.add(notificationAlertObserver1);
        observable.add(notificationAlertObserver2);
        observable.add(notificationAlertObserver3);
        observable.add(notificationAlertObserver4);

        observable.setStocksCount(5);
    }
}
