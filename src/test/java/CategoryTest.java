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
        for(Movie movie: category.getMovies()){
            assert movie.getTitle().getMovieTitle().equals("exampleTitle");
        }

    }
}
