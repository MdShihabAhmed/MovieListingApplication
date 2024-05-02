public class User extends Person{
    private String email;

    public User(String name, String email){
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void removeMovie(Movie movie){
        this.getMovies().remove(movie);
    }
}
