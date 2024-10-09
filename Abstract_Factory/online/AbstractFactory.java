package Abstract_Factory.online;

public abstract class AbstractFactory { 
    abstract electronicProduct getProduct(String elecronicproduct); 
    abstract onlinePayment getPayment(String onlinepayment); 
}