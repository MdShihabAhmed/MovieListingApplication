import org.junit.jupiter.api.Test;

public class CastTest {
    Cast cast = new Cast("exampleCast");

    @Test
    void testGetName() {
        cast.addMovie(new Movie(new Title("Example"),"2018-05-05",100000));
        assert("exampleCast".equals(cast.getName()));
    }

}
