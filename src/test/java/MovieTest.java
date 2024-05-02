import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MovieTest {
    Movie movie = new Movie();

    @Test
    void testGetTitle() {
        assertNotNull(movie);
    }
}
