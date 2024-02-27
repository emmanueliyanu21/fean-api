package registration.controller;

// RegistrationController.java
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        if (registrationService.registerUser(user)) {
            return "Registration successful!";
        } else {
            return "User with the same email already exists!";
        }
    }
}
