import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void addUserTest(){
        User user = new User("Kalle","abc123");
    }

    @Test
    public void getNameTest(){
        User user = new User("Kalle","abc123");
        assertEquals("lisa",user.getUser());
    }

    @Test
    public void getPasswordTest(){
        User user = new User("Kalle","abc123");
        assertEquals("abc123",user.getPassword());
    }
}

