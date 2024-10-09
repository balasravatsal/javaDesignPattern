package Facade;

public class Test_Class {
    public static void main(String[] args) {
        Online_Shoping os = new Online_Shoping();

        os.pay_from_creditcard();
        os.pay_from_debitcard();
        os.pay_from_amazonpay();
    }
}

// The Facade Design Pattern is used to provide a simple and unified interface to a complex system. It is used when an application has a complex set of components, and it is necessary to provide a simplified interface that hides the complexity of the underlying system.

// The Facade pattern works by providing a single entry point, called the facade, that encapsulates the functionality of the underlying components. The facade provides a simplified interface that exposes only the functionality that is needed by clients, while hiding the complexity of the underlying system.

// Overall, the Facade pattern is useful when an application has a complex set of components, and it is necessary to provide a simplified interface that hides the complexity of the underlying system. By providing a simple and unified interface, the facade makes it easier to use and maintain the underlying components, and promotes code reuse and modularity.