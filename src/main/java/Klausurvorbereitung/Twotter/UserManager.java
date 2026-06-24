package Klausurvorbereitung.Twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User>{


    @Override
    public void serialize(List<User> users) {
        try(FileOutputStream os = new FileOutputStream("user.dat");
            BufferedOutputStream bos = new BufferedOutputStream(os);
                ObjectOutputStream oos = new ObjectOutputStream(bos);){
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
            BufferedInputStream bis = new BufferedInputStream(is);
            ObjectInputStream ois = new ObjectInputStream(bis);){
            while(true){
                User user = (User) ois.readObject();
                users.add(user);
            }
        }
        catch (EOFException e){}
        catch (Exception e){
            throw new RuntimeException();
        }
        return users;
    }
}
