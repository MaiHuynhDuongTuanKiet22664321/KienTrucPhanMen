package State_Pattern;

public class ReadyState extends State{
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return "Đang quay lại màn hình chính."; // Đang sử dụng, nhấn Home về trang chủ [1]
    }

    @Override
    public String onPower() {
        phone.setState(new OffState(phone)); // Đang sử dụng, nhấn Power sẽ tắt [1]
        return "Đang tắt điện thoại...";
    }
}
