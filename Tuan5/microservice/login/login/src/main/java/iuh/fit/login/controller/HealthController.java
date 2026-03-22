package iuh.fit.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/login/health")
    public String health() {
        return "login-service-ok";
    }
}
