package com.ipophy.dao;


import com.ipophy.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAOService {

    private static List<User> users = new ArrayList<>();
    private static int userCounter = 4;

    static {
        users.add(new User(1,"Fei", new Date()));
        users.add(new User(2,"Josh", new Date()));
        users.add(new User(3,"Nick", new Date()));
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCounter);
        }
        users.add(user);
        return user;
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return  u;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iter = users.iterator();
        while (iter.hasNext()) {
            User user = iter.next();
            if (user.getId() == id) {
                iter.remove();
                return user;
            }
        }
        return null;
    }

}
