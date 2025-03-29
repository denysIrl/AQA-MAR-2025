package org.prog.pub.transport;

public class Train implements ITransport {
    @Override
    public void addPassengers() {
        System.out.println("Train add passenger");
    }

    @Override
    public void dropPassengers() {
        System.out.println("Train add passenger");
    }
}
