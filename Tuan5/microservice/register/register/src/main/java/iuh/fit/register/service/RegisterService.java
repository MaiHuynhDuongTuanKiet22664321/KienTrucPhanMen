package iuh.fit.register.service;

import iuh.fit.register.dto.RegisterRequest;
import iuh.fit.register.dto.RegisterResponse;
import iuh.fit.register.model.UserAccount;
import iuh.fit.register.repository.UserAccountRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final UserAccountRepository userAccountRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public RegisterService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public RegisterResponse register(RegisterRequest request) {
        String username = request.getUsername().trim();
        String email = request.getEmail().trim().toLowerCase();

        if (userAccountRepository.existsByUsernameIgnoreCase(username)) {
            return new RegisterResponse(false, "Username already exists");
        }
        if (userAccountRepository.existsByEmailIgnoreCase(email)) {
            return new RegisterResponse(false, "Email already exists");
        }

        UserAccount user = new UserAccount();
        user.setUsername(username);
        user.setEmail(email);
        user.setPasswordHash(passwordEncoder.encode(request.getPassword()));
        userAccountRepository.save(user);

        return new RegisterResponse(true, "Register successfully");
    }
}
