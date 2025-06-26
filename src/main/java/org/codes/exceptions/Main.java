package org.codes.exceptions;

import org.codes.exceptions.entities.Appointment;
import org.codes.exceptions.exceptions.DateFormatException;

import java.util.Date;
import java.util.List;

import static org.codes.exceptions.services.DateService.getDates;


public class Main {

    public static void main(String[] args) throws DateFormatException {
        List<Date> dates1 = getDates();

        Appointment a = new Appointment(1, dates1.getFirst(), dates1.getLast());
        a.print();


        System.out.println("\nLets update the date");

        List<Date> dates2 = getDates();
        a.updateDates(dates2.getFirst(), dates2.getLast());
        a.print();

    }




}
