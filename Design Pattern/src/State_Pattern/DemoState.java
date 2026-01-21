package State_Pattern;

public class DemoState {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Context (Phone)
        // Mặc định ban đầu điện thoại sẽ ở trạng thái OffState [1], [2]
        Phone phone = new Phone();

        System.out.println("--- BẮT ĐẦU TEST ĐIỆN THOẠI ---");

        // 1. Điện thoại đang tắt, thử nhấn nút Power
        // Kỳ vọng: Chuyển từ OffState sang LockedState [3], [1]
        System.out.println("Hành động: Nhấn Power");
        System.out.println("Kết quả: " + phone.clickPower());

        // 2. Điện thoại đang ở màn hình khóa, nhấn nút Home lần 1
        // Kỳ vọng: Chuyển từ LockedState sang ReadyState [1]
        System.out.println("\nHành động: Nhấn Home để mở khóa");
        System.out.println("Kết quả: " + phone.clickHome());

        // 3. Điện thoại đã sẵn sàng (ReadyState), nhấn nút Home lần nữa
        // Kỳ vọng: Thực hiện chức năng quay về màn hình chính, vẫn ở ReadyState [1]
        System.out.println("\nHành động: Nhấn Home khi đang sử dụng");
        System.out.println("Kết quả: " + phone.clickHome());

        // 4. Đang sử dụng, nhấn nút Power
        // Kỳ vọng: Chuyển từ ReadyState về lại OffState [1]
        System.out.println("\nHành động: Nhấn Power để tắt máy");
        System.out.println("Kết quả: " + phone.clickPower());

        // 5. Thử nhấn Home khi máy đã tắt
        // Kỳ vọng: Máy bật lên màn hình khóa (LockedState) [3], [1]
        System.out.println("\nHành động: Nhấn Home khi máy đang tắt");
        System.out.println("Kết quả: " + phone.clickHome());
    }
}
