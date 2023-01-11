package ru.corruptzero.testbank.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import ru.corruptzero.testbank.entity.Bank;
import ru.corruptzero.testbank.entity.Customer;

public class CustomerTest {

    @Test
    public void testIsCreditAcceptable() {
        // Arrange
        Bank mockBank = mock(Bank.class);
        when(mockBank.getInterestRate()).thenReturn(5.0);
        Customer customer = new Customer();

        // Act
        boolean result = customer.isCreditAcceptable(mockBank.getInterestRate());

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsCreditNotAcceptable() {
        // Arrange
        Bank mockBank = mock(Bank.class);
        when(mockBank.getInterestRate()).thenReturn(15.0);
        Customer customer = new Customer();

        // Act
        boolean result = customer.isCreditAcceptable(mockBank.getInterestRate());

        // Assert
        assertFalse(result);
    }
}

