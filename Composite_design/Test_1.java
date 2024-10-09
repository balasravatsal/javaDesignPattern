package Composite_design;

public class Test_1 {
    public static void main(String[] args) {
        component ph = new Leaf("Phone",20000);
        component lp = new Leaf("Laptop",70000);
        component wm = new Leaf("Washing Machine",30000);
        component wt = new Leaf("Watch",2000);
        component cm = new Leaf("Camera",100000);

        Composite mi = new Composite("Xiaomi");
        Composite dl = new Composite("Dell");
        Composite sg = new Composite("Sumsang");
        Composite ap = new Composite("Apple");
        Composite sn = new Composite("Sony");

        mi.addComponent(ph);
        mi.addComponent(lp);

        dl.addComponent(lp);

        sg.addComponent(cm);
        sg.addComponent(ph);
        sg.addComponent(wt);
        sg.addComponent(wm);

        ap.addComponent(ph);
        ap.addComponent(wt);
        ap.addComponent(lp);

        sn.addComponent(cm);

        ap.Show_price();
        System.out.println("----------------------------------------");
        sg.Show_price();
        System.out.println("----------------------------------------");
        mi.Show_price();
    }
}

// The Composite Design Pattern is used to create hierarchical structures of objects, and to treat individual objects and groups of objects uniformly. It allows clients to treat individual objects and compositions of objects in a uniform way, making it easy to work with complex object hierarchies.

// The main idea behind the Composite pattern is to represent a group of objects as a single object. This is useful when working with tree-like structures, where each node in the tree may itself contain a collection of nodes. By treating the tree as a single object, clients can interact with the entire structure in a consistent way, regardless of whether they are working with a single node or an entire subtree.