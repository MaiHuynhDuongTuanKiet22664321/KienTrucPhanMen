package Strategy_Pattern;

public class PaymentService {
    private PaymentStrategy strategy;

    // Setter để khách hàng có thể thay đổi chiến lược tại thời điểm thực thi (runtime) [4], [2]
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int amount) {
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(amount);
        }
    }
}
