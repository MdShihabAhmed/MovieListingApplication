import java.util.ArrayList;

public class MovieListingApplication {
    private ArrayList<String> emails;
    private ArrayList<User> users;
    private ArrayList<Movie> movies;
    private ArrayList<Actor> casts;


    public MovieListingApplication(){
        this.emails = new ArrayList<>();
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.casts = new ArrayList<>();
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

    public ArrayList<Movie> searchMoviesByTitle(Title title){
        ArrayList<Movie> searchResult = new ArrayList<>();
        for(Movie movie: this.getMovies()){
            if(movie.getTitle().getMovieTitle().equals(title.getMovieTitle())){
                searchResult.add(movie);
            }
        }
        return searchResult;
    }


    public ArrayList<Actor> getCasts(){
        return casts;
    }

    public ArrayList<Movie> searchMoviesByCast(Actor cast){
        for(Actor cast1: this.getCasts()){
            if(cast1.getName().equals(cast.getName())){
                return cast1.getMovies();
            }
        }
        return new ArrayList<>();
    }
}
