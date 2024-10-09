package Abstract_Factory.online;

public class CreditCard implements onlinePayment {
    @Override
    public void pay(){
        System.out.println("Payment method is Creditcard");
    }
}
