package com.brainacad.oop.testthread5;

public class TransferThread extends Thread {
    private Transfer transfer;
    private int from;

    public TransferThread(Transfer transfer, int from) {
        this.transfer = transfer;
        this.from = from;
    }

    @Override
    public void run() {
        while (!interrupted()) {
            synchronized (transfer) {
                System.out.print(Thread.currentThread().getName() + " : ");
                transfer.doTransfer(this.from);
            }
        }
    }
}
