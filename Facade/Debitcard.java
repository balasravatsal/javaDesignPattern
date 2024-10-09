package Facade;

public class Debitcard implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment method --> from Debitcard");
    }
}