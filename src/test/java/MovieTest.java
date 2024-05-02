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
        movie.addCast(new Cast("exampleName"));
        boolean flag = false;
        for(Cast cast: movie.getCasts()){
            if(cast.getName().equals("exampleName")){
                flag = true;
                break;
            }
        }
        assert(flag);
    }

    @Test
    void testAddCategory(){
        movie.addCategory(new Category("exampleCategory"));
        boolean flag = false;
        for(Category category: movie.getCategories()){
            if(category.getMovieCategory().equals("exampleCategory")){
                flag = true;
                break;
            }
        }
        assert(flag);
    }
}
