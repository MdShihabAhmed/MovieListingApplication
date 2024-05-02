import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    void testGetMovieCategory() {
        Category category = new Category("exampleCategory");
        assert("exampleCategory".equals(category.getMovieCategory()));
    }

    @Test
    void testAddMovie(){
        Category category = new Category("exampleCategory");
        category.addMovie(new Movie(new Title("exampleTitle")));
        category.addMovie(new Movie(new Title("exampleTitle2")));
        boolean flag = false;
        for(Movie movie: category.getMovies()){
            if (movie.getTitle().getMovieTitle().equals("exampleTitle")){
                flag = true;
                break;
            }
        }
        assert(flag);

    }
}
