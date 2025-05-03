package org.prog;

public class Main {

    public static void main(String[] args) {
        Car mazda = new Car();
        Car opel = new Car();
        Car thatCar = opel;
        Car myCar = mazda;

        mazda.color = "red";
        opel.color = "green";

        mazda.owner = "Alex";
        opel.owner = "Denis";

        myCar.equals(thatCar);
        thatCar.equals(opel);
        opel.equals(mazda);
        mazda.equals(myCar);

        System.out.println(mazda.hashCode());
        System.out.println(opel.hashCode());
        System.out.println(myCar.hashCode());
        System.out.println(thatCar.hashCode());
    }
}
