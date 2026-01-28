package Observer_Pattern;

public class EmailMsgListener implements EventListener {
    private String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event eventType) {
        // Gửi email thực tế cho khách hàng [2]
        System.out.println("Gửi mail tới " + email + ": Có thông báo mới về " + eventType);
    }
}
