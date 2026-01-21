package Decorator_Pattern;

public class WhatsAppDecorator extends BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending WhatsApp message: " + message);
    }
}
