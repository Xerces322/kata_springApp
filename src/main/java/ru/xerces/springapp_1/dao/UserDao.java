package ru.xerces.springapp_1.dao;

import ru.xerces.springapp_1.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void addUser(User user);
    public void updateUser(int id, User user);
    public void deleteUser(int id);
}
