package ua.oleksiiholyk.DAO;


import ua.oleksiiholyk.exception.UserAlreadyExistsException;
import ua.oleksiiholyk.model.User;

/**
 * Created by Oleksii on 26.12.2017.
 */
public interface UserRepository {
    User createUser(User user) throws UserAlreadyExistsException;
}