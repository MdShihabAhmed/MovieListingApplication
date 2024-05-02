import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class MovieListingApplication {
    private ArrayList<String> emails;
    private ArrayList<User> users;
    private ArrayList<Movie> movies;
    private ArrayList<Actor> actors;


    public MovieListingApplication(){
        this.emails = new ArrayList<>();
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.actors = new ArrayList<>();
    }

    public void registerUser(String name, String email) throws UserAlreadyExistsException {

        if(this.emails.contains(email)){
            throw new UserAlreadyExistsException();
        }

        this.emails.add(email);
        User user = new User(name, email);
        this.users.add(user);
    }

    public ArrayList<String> getEmails() {
        return this.emails;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public ArrayList<Movie> getMovies(){
        return this.movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void addMovie(Title title, ArrayList<Actor> cast, ArrayList<Category> categories, String releaseDate, int budget){
        Movie movie = new Movie(title, releaseDate, budget);
        movie.addActorsToCast(cast);
        movie.addCategories(categories);
        movies.add(movie);
        for(Actor actor:cast) {
            this.addTheMovieToActor(actor,movie);
        }
        for(Category category: categories) {
            this.addTheMovieToCategory(category,movie);
        }
    }

    public void addTheMovieToActor(Actor actor, Movie movie){
        actor.addMovie(movie);
    }

    public void addTheMovieToCategory(Category category, Movie movie){
        category.addMovie(movie);
    }

    public ArrayList<Movie> searchMoviesByTitle(Title title){
        ArrayList<Movie> searchResult = new ArrayList<>();
        for(Movie movie: this.getMovies()){
            if(movie.getTitle().getMovieTitle().equals(title.getMovieTitle())){
                searchResult.add(movie);
            }
        }
        return searchResult;
    }


    public ArrayList<Actor> getActors(){
        return actors;
    }

    public ArrayList<Movie> searchMoviesByCast(Actor actor){
        for(Actor actor1: this.getActors()){
            if(actor1.getName().equals(actor.getName())){
                return actor1.getMovies();
            }
        }
        return new ArrayList<>();
    }

    public ArrayList<Movie> searchMoviesByCast(ArrayList<Actor> cast){
        ArrayList<Movie> movies = new ArrayList<>();
        for(Movie movie: this.getMovies()){
            boolean flag = true;
            for(Actor actor: cast){
                if(!movie.getCast().contains(actor)) flag = false;
            }
            if (flag) movies.add(movie);
        }

        return movies;
    }

    public void addMovieToFavourites(User user, Movie movie){
        user.addMovie(movie);
    }

    public void removeMovieFromFavourites(User user, Movie movie){
        user.removeMovie(movie);
    }

}
