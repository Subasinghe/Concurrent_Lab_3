package ConcurrentLab3;

import java.util.concurrent.Semaphore;

/**
 * Created by chamil on 8/19/15.
 */
public class BusHalt {
    Semaphore busMutex;
    int acquiredBusID;

    public BusHalt(){
        busMutex = new Semaphore(1);
        acquiredBusID = 0;
    }
    public void startProcedure(){

    }

    public void setAcquiredBusID(int acquiredBusID){
        this.acquiredBusID = acquiredBusID;
    }
}
