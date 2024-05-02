import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUser() {
        User user = new User("example@example.com");
        assertNotNull(user);
    }

    @Test
    void testGetEmail(){
        User user = new User("example@example.com");
        assertEquals("example@example.com",user.getEmail());
    }

    @Test
    void testSetEmail(){
        User user = new User("example@example.com");
        user.setEmail("example2@example.com");
        assertEquals("example2@example.com",user.getEmail());
    }

}
