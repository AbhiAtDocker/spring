package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        int i = 12;
        int j= 14;
        String message = "Greetings from Spring Boot! Hi Abhi ";
        return  message + i;
    }
    
}
