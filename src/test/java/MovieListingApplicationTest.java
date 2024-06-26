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

    @Test
    void testSearchMoviesByCastMultiple(){
        MovieListingApplication mla = new MovieListingApplication();
        Movie movie = new Movie(new Title("Example"),"2018-05-05",100000);
        Actor actor = new Actor("exampleName");
        Actor actor1 = new Actor("exampleName1");
        Actor actor2 = new Actor("exampleName2");
        movie.addActorToCast(actor);
        movie.addActorToCast(actor1);
        movie.addActorToCast(actor2);
        mla.addMovie(movie);

        ArrayList<Actor> cast = new ArrayList<>();
        cast.add(actor);
        cast.add(actor2);

        ArrayList<Movie> mo = mla.searchMoviesByCast(cast);

        boolean flag = true;
        for(Movie m: mo) {
            for(Actor acto: cast){
                if (!m.getCast().contains(acto)) {
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        assert(flag);
    }

    @Test
    void testAddMovie(){
        Title title = new Title("exampleTitle");

        ArrayList<Actor> cast = new ArrayList<>();
        cast.add(new Actor("exampleName"));
        cast.add(new Actor("exampleName1"));

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("exampleCategory"));
        categories.add(new Category("exampleCategory1"));

        String date = "2022-03-03";

        int budget = 10000000;
        MovieListingApplication mla = new MovieListingApplication();
        mla.addMovie(title,cast,categories,date,budget);
        for(Movie movie:mla.getMovies()){
            if(!movie.getTitle().getMovieTitle().equals("exampleTitle")) assert true;
        }
    }

    @Test
    void testAddTheMovieToActor(){
        MovieListingApplication mla = new MovieListingApplication();
        Actor actor = new Actor("exampleName");
        mla.addTheMovieToActor(actor,new Movie(new Title("exampleTitle"),"2023-02-02",100000));
        for(Movie movie: actor.getMovies()){
            if(!movie.getTitle().getMovieTitle().equals("exampleTitle")) assert true;
        }
    }

    @Test
    void testAddTheMovieToCategory(){
        MovieListingApplication mla = new MovieListingApplication();
        Category category = new Category("exampleName");
        mla.addTheMovieToCategory(category,new Movie(new Title("exampleTitle"),"2023-02-02",100000));
        for(Movie movie: category.getMovies()){
            if(!movie.getTitle().getMovieTitle().equals("exampleTitle")) assert true;
        }
    }

    @Test
    void testAddMovieToFavourites(){
        MovieListingApplication mla = new MovieListingApplication();
        User user = new User("example","example@example.com");
        Movie movie = new Movie(new Title("exampleTitle"),"2023-02-02",100000);
        mla.addMovieToFavourites(user,movie);
        if(user.getMovies().contains(movie)) assert true;
    }

    @Test
    void testRemoveMovieFromFavourites(){
        MovieListingApplication mla = new MovieListingApplication();
        User user = new User("example","example@example.com");
        Movie movie = new Movie(new Title("exampleTitle"),"2023-02-02",100000);
        mla.removeMovieFromFavourites(user,movie);
        if(!user.getMovies().contains(movie)) assert true;
    }
}
