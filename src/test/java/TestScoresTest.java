import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestScoresTest {
    @DisplayName("Test should see if score prints")
    @Test
    void whatIsGrade() {

        int h = 89;
        assertEquals("OMG, it's a B!", TestScores.whatIsGrade(h));



    }
}