package webapp.dao;

import org.springframework.stereotype.Repository;
import webapp.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.remove(getUser(id));
        //entityManager.createQuery("DELETE User WHERE id = " + user.getId(), User.class);
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);
    }
}