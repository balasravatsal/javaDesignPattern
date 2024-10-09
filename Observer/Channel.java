import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subs=new ArrayList<Subscriber>();
    public String title;

    public void subscriber(Subscriber sub){
        subs.add(sub);
    }
    public void unsubscriber(Observer sub){
        subs.remove(sub);
    }
    public void notifySubscriber(){
        for(Observer sub:subs){
            sub.update();
        }
    }
    @Override
    public void upload(String title) {
        this.title=title;
        notifySubscriber();
    }

}
