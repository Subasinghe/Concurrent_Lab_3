package ConcurrentLab3;

import java.util.concurrent.Semaphore;

/**
 * Created by chamil on 8/19/15.
 */
public class Bus extends Thread {
    int busID;
    BusHalt busHalt;


    public Bus(int busID, BusHalt busHalt){
        this.busID = busID;
        this.busHalt = busHalt;


    }

    public void run(){
        try {
            busHalt.busMutex.acquire();
            System.out.println("Bus " + busID + " has arrived");

            busHalt.busArrived = true;
            Thread.sleep(2500);
            depart();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void depart(){
        System.out.println("The bus " + busID + " departed");
        busHalt.passengers.release(busHalt.acquiredRiders);
        busHalt.acquiredRiders=0;
        busHalt.busMutex.release();
    }
}
