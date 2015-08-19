package ConcurrentLab3;

import java.util.concurrent.Semaphore;

/**
 * Created by chamil on 8/19/15.
 */
public class Rider extends Thread {
    int riderID;
    Bus bus;

    public Rider(char riderID, Bus bus){
        this.riderID = riderID;
        this.bus = bus;
    }

    public void run(){
        try {
            bus.passengers.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void boardBus(){
        System.out.println("The bus " + riderID + " boarded on bus");
    }
}
