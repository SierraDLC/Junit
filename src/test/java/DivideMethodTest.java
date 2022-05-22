import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {
    @DisplayName("Should test if numbers will divide")
    @Test
    void divide() {

        assertEquals( 8, DivideMethod.divide(24, 3));

    }
}