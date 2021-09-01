package ru.mirea.ikbo1319;

public class PingThread implements Runnable{

    Available available;

    PingThread(Available available){
        this.available = available;
    }

    @Override
    public void run() {
        for (int i=0; i < 6; i++) available.letsPing();
    }
}
