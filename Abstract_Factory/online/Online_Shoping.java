package Abstract_Factory.online;

public class Online_Shoping {
    public static void main(String args[]) {

        System.out.println("-------- This all are online Payment methods --------");
        AbstractFactory payment = FactoryProducer.getFactory("Payment");
        onlinePayment onlp1 = payment.getPayment("Debitcard");
        onlp1.pay();
        onlinePayment onlp2 = payment.getPayment("Creditcard");
        onlp2.pay();
        onlinePayment onlp3 = payment.getPayment("Amazonpay");
        onlp3.pay();

        System.out.println("-------- This all are Electronics Product --------");
        AbstractFactory product = FactoryProducer.getFactory("Product");
        electronicProduct ele1 = product.getProduct("Mobile");
        ele1.electronics();
        electronicProduct ele2 = product.getProduct("Laptop");
        ele2.electronics();
        electronicProduct ele3 = product.getProduct("Washing Machine");
        ele3.electronics();
    }
}