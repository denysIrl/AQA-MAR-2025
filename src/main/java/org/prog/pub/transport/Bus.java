package org.prog.pub.transport;

public class Bus implements ITransport {

    @Override
    public void addPassengers() {
        System.out.println("Bus add passenger");
    }

    @Override
    public void dropPassengers() {
        System.out.println("Bus drop passenger");
    }
}
