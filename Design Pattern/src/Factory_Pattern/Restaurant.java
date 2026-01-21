package Factory_Pattern;

public abstract class Restaurant {
    // Logic nghiệp vụ chính
    public void orderBurger() {
        // Gọi Factory Method để lấy đối tượng Burger
        // Lớp cha không biết (và không quan tâm) loại Burger cụ thể nào được tạo
        Burger burger = createBurger();

        burger.prepare();
    }

    // ĐÂY LÀ FACTORY METHOD
    // Phương thức này là abstract, ủy quyền việc khởi tạo cho lớp con
    public abstract Burger createBurger();
}
