package com.rose.flightbookings;

import java.awt.print.Book;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem(2,2);
//        NewPassenger john = new NewPassenger(bookingSystem);
//        john.newPassenger();
//        System.out.println(bookingSystem.toString());
//        AddFlight toEgypt = new AddFlight(bookingSystem);
//        toEgypt.addFlight();
//        toEgypt.addFlight();

        Passenger passengerFlight = new Passenger("Jane", "Doe", "777777", LocalDate.of(2008, 10, 23), Citizenship.BRITISH);

        ViewFlight menu= new ViewFlight(bookingSystem, passengerFlight);
        menu.flightMenu();

    }
}
