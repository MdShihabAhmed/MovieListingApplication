import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user = new User("name","example@example.com");
    @Test
    void testUser() {

        assertNotNull(user);
    }

    @Test
    void testGetEmail(){
        assertEquals("example@example.com",user.getEmail());
    }

    @Test
    void testSetEmail(){
        user.setEmail("example2@example.com");
        assertEquals("example2@example.com",user.getEmail());
    }

}
