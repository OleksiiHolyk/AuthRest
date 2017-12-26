package ua.oleksiiholyk.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.oleksiiholyk.DAO.UserRepository;
import ua.oleksiiholyk.DAO.UserRepositoryImpl;

/**
 * Created by Oleksii on 26.12.2017.
 */
@Configuration
public class AppConfig {
    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }
}
