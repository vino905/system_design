package observer.observable;

import observer.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStocksCount(int stockCount);

    int getStocksCount();

}
