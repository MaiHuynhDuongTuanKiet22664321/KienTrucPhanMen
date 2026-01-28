package Observer_Pattern;

public class Store {
    private NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    // Phương thức kích hoạt sự kiện sản phẩm mới [6]
    public void newItemPromotion() {
        notificationService.notifyListeners(Event.NEW_ITEM);
    }

    // Phương thức kích hoạt sự kiện giảm giá [3]
    public void salePromotion() {
        notificationService.notifyListeners(Event.SALE);
    }
}
