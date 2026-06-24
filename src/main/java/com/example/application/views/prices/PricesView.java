package com.example.application.views.prices;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Prices")
@Route("empty2")
@Menu(order = 2, icon = LineAwesomeIconUrl.FILE)
public class PricesView extends VerticalLayout {

    public PricesView() {
        setSpacing(false);
        setAlignItems(Alignment.CENTER);
        H1 company = new H1("Event Ticket");
        company.getStyle().set("font-family","cursive").set("font-size", "6rem").set("margin", "0");

        H2 subName = new H2("...find the best prices for ur event...");
        subName.getStyle().set("margin", "0").set("color","gray");

        H2 priceList = new H2("Price list");
        priceList.getStyle().set("margin", "0").set("color","gray");

        H2 eventDistrict1 = new H2("1050 Vienna");
        Paragraph priceStandard1 = new Paragraph("Price Standard Ticket: 50 eur");
        Paragraph pricePremium1 = new Paragraph("Price Premium Ticket: 65 eur");
        Paragraph priceAdministration1 = new Paragraph("Administration preis is always 5 eur pro Ticket!");

        H2 eventDistrict2 = new H2("1030 Vienna");
        Paragraph priceStandard2 = new Paragraph("Price Standard Ticket: 55 eur");
        Paragraph pricePremium2 = new Paragraph("Price Premium Ticket: 70 eur");
        Paragraph priceAdministration2 = new Paragraph("Administration preis is always 5 eur pro Ticket!");

        H2 eventDistrict3 = new H2("1080 Vienna");
        Paragraph priceStandard3 = new Paragraph("Price Standard Ticket: 45 eur");
        Paragraph pricePremium3 = new Paragraph("Price Premium Ticket: 60 eur");
        Paragraph priceAdministration3 = new Paragraph("Administration preis is always 4 eur pro Ticket!");

        H2 eventDistrict4 = new H2("1010 Vienna");
        Paragraph priceStandard4 = new Paragraph("Price Standard Ticket: 65 eur");
        Paragraph pricePremium4 = new Paragraph("Price Premium Ticket: 80 eur");
        Paragraph priceAdministration4 = new Paragraph("Administration preis is always 6 eur pro Ticket!");

        H2 eventDistrict5 = new H2("Rest of Vienna");
        Paragraph priceStandard5 = new Paragraph("Price Standard Ticket: 40 eur");
        Paragraph pricePremium5 = new Paragraph("Price Premium Ticket: 55 eur");
        Paragraph priceAdministration5 = new Paragraph("Administration preis is always 3 eur pro Ticket!");

        add(company, subName, priceList,
            eventDistrict1, priceStandard1, pricePremium1, priceAdministration1,
            eventDistrict2, priceStandard2, pricePremium2, priceAdministration2,
            eventDistrict3, priceStandard3, pricePremium3, priceAdministration3,
            eventDistrict4, priceStandard4, pricePremium4, priceAdministration4,
            eventDistrict5, priceStandard5, pricePremium5, priceAdministration5
        );
    }

}
