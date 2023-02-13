package com.startio.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    private Long sessionId;
    private Long advertisingId;
    private String country;
    private Double price;
    private Integer eventTypeId;
    private Integer gdpr;
    private Double minCpm;
    private Double priority;
    private Double bidPrice;

    public Event(Long advertisingId, String country, Double price, Integer eventTypeId, Integer gdpr, Double minCpm, Double priority, Double bidPrice) {
        this.advertisingId = advertisingId;
        this.country = country;
        this.price = price;
        this.eventTypeId = eventTypeId;
        this.gdpr = gdpr;
        this.minCpm = minCpm;
        this.priority = priority;
        this.bidPrice = bidPrice;
    }

    public Event(Long advertisingId, Long sessionId, String country, Double price, Integer eventTypeId, Integer gdpr, Double minCpm, Double priority, Double bidPrice) {
        this.advertisingId = advertisingId;
        this.sessionId = sessionId;
        this.country = country;
        this.price = price;
        this.eventTypeId = eventTypeId;
        this.gdpr = gdpr;
        this.minCpm = minCpm;
        this.priority = priority;
        this.bidPrice = bidPrice;
    }

    public Event() {

    }

    public Long getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(Long advertisingId) {
        this.advertisingId = advertisingId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Integer getGdpr() {
        return gdpr;
    }

    public void setGdpr(Integer gdpr) {
        this.gdpr = gdpr;
    }

    public Double getMinCpm() {
        return minCpm;
    }

    public void setMinCpm(Double minCpm) {
        this.minCpm = minCpm;
    }

    public Double getPriority() {
        return priority;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    @Override
    public String toString() {
        return "Event{" +
                "advertisingId=" + advertisingId +
                ", sessionId=" + sessionId +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", eventTypeId=" + eventTypeId +
                ", gdpr=" + gdpr +
                ", minCpm=" + minCpm +
                ", priority=" + priority +
                ", bidPrice=" + bidPrice +
                '}';
    }
}
