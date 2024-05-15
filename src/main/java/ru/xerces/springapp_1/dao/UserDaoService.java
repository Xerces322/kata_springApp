package ru.xerces.springapp_1.dao;

import org.springframework.stereotype.Repository;
import ru.xerces.springapp_1.entity.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoService implements UserDao{
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("xerces", "xerces@mail.ru", "Russia"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(int id, User user) {
        for (User u : users) {
            if (u.getId() == id) {
                u.setNickname(user.getNickname());
                u.setEmail(user.getEmail());
                u.setCountry(user.getCountry());
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
