package org.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private final UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "SecurePass1"));
    }

    @Test
    public void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "john.doe@example.com", "SecurePass1"));
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "invalid-email", "SecurePass1"));
    }

    @Test
    public void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "short"));
    }
}
