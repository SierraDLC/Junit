import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @DisplayName("Should return a name and if it's a dog")
    @Test
    void getNameAndIfDog() {

        Animal animal = new Animal("Wookie", true);
        assertEquals("Wookie", animal.getName());
        assertEquals(true, animal.getDog());
    }


}