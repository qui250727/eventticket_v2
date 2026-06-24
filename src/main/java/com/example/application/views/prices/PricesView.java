package com.example.application.views.prices;

import com.example.application.views.home.HomeView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
        VerticalLayout header = HomeView.getHeader();

        H2 priceList = new H2("Price list");
        priceList.getStyle().set("margin", "0").set("color","gray");

        FlexLayout districts = new FlexLayout();
        VerticalLayout district1=getCard("1050 Wien", 50,65,5);
        VerticalLayout district2=getCard("1030 Vienna", 55,70,5);
        VerticalLayout district3=getCard("1080 Wien", 45,60,4);
        VerticalLayout district4=getCard("1010 Wien", 65,80,6);
        VerticalLayout district5=getCard("Rest of Viena", 40,55,3);
        districts.setWidthFull();
        districts.setJustifyContentMode(JustifyContentMode.CENTER);
        districts.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        districts.add(district1,district2,district3,district4,district5);

        Paragraph info = new Paragraph("Taxes included.");

        add(header, priceList, districts, info);
    }

    public VerticalLayout getCard(String districtName, double priceStandard, double pricePremium, double priceAdministration) {
        VerticalLayout district = new VerticalLayout();
        H2 districtNameH2 = new H2(districtName);
        Paragraph priceStandardP = new Paragraph("Price Standard Ticket: " + priceStandard + " EUR");
        Paragraph pricePremiumP = new Paragraph("Price Premium Ticket: " + pricePremium + " EUR");
        Paragraph priceAdministrationP = new Paragraph("Administration preis is always " + priceAdministration + " eur pro Ticket!");
        district.add(districtNameH2, priceStandardP, pricePremiumP, priceAdministrationP);

        district.setWidth("350px");
        district.setPadding(true);
        district.setSpacing(false);
        district.getStyle().set("border","1px solid lightgray").set("border-radius", "10px").set("margin", "10px");

        return district;
    }

}
