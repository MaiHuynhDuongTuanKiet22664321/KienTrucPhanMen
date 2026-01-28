package Adapter_Pattern;

public class PaymentAdapter implements PaymentProcessor{
    private OldPaymentService oldService;

    public PaymentAdapter(OldPaymentService oldService) {
        this.oldService = oldService;
    }

    @Override
    public void pay(int amount) {
        // Chuyển đổi kiểu dữ liệu / logic nếu cần
        oldService.makePayment((double) amount);
    }
}
