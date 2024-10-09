package Composite_design;

public class Leaf implements component {
    int price;
    String name;
    Leaf(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void Show_price() {
        System.out.println("Leaf" + " -> " + name + ": " + price);
    }
    public int getPrice(){
        return price;
    }
}