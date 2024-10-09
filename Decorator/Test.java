package Decorator;

public class Test {
    public static void main(String[] args) {
        Plateforms amazon = new Amazon();
        Plateforms flipkart = new Flipkart();

        Plateforms eleAmazon = new Electronics(new Amazon());

        Plateforms eleFlipcart = new Electronics(new Flipkart());

        System.out.println("--> Online Plateforms <--");
        amazon.Online_Plateform();flipkart.Online_Plateform();

        System.out.println("--------------------------------------------------------------");

        System.out.println("--> Electronics items in Amazon <--");
        eleAmazon.Online_Plateform();

        System.out.println("--------------------------------------------------------------");

        System.out.println("--> Electronics items in Flipkart <--");
        eleFlipcart.Online_Plateform();
    }
}


// The Decorator Design Pattern is used to dynamically add new functionality to an object without changing its original implementation. It is used when it is necessary to add new behavior or modify the behavior of an object at runtime, while maintaining a clear separation of concerns.

// The Decorator pattern works by wrapping an existing object with one or more decorator objects. These decorator objects add new functionality to the original object by providing additional methods or modifying existing methods. Because the decorator objects implement the same interface as the original object, they can be used interchangeably.

// Overall, the Decorator pattern is useful when it is necessary to add new functionality to an object dynamically, without changing its original implementation. It allows for a clear separation of concerns and promotes code reuse, making it easier to maintain and extend complex systems.