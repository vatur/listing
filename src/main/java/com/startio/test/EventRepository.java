package com.startio.test;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    @Modifying
    @Query(value = "INSERT INTO EVENT (SESSION_ID, ADVERTISING_ID, COUNTRY, PRICE, EVENT_TYPE_ID, GDPR, MIN_CPM, PRIORITY, BID_PRICE) SELECT * FROM CSVREAD('classpath:listing-details.csv','sessionId,advertisingId,country,price,eventTypeId,gdpr,minCpm,priority,bidPrice')",
            nativeQuery = true)
    @Transactional
    void insertFromCSV();


    @Query(value = "SELECT * FROM EVENT WHERE(PRICE >= :minPrice AND PRICE <= :maxPrice AND MIN_CPM >= :minMinCpm AND MIN_CPM <= :maxMinCpm)",
            nativeQuery = true)
    List<Event> getListing(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice, @Param("minMinCpm") Double minMinCpm, @Param("maxMinCpm") Double maxMinCpm);
}
