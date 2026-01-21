package Factory_Pattern;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Đang chuẩn bị Burger Chay...");
    }
}
