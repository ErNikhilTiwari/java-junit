package org.bridgelabz;


import org.junit.Test;

import static org.junit.Assert.*;
public class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("racecar", stringUtils.reverse("racecar"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertTrue(stringUtils.isPalindrome("Madam"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
    }
}
