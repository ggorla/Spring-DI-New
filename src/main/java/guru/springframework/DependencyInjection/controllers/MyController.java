package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHello(){
        return  greetingService.sayGreeting();
    }
}
