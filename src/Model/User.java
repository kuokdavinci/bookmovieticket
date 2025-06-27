package Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int user_id;
    private String name;
    private List<Ticket> tickets = new ArrayList<>();

    public User(int user_id, String name) {
        this.user_id = user_id;
        this.name = name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
