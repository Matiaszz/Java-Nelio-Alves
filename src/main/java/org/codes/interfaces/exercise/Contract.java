package org.codes.interfaces.exercise;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Contract implements Payment {
    private long id;
    private LocalDate date;
    private Double totalValue;

    public Contract(final LocalDate date, final Double value){
        Random random = new Random();
        this.id = random.nextLong();
        this.date = date;
        this.totalValue = value;
    }


    @Override
    public List<Double> mensalTax(int installment) {
        double value = 0;
        List<Double> installments = new ArrayList<>();
        for (int i = 1; i <= installment; i++) {
            double percentage = 0.01;
            double monthly = totalValue / installment;
            value = monthly + (monthly * percentage) * i;
            Double tax = taxPerPayment(value);
            installments.add(tax);
        }
        return installments;

    }

    @Override
    public Double taxPerPayment(double value) {
        double percentage = 0.02;

        return value + (value * percentage);
    }
}
