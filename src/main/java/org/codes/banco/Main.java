package org.codes.banco;


import java.math.BigInteger;
import java.util.*;

public class Main {

    static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWhat do you want to do?:");
            System.out.println("1. Register\n2. Deposit\n3. Withdraw\n4. Exit");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    register(sc);
                    break;
                case "2":
                    deposit(sc);
                    break;
                case "3":
                    withdraw(sc);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

    }

    public static void register(Scanner sc) {
        System.out.println("Enter account number: ");
        BigInteger number = sc.nextBigInteger();
        sc.nextLine();

        for (Account account : accounts){
            if (account.getAccountNumber().equals(number)){
                do {
                    System.out.println("Try again...");
                    number = sc.nextBigInteger();
                    sc.nextLine();
                } while(account.getAccountNumber().equals(number));

            }
        }

        System.out.println("Enter account owner: ");
        String ownerName = sc.nextLine();

        System.out.println("Do you want to add a initial value? (y/n): ");
        String wantInitValue = sc.nextLine();

        if (wantInitValue.equalsIgnoreCase("y")){
            System.out.println("How much do you want to add?: ");
            double addInitialValue = sc.nextDouble();
            Account account = new Account(number, ownerName, addInitialValue);
            accounts.add(account);
            showAccData(account);
            return;
        }
        Account account = new Account(number, ownerName);
        accounts.add(account);

        showAccData(account);
    }

    public static void deposit(Scanner sc){
        Account acc = null;
        System.out.println("Type the number of account: ");
        BigInteger number = sc.nextBigInteger();
        sc.nextLine();

        for (Account account : accounts){
            if (account.getAccountNumber().equals(number)){
                acc = account;
                break;
            }
        }

        if (acc == null){
            System.out.println("Account not found.");
            return;
        }

        System.out.printf("Current cash: %.2f\n", acc.getMoney());

        System.out.println("How much do you wanna to deposit?: ");
        double value = sc.nextDouble();
        sc.nextLine();

        acc.increaseValue(value);
        System.out.printf("Current cash: %.2f\n", acc.getMoney());
    }

    public static void withdraw(Scanner sc){
        Account acc = null;
        System.out.println("Type the number of account: ");
        BigInteger number = sc.nextBigInteger();
        sc.nextLine();

        for (Account account : accounts){
            if (account.getAccountNumber().equals(number)){
                acc = account;
                break;
            }
        }

        if (acc == null){
            System.out.println("Account not found.");
            return;
        }

        System.out.printf("Current cash: %.2f", acc.getMoney());

        System.out.println("How much do you wanna to withdraw? ($5 tax included): ");
        double value = sc.nextDouble();
        sc.nextLine();

        acc.decreaseValue(value);
        System.out.printf("Current cash: %.2f", acc.getMoney());
    }

    public static void showAccData(Account account){
        System.out.printf("Nome: %s\nNumero da conta: %d\n", account.getOwnerName(), account.getAccountNumber());

    }

    // py -> Dados
    // Java -> Microservices, APIs
    // c# -> App desktop, Web basic
    // Kotlin/Swift -> Mobile
    // C, C++, Rust -> IoT, Apps que exigem mais proximidade da maquina;

}
