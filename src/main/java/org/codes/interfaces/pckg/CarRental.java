package org.codes.interfaces.pckg;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;
    private Invoice invoice;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
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
