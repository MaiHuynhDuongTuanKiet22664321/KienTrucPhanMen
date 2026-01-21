package Decorator_Pattern;

public abstract class BaseNotifierDecorator implements INotifier {
    protected INotifier wrapped;

    public BaseNotifierDecorator(INotifier notifier) {
        this.wrapped = notifier;
    }

    @Override
    public void send(String message) {
        // Delegates the work to the wrapped object [5, 6]
        wrapped.send(message);
    }
}
