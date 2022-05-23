import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoilingWaterTest {

    @DisplayName(" Should tell if water is boiling based on user input")
    @Test
    void boiling() {

        assertEquals("The water! It boils!!!",BoilingWater.Boiling(219));
    }
    @DisplayName(" Should test if water is not boiling based on user input")
    @Test
    void notBoil() {

        assertEquals(" it's not boiling", BoilingWater.notBoil(180));
    }
    @DisplayName(" Should test user's input is equal to starting boil temp")
    @Test
    void startBoil() {

        assertEquals("It's starting to boil!", BoilingWater.startBoil(212));
    }
}