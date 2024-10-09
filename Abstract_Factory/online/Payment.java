package Abstract_Factory.online;

public class Payment extends AbstractFactory {
    public onlinePayment getPayment(String paymentType) {
        if (paymentType == null) {
            return null;
        }
        if (paymentType.equalsIgnoreCase("Debitcard")) {
            return new Debitcard();
        } 
        else if (paymentType.equalsIgnoreCase("Creditcard")) {
            return new CreditCard();
        } 
        else if (paymentType.equalsIgnoreCase("AmazonPay")) {
            return new Amazonpay();
        }
        return null;
    }

    @Override
    electronicProduct getProduct(String product) {
        return null;
    }
}