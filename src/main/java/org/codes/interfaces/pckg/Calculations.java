package org.codes.interfaces.pckg;

import java.time.LocalDateTime;

public interface Calculations {
    double calculatePayment(LocalDateTime  pickupDate, LocalDateTime returnDate);
}
