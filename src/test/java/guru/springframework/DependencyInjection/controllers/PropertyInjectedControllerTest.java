package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}