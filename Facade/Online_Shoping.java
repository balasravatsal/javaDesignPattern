package Facade;

public class Online_Shoping {
    private Payment creditcard;
    private Payment debitcard;
    private Payment amazonPay;

    public Online_Shoping() {
        creditcard = new Creditcard();
        debitcard = new Debitcard();
        amazonPay = new Amazon_Pay();
    }

    public void pay_from_creditcard() {
        creditcard.pay();
    }

    public void pay_from_debitcard() {
        debitcard.pay();
    }

    public void pay_from_amazonpay() {
        amazonPay.pay();
    }
}