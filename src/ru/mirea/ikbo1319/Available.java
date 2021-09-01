package ru.mirea.ikbo1319;

public class Available {

    public int count = 0;

    public synchronized void letsPing() {

        while (count > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
            System.out.print("PING ");
            count++;
            notify();

    }
    public synchronized void letsPong(){
        while (count < 1) {
            try {
                wait(500);
            } catch (InterruptedException e) {
            }
        }
            System.out.print("PONG ");
            count--;
            notify();
        }
}
