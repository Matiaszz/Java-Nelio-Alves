package org.codes.interfaces.pckg;

import java.time.Duration;
import java.time.LocalDateTime;

public class Invoice implements Calculations{
    private double pricePerHour;
    private double pricePerDay;
    private double tax;
    private double basicPayment;

    @Override
    public double calculatePayment(LocalDateTime pickupDate, LocalDateTime returnDate) {
        Duration duration = Duration.between(pickupDate, returnDate);
        double hours = (double) duration.toMinutes() / 60.0;

        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
            tax = basicPayment * 0.2;
        } else {
            double days = Math.ceil(hours / 24.0);
            basicPayment = days * pricePerDay;
            tax = basicPayment * 0.15;
        }

        return basicPayment + tax;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }


}
