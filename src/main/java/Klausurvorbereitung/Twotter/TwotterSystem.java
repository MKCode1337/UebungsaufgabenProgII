package Klausurvorbereitung.Twotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem {
    Map<User,List<Message>> usermessages = new HashMap<>();

    public void addMessage(User u, Message m){
        if (usermessages.containsKey(u)){
            usermessages.get(u).add(m);
        }
        else {
            List<Message> liste = List.of(m);
            usermessages.put(u,liste);
        }
    }

    public List<Message> getAllMessages(){
        List<Message> alleNachrichten = new ArrayList<>();
        for(List<Message> liste: usermessages.values()){
            alleNachrichten.addAll(liste);
        }
        return alleNachrichten;
    }

    public List<Message> getAllMessagesFromDate(String date){
        List<Message> alleNachrichten = getAllMessages();
        List<Message> allMessagesFromDate = new ArrayList<>();
        // ALternative mit LambdaExpression?
        // allMessagesFromDate = getAllMessages().stream().filter(m -> m.getCreationDate().equals(date)).toList();
        for (Message m: alleNachrichten){
            if (m.getCreationDate().equals(date)){
                allMessagesFromDate.add(m);
            }
        }
        return allMessagesFromDate;
    }

    public List<Message> getAllMessagesFromUser(User user){
        return usermessages.get(user);
    }
}
