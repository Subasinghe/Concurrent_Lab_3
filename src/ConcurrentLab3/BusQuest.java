package ConcurrentLab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by chamil on 8/19/15.
 */
public class BusQuest {
    public static void main(String args[]){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BusHalt busHalt = new BusHalt();

        int riders = 0;
        int buses = 0;

        try {
            System.out.print("Enter number of Riders : ");
            riders = Integer.parseInt(br.readLine()); // Set number of Riders
            System.out.println("Enter number of Buses : ");
            buses = Integer.parseInt(br.readLine()); // Set number of Buses

        } catch (IOException ioe) {
            System.out.println("IO error trying to read numbers");
            System.exit(1);
        }


        for (int i = 0; i < buses; i++) {
            Bus b = new Bus(i,busHalt);
            b.start();
        }

        for (int i=0;i<riders;i++){
            Rider r = new Rider(i, busHalt);
            r.start();
        }


    }
}
