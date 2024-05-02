import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MovieTest {
    Movie movie = new Movie("exampleTitle", new Cast("examplePerson"), new Category("exampleCategory"));

    @Test
    void testGetTitle() {
        assertNotNull(movie);
    }
}
