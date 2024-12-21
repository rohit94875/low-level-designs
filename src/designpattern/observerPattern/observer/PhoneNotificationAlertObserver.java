package designpattern.observerPattern.observer;


import designpattern.observerPattern.observable.StockObservable;

/**
 * @author rohit.nagelli created on 18/12/24
 */
public class PhoneNotificationAlertObserver implements NotificationAlertObserver {
  private final long phoneNumber;
  private final StockObservable stockObservable;

  public PhoneNotificationAlertObserver(Long phoneNumber, StockObservable stockObservable){
    this.phoneNumber = phoneNumber;
    this.stockObservable = stockObservable;
  }

  @Override
  public void update() {
    System.out.println("Message sent to phoneNumber: "+ phoneNumber + "with stock "+ stockObservable.getStock());
  }
}
