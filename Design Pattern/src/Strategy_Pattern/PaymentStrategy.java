package Strategy_Pattern;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
