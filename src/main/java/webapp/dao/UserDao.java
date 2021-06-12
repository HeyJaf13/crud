package webapp.dao;

import webapp.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUser(long id);
    void addUser(User user);
    void deleteUser(long id);
    void editUser(User user);
}