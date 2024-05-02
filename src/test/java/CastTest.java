import org.junit.jupiter.api.Test;

public class CastTest {
    Actor cast = new Actor("exampleCast");

    @Test
    void testGetName() {
        cast.addMovie(new Movie(new Title("Example"),"2018-05-05",100000));
        assert("exampleCast".equals(cast.getName()));
    }

}
