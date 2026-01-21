package Decorator_Pattern;

public class Notifier implements INotifier{
    @Override
    public void send(String message) {
        // Logic to retrieve email from database and send message [4]
        System.out.println("Sending Email: " + message);
    }
}
