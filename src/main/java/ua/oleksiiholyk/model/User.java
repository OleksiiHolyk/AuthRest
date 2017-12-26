package ua.oleksiiholyk.model;

import java.util.Base64;
import java.util.UUID;

/**
 * Created by Oleksii on 26.12.2017.
 */
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private String plainTextPassword;
    private String hashedPassword;

    public User() {
        this.id = String.valueOf(UUID.randomUUID());
        this.plainTextPassword = String.valueOf((int) (Math.random() * 100000));
        this.hashedPassword = Base64.getEncoder().encodeToString(this.plainTextPassword.getBytes());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPlainTextPassword() {
        return plainTextPassword;
    }

    public void setPlainTextPassword(String plainTextPassword) {
        this.plainTextPassword = plainTextPassword;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", plainTextPassword='" + plainTextPassword + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                '}';
    }
}
