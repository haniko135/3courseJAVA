package ru.mirea.ikbo1319;

public class PongThread implements Runnable{

    Available available;

    PongThread(Available available){
        this.available = available;
    }

    @Override
    public void run() {
        for (int i=0; i < 6; i++) available.letsPong();
    }

}
