import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
    @DisplayName("Test Addition")
    @Test
    void addTest() {
        assertEquals(16, Calculations.Addition(8, 8));
    }

    @DisplayName("Test Subtraction")
    @Test
    void subTest() {
        assertEquals(25, Calculations.Subtraction(30, 5));
    }

    @DisplayName("Test Multiplication")
    @Test
    void multiTest() {
        assertEquals(25, Calculations.Multiplication(5, 5));
    }

    @DisplayName("Test Division")
    @Test
    void DivTest() {
        assertEquals(10, Calculations.Division(100, 10));
    }

    @DisplayName("Test Modulus")
    @Test
    void ModTest() {
        assertEquals(1, Calculations.Modulus(1, 2));
    }
}