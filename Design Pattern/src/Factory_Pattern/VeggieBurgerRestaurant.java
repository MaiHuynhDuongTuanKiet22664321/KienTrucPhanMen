package Factory_Pattern;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
