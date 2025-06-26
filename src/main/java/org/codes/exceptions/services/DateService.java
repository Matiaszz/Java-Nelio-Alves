package org.codes.exceptions.services;

import org.codes.exceptions.exceptions.DateFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DateService {
    private static final Scanner sc = new Scanner(System.in);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static List<Date> getDates() throws DateFormatException {
        Date dateCheckIn;
        Date dateCheckOut;
        try{
            System.out.println("Type the checkIn date (dd/MM/yyyy): ");
            String dateCheckInInput = sc.nextLine();

            System.out.println("Type the checkOut date (dd/MM/yyyy): ");
            String dateCheckOutInput = sc.nextLine();

            dateCheckOut = sdf.parse(dateCheckOutInput);
            dateCheckIn = sdf.parse(dateCheckInInput);
        } catch (ParseException e) {
            System.out.println("Error: " + e);
            System.out.println("Ensure the date is in this format: dd/MM/yyyy");
            throw new DateFormatException(e.getMessage(), e.getErrorOffset());
        }
        return List.of(dateCheckIn, dateCheckOut);
    }
}
