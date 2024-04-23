package trainticketbooking.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import trainticketbooking.dao.UserRepository;

@SpringBootApplication()
public class Application {
    public static void main(String[] args) {
            ApplicationContext context=SpringApplication.run(org.example.Application.class,args);
        UserRepository userRepository=context.getBean(UserRepository.class);



    }
}