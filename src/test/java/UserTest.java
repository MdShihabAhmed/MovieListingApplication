import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUser() {
        User user = new User("example@example.com");
        assertNotNull(user);
    }

}
