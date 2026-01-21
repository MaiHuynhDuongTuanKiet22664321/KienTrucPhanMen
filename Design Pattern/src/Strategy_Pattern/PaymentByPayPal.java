package Strategy_Pattern;

public class PaymentByPayPal implements PaymentStrategy{
    @Override
    public void collectPaymentDetails() {
        System.out.println("Đang thu thập thông tin tài khoản PayPal...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Đang xác thực tài khoản PayPal...");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Đang thanh toán " + amount + " qua PayPal.");
    }
}
