package designpattern.observerPattern.observer;


import designpattern.observerPattern.observable.StockObservable;

/**
 * @author rohit.nagelli created on 18/12/24
 */
public class EmailNotificationAlertObserver implements NotificationAlertObserver {

  private final String emailId;
  private StockObservable stockObservable;

  public EmailNotificationAlertObserver(String emailId, StockObservable stockObservable){
    this.emailId = emailId;
    this.stockObservable = stockObservable;
  }

  @Override
  public void update() {
    System.out.println("Notification sent to email: "+ emailId+ " wth stock " + stockObservable.getStock());
  }
}
