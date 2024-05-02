import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Movie> movies;

    public Person(String name){
        this.name = name;
        movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }
}
