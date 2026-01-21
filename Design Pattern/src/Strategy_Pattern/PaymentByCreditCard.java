package Strategy_Pattern;

public class PaymentByCreditCard implements PaymentStrategy{
    @Override
    public void collectPaymentDetails() {
        System.out.println("Đang thu thập thông tin thẻ tín dụng...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Đang xác thực thẻ tín dụng...");
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Đang thanh toán " + amount + " qua Thẻ tín dụng.");
    }
}
