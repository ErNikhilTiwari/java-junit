package org.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValidPassword("SecureP@ss1"));
    }

    @Test
    public void testPasswordTooShort() {
        assertFalse(validator.isValidPassword("Ab1"));
    }

    @Test
    public void testPasswordWithoutUppercase() {
        assertFalse(validator.isValidPassword("secure123"));
    }

    @Test
    public void testPasswordWithoutDigit() {
        assertFalse(validator.isValidPassword("SecurePass"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(validator.isValidPassword(null));
    }
}
