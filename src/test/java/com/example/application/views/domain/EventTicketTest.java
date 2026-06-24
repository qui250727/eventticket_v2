package com.example.application.views.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class EventTicketTest {
  @Test
    void testToString(){
      EventTicket a = new EventTicket(LocalDate.now(),"Thomas", "Concert", 65.0, 850, false);
      System.out.println(a);
      System.out.println(a.getEventTicketDate());
      System.out.println(a.getClientName());
      a.setClientName("Jorge");
      System.out.println(a.getClientName());
  }
}