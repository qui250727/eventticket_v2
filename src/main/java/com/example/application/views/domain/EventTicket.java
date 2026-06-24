package com.example.application.views.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "eventTicketId", callSuper = false)

@Entity
public class EventTicket {
    @Id
    private Long eventTicketId;
    private LocalDate eventTicketDate;
    private String clientName;
    private String eventType;
    private Double price;
    private Integer capacity;
    private Boolean nightEvent;

    private static final AtomicLong sequence = new AtomicLong(1000);
    private static final String[] eventTypes = {"Concert", "Festival", "Sport", "Competition"};

    public EventTicket(){
        setEventTicketId();
        setEventTicketDate(LocalDate.now());
        setClientName("UNKN");
        setEventType("Concert");
        setPrice(50.0);
        setCapacity(500);
        setNightEvent(false);
    }

    public EventTicket(LocalDate eventTicketDate, String clientName, String eventType, Double price, Integer capacity, Boolean nightEvent) {
        setEventTicketId();
        setEventTicketDate (eventTicketDate);
        setClientName (clientName);
        setEventType (eventType);
        setPrice (price);
        setCapacity (capacity);
        setNightEvent (nightEvent);
    }

    public EventTicket(Long eventTicketId, LocalDate eventTicketDate, String clientName, String eventType, Double price, Integer capacity, Boolean nightEvent) {
        setEventTicketId(eventTicketId);
        setEventTicketDate (eventTicketDate);
        setClientName (clientName);
        setEventType (eventType);
        setPrice (price);
        setCapacity (capacity);
        setNightEvent (nightEvent);
    }

    public void setEventTicketId(){
        eventTicketId = sequence.getAndIncrement();
    }

    public void setPreis(Double price){
        if (price < 30.0)
            throw new EventTicketException("Price is to low");
        if (price > 300.0)
            throw new EventTicketException("Preis is to high");
        this.price = price;
    }

    public void setEventTypes(String eventType){
       if (! Arrays.asList(eventTypes).contains(eventType))
           throw new EventTicketException("Unknown event type");
       this.eventType = eventType;
    }

    @Override
    public EventTicket clone(){
        return new EventTicket(eventTicketId, eventTicketDate, clientName, eventType, price, capacity, nightEvent);
    }
}
