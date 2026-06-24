package com.example.application.views.home;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Home")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.FILE)
public class HomeView extends VerticalLayout {

    public HomeView() {
        setSpacing(false);

        VerticalLayout header = getHeader();

        Image logo = new Image("images/logoeventticket.png", "EventTicket logo");
        logo.setWidth("500px");

        Paragraph line1 = new Paragraph("Event Ticket is a modern and user-friendly online platform designed to simplify the process of discovering, booking, and managing tickets for events of all kinds. Whether it's concerts, festivals, sports competitions, theater performances, conferences, or community gatherings, Event Ticket provides a seamless experience for both attendees and organizers.");
        line1.getStyle().set("font-size", "22px").set("line-height", "1.6").set("text-align", "left");
        Paragraph line2 = new Paragraph("Users can easily browse upcoming events, view detailed information, select seats, purchase tickets securely, and receive digital tickets instantly. Event organizers can efficiently create events, manage ticket sales, monitor attendance, and engage with their audience through an intuitive dashboard.");
        line2.getStyle().set("font-size", "22px").set("line-height", "1.6").set("text-align", "left");
        Paragraph line3 = new Paragraph("With a responsive design, secure payment integration, and a focus on convenience and accessibility, Event Ticket aims to make attending and organizing events easier, faster, and more enjoyable for everyone.");
        line3.getStyle().set("font-size", "22px").set("line-height", "1.6").set("text-align", "left");

        H3 name = new H3("EventTicket gmbH");
        H3 street = new H3("Spengergasse 20");
        H3 city = new H3("1050 Wien");

        add(header, logo, line1, line2, line3, name, street, city);
    }

    public static VerticalLayout getHeader(){
        VerticalLayout header;
        header = new VerticalLayout();

        H1 company = new H1("Event Ticket");
        company.getStyle().set("font-family","cursive").set("font-size", "6rem").set("margin", "0");

        H2 subName = new H2("...find the best prices for ur event...");
        subName.getStyle().set("margin", "0").set("color","gray");

        header.add(company, subName);
        return header;
    }
}
