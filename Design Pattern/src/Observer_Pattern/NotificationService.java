package Observer_Pattern;

import java.util.*;

public class NotificationService {
    // Map lưu trữ danh sách người nghe theo từng loại sự kiện [4]
    private Map<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        // Khởi tạo danh sách trống cho mỗi loại sự kiện
        Arrays.stream(Event.values()).forEach(event ->
                customers.put(event, new ArrayList<>()));
    }

    // Đăng ký nhận thông báo [2, 4]
    public void subscribe(Event eventType, EventListener listener) {
        customers.get(eventType).add(listener);
    }

    // Hủy đăng ký [4, 6]
    public void unsubscribe(Event eventType, EventListener listener) {
        customers.get(eventType).remove(listener);
    }

    // Thông báo cho tất cả người nghe của một sự kiện cụ thể [5, 6]
    public void notifyListeners(Event eventType) {
        List<EventListener> users = customers.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType);
        }
    }
}
