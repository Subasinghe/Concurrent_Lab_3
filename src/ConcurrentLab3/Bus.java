package ConcurrentLab3;

import java.util.concurrent.Semaphore;

/**
 * Created by chamil on 8/19/15.
 */
public class Bus extends Thread {
    int busID;
    BusHalt busHalt;
    Semaphore passengers;

    public Bus(int busID, BusHalt busHalt){
        this.busID = busID;
        this.busHalt = busHalt;
        passengers = new Semaphore(50);

    }

    public void run(){
        try {
            busHalt.busMutex.acquire();
            busHalt.acquiredBusID = busID;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void depart(){
        System.out.println("The bus " + busID + " departed");
    }
}
