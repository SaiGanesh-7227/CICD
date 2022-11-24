package xyz.lnews.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello!";
    }
    
    @GetMapping("/Namaste")
    public String getNamaste() {
    	return "Namaste";
    }
    
    @GetMapping("/")
    public String welcome() {
    	return"HI";
    }

    @GetMapping("/seeYa")
    public String getseeYa(){
        return "See u Soon";
    }
    
    
}