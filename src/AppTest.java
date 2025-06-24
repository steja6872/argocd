import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello from JUnit!", App.getMessage());
    }
}
