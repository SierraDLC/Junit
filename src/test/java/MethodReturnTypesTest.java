import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodReturnTypesTest {


    @DisplayName("Test should return an integer")
    @Test
    void intMethod() {

        assertEquals(89, 89);
    }
    @DisplayName( " Test should return a string message")
    @Test
    void giveString() {

        assertEquals("I don't enjoy hazelnuts", "I don't enjoy hazelnuts");
    }
}