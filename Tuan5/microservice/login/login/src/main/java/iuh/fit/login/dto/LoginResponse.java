package iuh.fit.login.dto;

public class LoginResponse {

    private final boolean authenticated;
    private final String message;

    public LoginResponse(boolean authenticated, String message) {
        this.authenticated = authenticated;
        this.message = message;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public String getMessage() {
        return message;
    }
}
