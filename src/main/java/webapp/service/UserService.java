package webapp.service;

import webapp.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(long id);
    void addUser(User user);
    void deleteUser(long id);
    void editUser(User user);
}