package Abstract_Factory.online;

public class Amazonpay implements onlinePayment {
    @Override
    public void pay(){
        System.out.println("Payment method is Amazonpay");
    }
}
