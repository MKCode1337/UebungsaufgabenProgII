package Klausurvorbereitung.Twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User>{


    @Override
    public void serialize(List<User> users) {
        try(FileOutputStream os = new FileOutputStream("user.dat");
                ObjectOutputStream oos = new ObjectOutputStream(os);){
            for(User u: users){
                oos.writeObject(u);
                oos.flush();
            }
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }

    @Override
    public List<User> deserialize() {
        List<User> users = new ArrayList<>();
        try(FileInputStream is = new FileInputStream("user.dat");
            ObjectInputStream ois = new ObjectInputStream(is);){
            while(ois.read()==1){
                User user = (User) ois.readObject();
                users.add(user);
            }
        }
        catch (Exception e){
            throw new RuntimeException();
        }
        return users;
    }
}
