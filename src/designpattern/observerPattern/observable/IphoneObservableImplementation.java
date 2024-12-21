package designpattern.observerPattern.observable;

import designpattern.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rohit.nagelli created on 18/12/24
 */
public class IphoneObservableImplementation implements StockObservable {

  public int stock = 0;

  public List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();


  @Override
  public void add(NotificationAlertObserver observable) {
    notificationAlertObservers.add(observable);
  }

  @Override
  public void delete(NotificationAlertObserver observable) {
    notificationAlertObservers.remove(observable);
  }

  @Override
  public void notifyStock() {
    for(NotificationAlertObserver observable: notificationAlertObservers) {
      observable.update();
    }
  }

  @Override
  public void setStock(int newStock) {
    if(stock==0){
      stock = newStock;
      notifyStock();
    }
    else {
      stock = newStock;
    }

  }

  @Override
  public int getStock() {
    return stock;
  }
}
