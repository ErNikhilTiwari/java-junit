package org.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount(200.0);
        assertTrue(account.withdraw(100.0));
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdrawFailure() {
        BankAccount account = new BankAccount(50.0);
        assertFalse(account.withdraw(100.0));
        assertEquals(50.0, account.getBalance());
    }
}
