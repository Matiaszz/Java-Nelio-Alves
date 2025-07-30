package org.codes.interfaces.exercise;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, 6, 18);

        Contract contract = new Contract(date, 600.0);
        for (Double values : contract.mensalTax(3)){
            System.out.printf("%s - %.2f\n", date, values);
            date = date.plusMonths(1);
        }
    }
}
