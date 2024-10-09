package flyweight2;

import java.util.*;

public class Carfactory {
    private static final HashMap<String, Sedan> sedanMap = new HashMap<>();

    public static Sedan getSedan(String brand) {
        Sedan sedan = sedanMap.get(brand);

        if (sedan == null) {
            sedan = new Sedan(brand);
            sedanMap.put(brand, sedan);
            System.out.println("This is a car from " + brand);
        }

        return sedan;
    }
}