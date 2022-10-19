import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
    }

    @Test
    void testAddInt() {
        assertEquals(30, Main.addInt(10, 20));
    }

    @Test
    void testAddNotEqualsInt(){
        assertNotEquals(40, Main.addInt(300, 30));
    }
}