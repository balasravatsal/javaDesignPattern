package flyweight2;

public class Sedan implements car {

    private String brand;
    private int price;
    private int power;

    public Sedan(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void drive() {
        System.out.println("Created Sedan Of brand " + brand + " With Power " + power + " BHP in $ " + price);
    }
}
