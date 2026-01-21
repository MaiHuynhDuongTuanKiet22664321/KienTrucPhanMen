package Decorator_Pattern;

public class FacebookDecorator extends BaseNotifierDecorator{
    public FacebookDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Calling the parent method is a must [5]
        System.out.println("Sending Facebook message: " + message);
    }
}
