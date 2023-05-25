import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void test_for_branch_criterion(){
        assertThrows(RuntimeException.class, () -> SILab2.function(null, null));

        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("user", "pass", "mile@gmail.com"));
        assertFalse(SILab2.function(new User("user", "pass", "bojan@gmail.com"), allUsers));

        List<User> allUsers1 = new ArrayList<>();
        allUsers.add(new User("user", "adminadmin#", "bojan@gmail.com"));
        assertFalse(SILab2.function(new User("bojannast", "nastovski@", "bojan@gmail.com"), allUsers));

        assertFalse(SILab2.function(new User(null, "password", "bojan@gmail.com"), new ArrayList<>()));

        List<User> allUsers2 = new ArrayList<>();
        allUsers.add(new User("user", "adminadmin", "valid@email.com"));
        assertFalse(SILab2.function(new User("user", "passbojan", "bojanbojan"), allUsers2));


        assertFalse(SILab2.function(new User("user", "pass bojan", "bojanbojan"), allUsers2));
    }

    @Test
    void test_for_multiple_choice(){
        assertAll(() -> assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>())),
                () -> assertThrows(RuntimeException.class, () -> SILab2.function(new User("bojan", null, "bojan@gmail.com"), new ArrayList<>())),
                () -> assertThrows(RuntimeException.class, () -> SILab2.function(new User("bojan", "adminadmin@", null), new ArrayList<>())),
                () -> assertDoesNotThrow(() -> SILab2.function(new User("bojan", "adminadmin@", "bojan@gmail.com"), new ArrayList<>()))
                );
    }
}
