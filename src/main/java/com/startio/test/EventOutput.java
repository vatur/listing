package com.startio.test;

public class EventOutput {

    private Long advertisingId;
    private String country;
    private Double price;
    private Integer eventTypeId;
    private Integer gdpr;
    private Double minCpm;
    private Double priority;
    private Double bidPrice;

    public EventOutput(Long advertisingId, String country, Double price, Integer eventTypeId, Integer gdpr, Double minCpm, Double priority, Double bidPrice) {
        this.advertisingId = advertisingId;
        this.country = country;
        this.price = price;
        this.eventTypeId = eventTypeId;
        this.gdpr = gdpr;
        this.minCpm = minCpm;
        this.priority = priority;
        this.bidPrice = bidPrice;
    }

    public Long getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(Long advertisingId) {
        this.advertisingId = advertisingId;
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
}
