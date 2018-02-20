package com.brainacad.oop.testthread5;


import java.util.Random;

public class Transfer {
    private Bank bank;

    public Transfer(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void doTransfer(int from) {
        int randomAmountSend;
        int max_amount = this.bank.getMaxAmount(from);

        if (max_amount == 0) {
            System.out.println("Not enough money to complete transaction");
        }

        if (max_amount < 5) {
            randomAmountSend = max_amount;
        } else {
            Random randomAmount = new Random();
            randomAmountSend = randomAmount.nextInt(max_amount);

            while (randomAmountSend == 0) {
                randomAmountSend = randomAmount.nextInt(max_amount);
            }
        }

        Random randomAccount = new Random();
        int randomAcountSet = randomAccount.nextInt(bank.getNumberAccounts());

        while (from == randomAcountSet) {
            randomAcountSet = randomAccount.nextInt(bank.getNumberAccounts());
        }
        bank.transfer(from, randomAcountSet, randomAmountSend);
    }
}

