package BuilderPattern;

public class ottplatform {
    public static void main(String[] args) {
        
        // webseries pb = new webseriesbuilder().settype("romantic").setname("Wednesday").setepisodes(10).setrating(9.5).setduration(2.5).setuc("18 plus").getWebseries();
        // System.out.println(pb.toString());

        webseriesbuilder pb1 = new webseriesbuilder();
        pb1.settype("horror");
        pb1.setname("IT");
        pb1.setepisodes(2);
        pb1.setrating(9.1);
        pb1.setduration(2.3);
        pb1.setuc("18 plus");

        System.out.println(pb1.getWebseries().toString());
    }
}