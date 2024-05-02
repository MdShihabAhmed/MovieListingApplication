import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MovieTest {
    Movie movie = new Movie(new Title("Example"),"2018-05-05",100000);

    @Test
    void testGetTitle() {
        assert("exampleTitle".equals(movie.getTitle().getMovieTitle()));
    }

    @Test
    void testAddActorToCast(){
        movie.addActorToCast(new Actor("exampleName"));
        boolean flag = false;
        for(Actor actor: movie.getCast()){
            if(actor.getName().equals("exampleName")){
                flag = true;
                break;
            }
        }
        assert(flag);
    }

    @Test
    void testAddActorsToCast(){
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("exampleName"));
        actors.add(new Actor("exampleName1"));
        movie.addActorsToCast(actors);
        boolean flag = true;
        for(Actor actor1: actors) {
            if (!movie.getCast().contains(actor1)) {
                flag = false;
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

    @Test
    void testAddCategories(){
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("exampleCategory"));
        categories.add(new Category("exampleCategory1"));
        movie.addCategories(categories);
        boolean flag = true;
        for(Category category: categories){
            if (!movie.getCategories().contains(category)) {
                flag = false;
                break;
            }
        }
        assert(flag);
    }
}
