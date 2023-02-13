package com.startio.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

    private final EventService eventService;

    public TestApplication(EventService eventService) {
        this.eventService = eventService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EventRepository eventRepository) {
        return (args -> {
            eventService.insertEventFromCSV(eventRepository);
        });
    }
}
