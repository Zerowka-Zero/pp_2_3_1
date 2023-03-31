package pak.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pak.dao.UserDAO;
import pak.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDAO userDao;
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }
    @Override
    public User findOne(Long id) {
        return userDao.findOne(id);
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
