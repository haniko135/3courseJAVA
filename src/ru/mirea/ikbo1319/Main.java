package ru.mirea.ikbo1319;

public class Main {

    public static void main(String[] args) {

        Available available = new Available();

        PongThread pongThread = new PongThread(available);
        PingThread pingThread = new PingThread(available);

        new Thread(pingThread).start();
        new Thread(pongThread).start();
    }
}
