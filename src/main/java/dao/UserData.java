package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static List<User> users = new ArrayList<User>(){
        {
            add(new User("jagaa", "password"));
            add(new User("jagaa", "password"));
            add(new User("admin", "admin"));
            add(new User("test", "test"));
        }
    };
    private UserData() {

    }

    public static User createUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
        return user;
    }
    public static User getUser(String username) {
        for (User user: users)
            if (user.getUsername().equals(username)) return user;
        return null;
    }
}
