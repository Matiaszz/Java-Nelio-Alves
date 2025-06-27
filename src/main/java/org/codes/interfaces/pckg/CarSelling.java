package org.codes.interfaces.pckg;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarSelling {


    private String model;
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;
    private CarRental carRental;



    public void show(){
        double total = this.carRental.getInvoice().calculatePayment(pickupDate, returnDate);
        System.out.printf(
                "\nCar model: %s\nPickup date: %s\nReturn date: %s\nTax: %f\nBasic payment: %f\nTotal: %f\n",
                this.model, this.pickupDate, this.returnDate,
                this.carRental.getInvoice().getTax(),
                this.carRental.getInvoice().getBasicPayment(),
                total
        );
    }


    public CarRental getCarRental() {
        return carRental;
    }

    public void setCarRental(CarRental carRental) {
        this.carRental = carRental;
    }


    public CarSelling(String model, LocalDateTime pickupDate, LocalDateTime returnDate, CarRental carRental) {
        this.model = model;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.carRental = carRental;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }




}
