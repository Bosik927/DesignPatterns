package com.github.bosik927.mediator.sample.control;

public class Mediator {

    private boolean slotFull = false;
    private int number;

    public synchronized void storeMessage(int num) {
        while (slotFull) {
            try {
                wait();
            }
            catch (InterruptedException e ) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = true;
        number = num;
        notifyAll();
    }

    public synchronized int retrieveMessage() {
        while (!slotFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = false;
        notifyAll();
        return number;
    }
}
