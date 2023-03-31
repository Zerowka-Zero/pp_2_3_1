package pak.service;

import pak.models.User;
import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    User findOne(Long id);

    void update(User user);

    void delete(Long id);
}
