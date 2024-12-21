package designpattern.observerPattern.observable;

import designpattern.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {
  void add(NotificationAlertObserver observable);
  void delete(NotificationAlertObserver observable);
  void notifyStock();
  void setStock(int newStock);
  int getStock();
}
