import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    @DisplayName("test should see if a deposit will add to the balance")
    @Test
    void depositAddsToBalance() {

        BankAccount bank = new BankAccount("Carl", 200);

        assertEquals(600, bank.deposit(400));
    }

}

