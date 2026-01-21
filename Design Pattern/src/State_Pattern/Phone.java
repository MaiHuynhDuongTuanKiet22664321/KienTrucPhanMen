package State_Pattern;

public class Phone {
    private State state;

    public Phone() {
        // Khởi tạo trạng thái ban đầu là Tắt (OffState) [1], [4]
        this.state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    // Các phương thức chức năng của điện thoại [2]
    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onPower();
    }
}
