package State_Pattern;

public class OffState extends State{
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone)); // Chuyển sang trạng thái Khóa [1]
        return "Điện thoại đang bật nhưng đang bị khóa.";
    }

    @Override
    public String onPower() {
        phone.setState(new LockedState(phone)); // Chuyển sang trạng thái Khóa [1]
        return "Điện thoại đang bật nhưng đang bị khóa.";
    }
}
