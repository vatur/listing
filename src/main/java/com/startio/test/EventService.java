package com.startio.test;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void insertEventFromCSV(EventRepository eventRepository) {

        Long count = eventRepository.count();

        if (count == 0) {
            eventRepository.insertFromCSV();
            System.out.println(eventRepository.findAll());
        }
    }

    public List<EventOutput> getListing(Double minPrice, Double maxPrice, Double minMinCpm, Double maxMinCpm) {

        return  Optional.ofNullable(eventRepository.getListing(minPrice, maxPrice, minMinCpm, maxMinCpm))
                        .orElse(new LinkedList<>())
                        .stream()
                        .filter(Objects::nonNull)
                        .map(e -> new EventOutput(e.getAdvertisingId(), e.getCountry(), e.getPrice(), e.getEventTypeId(), e.getGdpr(), e.getMinCpm(), e.getPriority(), e.getBidPrice()))
                        .collect(Collectors.toList());
    }

}
