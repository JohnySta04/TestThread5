package com.brainacad.oop.testthread5;

public class Bank {

    private int accounts[];
    private int numOfAccounts;

    public Bank(int num_accounts, int init_balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = init_balance;
        }
    }

    void transfer(int from, int to, int amount) {
        try {
            System.out.print("from: " + from + " to: " + to + " amount: " + amount);

            if (accounts[from] < amount) return;
            accounts[from] = accounts[from] - amount;
            Thread.sleep((int) (100 * Math.random()));
            accounts[to] = accounts[to] + amount;

            System.out.print(" ; Balance " + from + ": " + getMaxAmount(from));
            System.out.println(" ; Balance " + to + ": " + getMaxAmount(to));

        } catch (InterruptedException e) {

        }
    }

    public int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total = total + v;
        }
        return total;
    }

    public int getNumberAccounts() {
        return numOfAccounts;
    }

    public int getMaxAmount(int from) {
        return accounts[from];
    }
}

