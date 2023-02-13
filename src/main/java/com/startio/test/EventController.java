package com.startio.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/listing")
    public List<EventOutput> getListing(@RequestParam(value = "min_price") Double minPrice,
                                  @RequestParam(value = "max_price") Double maxPrice,
                                  @RequestParam(value = "min_min_cpm") Double minMinCpm,
                                  @RequestParam(value = "max_min_cpm") Double maxMinCpm) {
        return eventService.getListing(minPrice, maxPrice, minMinCpm, maxMinCpm);
    }

}
