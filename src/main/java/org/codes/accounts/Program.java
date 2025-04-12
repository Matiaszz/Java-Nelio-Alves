package org.codes.accounts;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0);
        BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0, 500);

        // UPCASTING
        // Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0, 300);
        Account acc3 = new SavingAccount(1004, "Matt", 0, 0.6);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(400);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Balance updated!");
        }

    }
}
