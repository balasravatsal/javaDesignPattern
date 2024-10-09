package Facade;

public class Amazon_Pay implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment method --> from AmazonPay");
    }
}
