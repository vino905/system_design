package observer.observable;

import observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservableImpl implements StocksObservable {

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : notificationAlertObserverList) {
            observer.upadate();
        }
    }


    @Override
    public void setStocksCount(int newStockCount) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockCount;

    }

    @Override
    public int getStocksCount() {
        return stockCount;
    }
}
