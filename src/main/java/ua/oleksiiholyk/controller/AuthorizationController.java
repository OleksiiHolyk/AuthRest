package ua.oleksiiholyk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.oleksiiholyk.exception.UserAlreadyExistsException;
import ua.oleksiiholyk.model.User;
import ua.oleksiiholyk.DAO.UserRepository;

/**
 * Created by Oleksii on 26.12.2017.
 */
@RestController
@RequestMapping("/userservice/register")
public class AuthorizationController {
    private static final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);

    private final UserRepository userRepository;

    @Autowired
    public AuthorizationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("yahoo");
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addUser(@RequestBody User user) throws UserAlreadyExistsException {
        try {
            return ResponseEntity.ok(userRepository.createUser(user).toString());
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.toPseudoJson());
        }
    }
}
