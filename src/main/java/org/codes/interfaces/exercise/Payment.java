package org.codes.interfaces.exercise;

import java.util.List;

public interface Payment {
    List<Double> mensalTax(int installment);
    Double taxPerPayment(double value);
}
