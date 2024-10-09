public class Youtube {
    public static void main(String[] args) {
        
        Channel channel= new Channel();
        Subscriber s1 = new Subscriber("Vatsal");
        Subscriber s2 = new Subscriber("Smit");
        Subscriber s3 = new Subscriber("Het");
        Subscriber s4 = new Subscriber("Jatin");
        Subscriber s5 = new Subscriber("Ansh");
        
        channel.subscriber(s1);
        channel.subscriber(s2);
        channel.subscriber(s3);
        channel.subscriber(s4);
        channel.subscriber(s5);
    
        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);
    
        channel.upload("Cousins reunion");
        
        channel.unsubscriber(s2);
        System.out.println("\n");
        channel.upload("memories");
        }
}
