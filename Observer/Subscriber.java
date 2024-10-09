public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();
    
    
    public Subscriber(String name){
        this.name = name;
    }

    public void update(){
        System.out.println("Hey " + name + " Video Uploaded ON " + channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
