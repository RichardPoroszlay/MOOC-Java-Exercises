
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message fromRichard = new Message("Richard", "hello");
        MessagingService signal = new MessagingService();
        
        signal.add(fromRichard);
        signal.add(fromRichard);
        signal.add(fromRichard);
        signal.add(fromRichard);
        signal.getMessages();
    }
}
