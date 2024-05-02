import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MovieListingApplicationTest {

    @Test
    void testRegisterUser() {
        MovieListingApplication mla = new MovieListingApplication();
        try {
            mla.registerUser("name","example@example.com");
        }
        catch(UserAlreadyExistsException e){
            System.out.println(e);
        }

        assert(mla.getEmails().contains("example@example.com"));
    }

    //for duplicate user
    @Test
    void testRegisterUser2() {
        MovieListingApplication mla = new MovieListingApplication();
        try {
            mla.registerUser("name","example@example.com");
            mla.registerUser("name","example@example.com");

        }
        catch(UserAlreadyExistsException e){
            System.out.println(e);
        }

        assert(mla.getEmails().contains("example@example.com"));
    }

    @Test
    void testSearchMoviesByTitle(){
        MovieListingApplication mla = new MovieListingApplication();
        Movie movie = new Movie(new Title("Example"),"2018-05-05",100000);
        mla.addMovie(movie);
        ArrayList<Movie> mo = mla.searchMoviesByTitle(new Title("Example"));
        assert(mo.contains(movie));
    }

    @Test
    void testSearchMoviesByCast(){
        MovieListingApplication mla = new MovieListingApplication();
        Movie movie = new Movie(new Title("Example"),"2018-05-05",100000);
        Actor actor = new Actor("exampleName");
        movie.addActorToCast(actor);
        mla.addMovie(movie);

        ArrayList<Movie> mo = mla.searchMoviesByCast(new Actor("exampleName"));

        boolean flag = true;
        for(Movie m: mo) {
            boolean flag2=false;
            for (Actor actor1 : m.getCast()) {
                if (actor1.getName().equals("exampleName")) {
                    flag = true;
                    break;
                }
            }
            if(!flag2){
                flag = false;
                break;
            }
        }
        assert(flag);
    }
}
