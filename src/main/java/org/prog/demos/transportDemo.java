package org.prog.demos;


import org.prog.pub.transport.Boat;
import org.prog.pub.transport.Bus;
import org.prog.pub.transport.ITransport;
import org.prog.pub.transport.Train;

public class transportDemo {
    public static void main(String[] args) {

        Boat boat = new Boat();
        Bus bus = new Bus();
        Train train = new Train();

        addPassangersAndDrop(bus);
        addPassangersAndDrop(boat);
        addPassangersAndDrop(train);


    }
    public static void addPassangersAndDrop(ITransport iTransport) {
        iTransport.addPassengers();
        iTransport.dropPassengers();
        iTransport.addPassengers();
        iTransport.dropPassengers();
        iTransport.addPassengers();
        iTransport.addPassengers();
    }
}
