package State_Pattern;

public class LockedState extends State{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone)); // Nhấn Home lần nữa để mở khóa [1]
        return "Điện thoại đã được mở khóa, sẵn sàng sử dụng.";
    }

    @Override
    public String onPower() {
        phone.setState(new OffState(phone)); // Nhấn Power sẽ tắt điện thoại [1]
        return "Đang tắt màn hình...";
    }
}
