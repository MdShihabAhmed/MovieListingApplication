import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    void testGetMovieCategory() {
        Category category = new Category("exampleCategory");
        assert("exampleCategory".equals(category.getMovieCategory));
    }
}
