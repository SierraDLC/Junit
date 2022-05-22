import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @DisplayName(" Should return the remaining fees of a student")
    @Test
    void getRemainingFees() {
        Student mark = new Student( 1, "Mark", 4);

        assertEquals(28000, mark.getRemainingFees(2000, 30000));



    }
}