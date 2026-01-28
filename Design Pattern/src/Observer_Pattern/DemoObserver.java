package Observer_Pattern;

public class DemoObserver {
    public static void main(String[] args) {
        // Tạo đối tượng Store (Publisher)
        Store store = new Store();

        // Tạo các người nghe (Subscribers)
        EventListener emailSub = new EmailMsgListener("khachhang@example.com");
        EventListener mobileSub = new MobileAppListener("user123");

        // Đăng ký người nghe vào dịch vụ thông báo của cửa hàng
        // Email đăng ký nhận tin Sản phẩm mới
        store.getNotificationService().subscribe(Event.NEW_ITEM, emailSub);

        // Mobile User đăng ký nhận tin Giảm giá
        store.getNotificationService().subscribe(Event.SALE, mobileSub);

        // Kích hoạt sự kiện
        System.out.println("--- Có sản phẩm mới về ---");
        store.newItemPromotion(); // Chỉ emailSub nhận được

        System.out.println("\n--- Có đợt giảm giá ---");
        store.salePromotion(); // Chỉ mobileSub nhận được
    }
}
