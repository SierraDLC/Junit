import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageMethodTest {

    @Test
    void average() {
        AverageMethod averages = new AverageMethod();

        assertEquals(4, averages.average(2,4,6));
    }
}
