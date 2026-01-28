package Observer_Pattern;

public class MobileAppListener implements EventListener{
    private String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event eventType) {
        // Gửi thông báo đẩy tới tài khoản người dùng [3]
        System.out.println("Gửi thông báo đẩy tới user " + username + ": Có thông báo mới về " + eventType);
    }
}
