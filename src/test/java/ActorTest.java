import org.junit.jupiter.api.Test;

public class ActorTest {
    Actor actor = new Actor("exampleActor");

    @Test
    void testGetName() {
        actor.addMovie(new Movie(new Title("Example"),"2018-05-05",100000));
        assert("exampleActor".equals(actor.getName()));
    }

}
