package iuh.fit.register.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/register/health")
    public String health() {
        return "register-service-ok";
    }
}
