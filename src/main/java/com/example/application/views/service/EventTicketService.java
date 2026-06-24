package com.example.application.views.service;

import com.example.application.views.domain.EventTicket;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class EventTicketService {
    private ArrayList<EventTicket> eventTickets;

    public EventTicketService(){
        eventTickets = new ArrayList<>(1000);
    }

    public void fillTestData(){
        eventTickets.add(new EventTicket(LocalDate.of(2026,1,10),"Alice Johnson","Concert",75.0,500,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,1,15),"Bob Smith","Festival",120.0,1500,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,1,20),"Charlie Brown","Sport",65.0,800,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,1,25),"Diana Wilson","Competition",90.0,600,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,2,2),"Ethan Miller","Concert",85.0,700,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,2,5),"Fiona Davis","Festival",150.0,2000,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,2,9),"George Taylor","Sport",55.0,900,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,2,12),"Hannah Moore","Competition",110.0,450,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,2,18),"Ian Thomas","Concert",95.0,750,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,2,22),"Julia Martin","Festival",180.0,2500,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,2,28),"Kevin Anderson","Sport",70.0,1000,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,3,3),"Laura Jackson","Competition",130.0,550,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,3,7),"Michael White","Concert",60.0,400,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,3,10),"Natalie Harris","Festival",210.0,3000,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,3,15),"Oliver Clark","Sport",80.0,1200,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,3,20),"Paula Lewis","Competition",100.0,700,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,3,24),"Quentin Hall","Concert",140.0,650,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,3,29),"Rachel Young","Festival",220.0,2800,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,4,2),"Steven Allen","Sport",75.0,850,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,4,6),"Tina King","Competition",160.0,900,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,4,10),"Ursula Scott","Concert",90.0,550,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,4,14),"Victor Green","Festival",240.0,3500,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,4,18),"Wendy Baker","Sport",68.0,950,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,4,22),"Xavier Adams","Competition",115.0,650,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,4,26),"Yvonne Nelson","Concert",125.0,700,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,4,30),"Zachary Carter","Festival",260.0,4000,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,5,5),"Anna Roberts","Sport",72.0,1100,false));
        eventTickets.add(new EventTicket(LocalDate.of(2026,5,10),"Brian Evans","Competition",145.0,750,false));

        eventTickets.add(new EventTicket(LocalDate.of(2026,5,15),"Catherine Turner","Concert",155.0,800,true));
        eventTickets.add(new EventTicket(LocalDate.of(2026,5,20),"David Phillips","Festival",290.0,5000,true));
    }

    @Override
    public String toString(){
        String erg = "";
        for(EventTicket e : eventTickets){
            erg += e.toString()+ "\n";
        }
        return erg;
    }
}
