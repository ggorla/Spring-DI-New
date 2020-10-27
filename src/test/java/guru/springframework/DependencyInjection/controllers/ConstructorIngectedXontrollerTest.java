package guru.springframework.DependencyInjection.controllers;

import guru.springframework.DependencyInjection.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorIngectedXontrollerTest {

    ConstructorIngectedXontroller controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorIngectedXontroller(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}