package Strategy_Pattern;

public class DemoStrategy {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        // Khách hàng chọn thanh toán bằng Thẻ tín dụng [4]
        service.setStrategy(new PaymentByCreditCard());
        service.processOrder(100);

        System.out.println("--- Thay đổi phương thức thanh toán ---");

        // Khách hàng đổi sang thanh toán bằng PayPal tại runtime [4], [5]
        service.setStrategy(new PaymentByPayPal());
        service.processOrder(200);
    }
}
