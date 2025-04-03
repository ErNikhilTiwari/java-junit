package org.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {
    private final DateFormatter dateFormatter = new DateFormatter();

    @Test
    public void testValidDateFormat() throws ParseException {
        assertEquals("31-12-2023", dateFormatter.formatDate("2023-12-31"));
        assertEquals("01-01-2022", dateFormatter.formatDate("2022-01-01"));
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> dateFormatter.formatDate("31-12-2023"));
        assertThrows(ParseException.class, () -> dateFormatter.formatDate("2023/12/31"));
    }
}
