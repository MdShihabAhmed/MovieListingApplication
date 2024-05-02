import java.util.ArrayList;

public class Category {
    private String movieCategory;
    private ArrayList<Movie> movies;

    public Category(String movieCategory){
        this.movieCategory = movieCategory;
        movies = new ArrayList<>();
    }

    public String getMovieCategory(){
        return movieCategory;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public ArrayList<Movie> getMovies(){
        return movies;
    }
}
