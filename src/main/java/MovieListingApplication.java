import java.util.ArrayList;

public class MovieListingApplication {
    private ArrayList<String> emails;
    private ArrayList<User> users;


    public MovieListingApplication(){
        emails = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void registerUser(String email){
        emails.add(email);
        User user = new User(email);
        users.add(user);
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
