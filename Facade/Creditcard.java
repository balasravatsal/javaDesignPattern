package Facade;

public class Creditcard implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment method --> from Creditcard");
    }
}