import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    @Test
    public void testDeclaraciones() {
        assertEquals(5, 2 + 3);
        assertTrue(3 > 2);
        assertFalse(6 < 2);
        assertNotNull(new Object());
    }

    @Test
    public void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int division = 1 / 0;
        });
    }
}
