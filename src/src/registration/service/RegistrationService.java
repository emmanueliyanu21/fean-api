package registration.service;

// RegistrationService.java
import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    private static List<User> registeredUsers = new ArrayList<>();

    public boolean registerUser(User user) {
        // Check if the email is already registered
        if (registeredUsers.stream().anyMatch(u -> u.getEmail().equals(user.getEmail()))) {
            return false; // User with the same email already exists
        }

        // If not, add the user to the list
        registeredUsers.add(user);
        return true;
    }
}
