import org.junit.jupiter.api.Test;

public class MovieListingApplicationTest {

    @Test
    void testRegisterUser() {
        MovieListingApplication mla = new MovieListingApplication();
        try {
            mla.registerUser("example@example.com");
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
            mla.registerUser("example@example.com");
            mla.registerUser("example@example.com");

        }
        catch(UserAlreadyExistsException e){
            System.out.println(e);
        }

        assert(mla.getEmails().contains("example@example.com"));
    }
}
