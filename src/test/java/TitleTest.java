import org.junit.jupiter.api.Test;

public class TitleTest {
    Title title = new Title("exampleTitle");
    @Test
    void testGetMovieTitle() {
        assert("exampleTitle".equals(title.getMovieTitle()));
    }
}
