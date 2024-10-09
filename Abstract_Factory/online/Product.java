package Abstract_Factory.online;

public class Product extends AbstractFactory {
    public electronicProduct getProduct(String productType){ 
        if(productType == null){ 
            return null; } 
        if(productType.equalsIgnoreCase("Mobile")){ 
            return new Mobiles(); 
        } 
        else if(productType.equalsIgnoreCase("Washing Machine")){ 
            return new WashingMachine();
        } 
        else if(productType.equalsIgnoreCase("Laptop")){ 
            return new Laptop(); 
        }  
        return null; 
    }  
    @Override 
    onlinePayment getPayment(String payment)
    { 
        return null; 
    } 
}