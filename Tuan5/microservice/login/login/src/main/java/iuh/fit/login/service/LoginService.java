package iuh.fit.login.service;

import iuh.fit.login.dto.LoginRequest;
import iuh.fit.login.dto.LoginResponse;
import iuh.fit.login.model.UserAccount;
import iuh.fit.login.repository.UserAccountRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final UserAccountRepository userAccountRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public LoginService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public LoginResponse login(LoginRequest request) {
        String username = request.getUsername().trim();
        Optional<UserAccount> userOptional = userAccountRepository.findByUsernameIgnoreCase(username);

        if (userOptional.isEmpty()) {
            return new LoginResponse(false, "User not found");
        }

        UserAccount user = userOptional.get();
        if (!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {
            return new LoginResponse(false, "Wrong password");
        }

        return new LoginResponse(true, "Login successfully");
    }
}
