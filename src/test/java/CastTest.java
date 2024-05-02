import org.junit.jupiter.api.Test;

public class CastTest {
    Cast cast = new Cast("exampleCast");

    @Test
    void testGetName() {
        cast.addMovie(new Movie(new Title("Example")));
        assert("exampleCast".equals(cast.getName()));
    }

}
