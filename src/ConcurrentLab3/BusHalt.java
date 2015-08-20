package ConcurrentLab3;

import java.util.concurrent.Semaphore;
import java.io.*;

/**
 * Created by chamil on 8/19/15.
 */
public class BusHalt {
    Semaphore busMutex;
    Semaphore passengers;
    boolean busArrived;
    int acquiredRiders;

    public BusHalt(){
        busMutex = new Semaphore(1);
        passengers = new Semaphore(50);
        busArrived = false;
        acquiredRiders = 0;
    }
    public void startProcedure(){



    }

    public void setAcquiredBusID(int acquiredBusID){
        this.acquiredRiders = acquiredRiders;
    }
}
