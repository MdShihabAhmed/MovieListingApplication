import org.junit.jupiter.api.Test;

public class CastTest {
    @Test
    void testGetName() {
        Cast cast = new Cast("example");
        assert("example".equals(cast.getName));
    }
}
