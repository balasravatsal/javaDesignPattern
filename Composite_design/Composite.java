package Composite_design;
import java.util.ArrayList;
import java.util.List;

public class Composite implements component{
    String name;
    List<component> comp = new ArrayList<component>();

    public Composite(String name){
        super();
        this.name = name;
    }

    public void addComponent(component com){
        comp.add(com);
    }

    @Override
    public int getPrice(){
        int price = 0;
        for(component c : comp){
            price += c.getPrice();
        }
        return price;
    }

    @Override
    public void Show_price(){
        System.out.println("Composite -> " + name + " : Price " + getPrice());
        System.out.println("Leaf of " + name);
        for(component c : comp){
            c.Show_price();
        }
    }
}