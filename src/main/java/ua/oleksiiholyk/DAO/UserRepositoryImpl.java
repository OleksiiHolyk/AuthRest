package ua.oleksiiholyk.DAO;

import org.springframework.stereotype.Service;
import ua.oleksiiholyk.exception.UserAlreadyExistsException;
import ua.oleksiiholyk.model.User;

import java.util.HashMap;

/**
 * Created by Oleksii on 26.12.2017.
 */
@Service
public class UserRepositoryImpl implements UserRepository {
    private HashMap<String, User> userList = new HashMap<>();

    @Override
    public User createUser(User user) throws UserAlreadyExistsException {
        if (userList.containsKey(user.getUserName())) {
            throw new UserAlreadyExistsException();
        } else {
            userList.put(user.getUserName(), user);
            return user;
        }
    }
}
