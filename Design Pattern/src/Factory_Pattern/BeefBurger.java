package Factory_Pattern;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Đang chuẩn bị Burger Bò...");
    }
}
