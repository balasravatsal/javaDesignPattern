public interface Subject{
   void subscriber(Subscriber sub);
   void unsubscriber(Observer sub);
   void notifySubscriber();
   void upload(String title);
}