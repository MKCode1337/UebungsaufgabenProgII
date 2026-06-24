package Klausurvorbereitung.Twotter;

import java.io.Serializable;

public class User implements Serializable {
    final String benutzername;
    transient String passwort;

    public User(String name, String pw) {
        this.benutzername = name;
        this.passwort = pw;
    }
}
