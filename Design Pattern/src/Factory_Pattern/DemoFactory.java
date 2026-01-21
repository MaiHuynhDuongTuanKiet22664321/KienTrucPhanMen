package Factory_Pattern;

public class DemoFactory {
    public static void main(String[] args) {
        // Khách hàng muốn đặt Burger Bò
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();
        // Output: Đang chuẩn bị Burger Bò...

        // Khách hàng muốn đặt Burger Chay
        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();
        // Output: Đang chuẩn bị Burger Chay...
    }
}
