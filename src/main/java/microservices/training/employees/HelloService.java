package microservices.training.employees;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HelloService {

    public String sayHello(){
        return "Hello Spring Boot (service dev tools1) "+ LocalDateTime.now();
    }
}
