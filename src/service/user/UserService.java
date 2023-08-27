package service.user;

import java.sql.SQLException;
import java.util.List;
import model.User;

public interface UserService {

    List<User> getAll() throws SQLException;
    boolean register(User user);
    boolean deleteAll();
    boolean deleteById(Integer id);
    User getById(Integer id);
    boolean update(User user);












}