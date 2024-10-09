package Abstract_Factory.online;

public class Debitcard implements onlinePayment {
    @Override
    public void pay(){
        System.out.println("Payment method is form Debitcard");
    }
}
