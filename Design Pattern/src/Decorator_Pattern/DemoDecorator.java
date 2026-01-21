package Decorator_Pattern;

public class DemoDecorator {
    public static void main(String[] args) {
        // The customer wants to be notified via Email, WhatsApp, and Facebook [8, 9]
        INotifier notificationStack = new Notifier(); // Base Email
        notificationStack = new WhatsAppDecorator(notificationStack); // Wrap with WhatsApp
        notificationStack = new FacebookDecorator(notificationStack); // Wrap with Facebook

        // This single call will trigger all three notification types [9]
        notificationStack.send("Your food order has departed!");
    }
}
