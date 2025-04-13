package org.codes.ABS;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1000, "Alex", 300.0, 0.1));
    }
}
