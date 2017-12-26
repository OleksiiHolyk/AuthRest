package ua.oleksiiholyk.exception;


/**
 * Created by Oleksii on 26.12.2017.
 */
public class UserAlreadyExistsException extends Exception {

    private String code = "USER_ALREADY_EXISTS";
    private String description = "A user with the given username already exists";

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
