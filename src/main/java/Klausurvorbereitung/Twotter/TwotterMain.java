package Klausurvorbereitung.Twotter;

import java.util.ArrayList;
import java.util.List;

public class TwotterMain {
    static void main(){
        User user1 = new User("user1", "pw");
        User user2 = new User("user2", "pw");
        List<User> users = List.of(user1, user2);
        UserManager manager = new UserManager();
        manager.serialize(users);
        users = manager.deserialize();
    }
}
