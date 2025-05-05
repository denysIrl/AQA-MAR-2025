package org.prog;

public class Main {

    public static void main(String[] args) {
        //Машины
        Car mazda = new Car();
        Car opel = new Car();
        Car thatCar = opel;
        Car myCar = mazda;

        //Цвета машин
        mazda.color = "red";
        opel.color = "green";
        //Владельцы машин
        mazda.owner = "Alex";
        opel.owner = "Denis";

        //equals проверки с выводом в консоль
        boolean check1 = myCar.equals(thatCar);
        System.out.println(check1);
        boolean check2 = thatCar.equals(opel);
        System.out.println(check2);
        boolean check3 = opel.equals(mazda);
        System.out.println(check3);
        boolean check4 = mazda.equals(myCar);
        System.out.println(check4);



        System.out.println(mazda.hashCode());
        System.out.println(opel.hashCode());
        System.out.println(myCar.hashCode());
        System.out.println(thatCar.hashCode());
    }
}
