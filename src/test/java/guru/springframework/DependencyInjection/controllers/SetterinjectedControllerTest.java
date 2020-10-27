package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterinjectedControllerTest {

    SetterinjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterinjectedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}