package Abstract_Factory.online;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Payment")) {
            return new Payment();
        }

        else if (choice.equalsIgnoreCase("Product")) {
            return new Product();
        }
        return null;
    }
}