package State_Pattern;

public abstract class State {
    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    // Các phương thức đại diện cho các nút bấm trên điện thoại [2]
    public abstract String onHome();
    public abstract String onPower();
}
