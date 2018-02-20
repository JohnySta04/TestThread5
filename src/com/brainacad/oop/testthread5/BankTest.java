package com.brainacad.oop.testthread5;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        System.out.println("******************************************");
        System.out.println("Labwork 2.17.7 && Labwork 2.17.8");
        System.out.println("------------------------------------------");

        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Transfer transfer = new Transfer(bank);
        for (int i = 0; i < N_ACCOUNTS; i++) {
            new TransferThread(transfer, i).start();
        }

        System.out.println("******************************************");
    }
}
