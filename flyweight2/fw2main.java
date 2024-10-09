package flyweight2;

public class fw2main {
    private static final String brands[] = { "BMW", "Mercedes-Benz", "Audi", "Nissan", "Toyota" };

    public static void main(String[] args) {
        for (int i = 0; i < 17; i++) {
            Sedan sedan = Carfactory.getSedan(getRandombrand());
            sedan.setPower(getRandompower());
            sedan.setPrice(getRandomprice());
            sedan.drive();
        }
    }

    private static String getRandombrand() {
        return brands[(int) (Math.random() * brands.length)];
    }

    private static int getRandompower() {
        return (int) (Math.random() * 1000);
    }

    private static int getRandomprice() {
        return (int) (Math.random() * 1000000);
    }
}

// The Flyweight Design Pattern is used to optimize the memory usage of an application by sharing common objects between multiple instances. It is used when an application requires a large number of objects that are similar in nature, and creating a new object for each instance would be too expensive in terms of memory usage.

// The Flyweight pattern works by creating a pool of shared objects, called flyweights, that can be reused across multiple instances. These flyweights are immutable, meaning that their state cannot be changed once they are created. Instead, any variation in state is passed in as a parameter when the flyweight is used.

// Overall, the Flyweight pattern is useful when an application requires a large number of objects that are similar in nature, and when creating a new object for each instance would be too expensive in terms of memory usage. By sharing common objects, the application can be optimized to reduce memory usage and improve performance.