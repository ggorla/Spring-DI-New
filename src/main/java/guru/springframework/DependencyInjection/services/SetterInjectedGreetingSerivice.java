package guru.springframework.DependencyInjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingSerivice implements GreetingService {

    @Override
    public  String sayGreeting(){
        return  "Hello World - Setter";
    }
}
