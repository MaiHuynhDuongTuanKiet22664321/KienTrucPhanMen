package Adapter_Pattern;

public class DemoAdapter {
    public static void main(String[] args) {

        PaymentProcessor processor =
                new PaymentAdapter(new OldPaymentService());

        processor.pay(100);
    }
}
