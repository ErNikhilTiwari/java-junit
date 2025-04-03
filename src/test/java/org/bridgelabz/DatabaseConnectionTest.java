package org.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    public void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    public void testConnectionIsClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }
}
