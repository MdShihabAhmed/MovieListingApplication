import org.junit.jupiter.api.Test;

public class MovieListingApplicationTest {

    @Test
    void testRegisterUser() {
        MovieListingApplication mla = new MovieListingApplication();
        mla.registerUser("example@example.com");

        assert(mla.getEmails().contains("example@example.com"));
    }
}
