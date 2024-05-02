import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MovieTest {
    Movie movie = new Movie(new Title("exampleTitle"));

    @Test
    void testGetTitle() {
        assert("exampleTitle".equals(movie.getTitle().getMovieTitle()));
    }

    @Test
    void testAddCasts(){
        movie.addCasts(new Cast("exampleName"));
        boolean flag = false;
        for(Cast cast: casts){
            if(cast.getName().equals("exampleName")){
                flag = true;
                break;
            }
        }
        assert(flag);
    }
}
