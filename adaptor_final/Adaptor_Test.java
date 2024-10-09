package adaptor_final;

public class Adaptor_Test {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();

        vehicles.Product("Three Wheeler", "Riksha");
        vehicles.Product("Two Wheeler", "TVS");
        vehicles.Product("Four Wheeler", "TATA");
        vehicles.Product("Five Wheeler", "OLA");
    }
}

// The main purpose of using the Adapter pattern is to make sure that the different components of an application can work together even if they have incompatible interfaces. It helps to integrate different systems that may use different protocols or data formats, or that may have different APIs or interfaces.

// Overall, the Adapter pattern is useful when working with objects that have incompatible interfaces, and when it is necessary to create an intermediary object to translate between these interfaces.