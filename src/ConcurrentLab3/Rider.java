package ConcurrentLab3;

import java.util.concurrent.Semaphore;

/**
 * Created by chamil on 8/19/15.
 */
public class Rider extends Thread {
    int riderID;
    Bus bus;
    BusHalt busHalt;

    public Rider(int riderID, BusHalt busHalt){
        this.riderID = riderID;
        this.busHalt = busHalt;

    }

    public void run(){

        while(!busHalt.busArrived){
        }
        this.boardBus();

    }

    public void boardBus(){
        try {
            busHalt.passengers.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        busHalt.acquiredRiders++;
        System.out.println("The rider " + riderID + " boarded on bus " +busHalt.acquiredRiders);
    }
}
