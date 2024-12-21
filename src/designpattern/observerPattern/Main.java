package designpattern.observerPattern;


import designpattern.observerPattern.observable.IphoneObservableImplementation;
import designpattern.observerPattern.observable.StockObservable;
import designpattern.observerPattern.observer.EmailNotificationAlertObserver;
import designpattern.observerPattern.observer.NotificationAlertObserver;
import designpattern.observerPattern.observer.PhoneNotificationAlertObserver;

/**
 * @author rohit.nagelli created on 18/12/24
 */
public class Main {

  public static void main(String[] args) {

    StockObservable stockObservable = new IphoneObservableImplementation();
    NotificationAlertObserver observable1 = new EmailNotificationAlertObserver("adsa.xyz", stockObservable);
    NotificationAlertObserver observable2 = new PhoneNotificationAlertObserver(123123123L, stockObservable);
    stockObservable.add(observable1);
    stockObservable.add(observable2);

    stockObservable.setStock(10);
    stockObservable.setStock(0);
    stockObservable.setStock(10);
  }
}
