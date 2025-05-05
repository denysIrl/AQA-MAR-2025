package org.prog.collections;

import io.cucumber.java.it.Ma;
import org.prog.Car;

import java.util.*;

public class CollectionsForHomework {

    public static void main(String[] args) {

        //Создаем машины...
        Car Mazda = new Car();
        Car Opel = new Car();
        Car KIA = new Car();
        Car Audi = new Car();
        Car BMW = new Car();

        //Назначаем цвета машин...
        Mazda.color ="Red";
        Opel.color ="White";
        KIA.color ="Blue";
        Audi.color ="White";
        BMW.color ="Black";

        //Создаем рандомных водителей с именами...
        Owners Denis = new Owners("Denis");
        Owners Yana = new Owners("Yana");
        Owners Vlad = new Owners("Vlad");
        Owners Sofia = new Owners("Sofia");
        Owners Alex = new Owners("Alex");


        //Создаем список ключ значение, первое значение для людей, второе для списка машин.
        Map<Owners, Set<Car>> DriversWithCars = new HashMap<>();
        DriversWithCars.put(Denis, new HashSet<>());
        DriversWithCars.put(Yana, new HashSet<>());
        DriversWithCars.put(Vlad, new HashSet<>());
        DriversWithCars.put(Sofia, new HashSet<>());
        DriversWithCars.put(Alex, new HashSet<>());

        //Назначаем людям по несколько машин
        DriversWithCars.get(Denis).add(Mazda);
        DriversWithCars.get(Denis).add(BMW);
        DriversWithCars.get(Denis).add(Opel);

        DriversWithCars.get(Yana).add(Mazda);
        DriversWithCars.get(Yana).add(KIA);

        DriversWithCars.get(Vlad).add(KIA);
        DriversWithCars.get(Vlad).add(BMW);

        DriversWithCars.get(Sofia).add(Opel);

        DriversWithCars.get(Alex).add(Audi);
        DriversWithCars.get(Alex).add(KIA);
        DriversWithCars.get(Alex).add(Mazda);
        DriversWithCars.get(Alex).add(Opel);


        //System.out.println(DriversWithCars.get(Denis));
        //System.out.println(DriversWithCars.get(Yana));
        //System.out.println(DriversWithCars.get(Vlad));
        //System.out.println(DriversWithCars.get(Sofia));
        //System.out.println(DriversWithCars.get(Alex));




        //Владельцы в списке
        List<Owners> owners = new ArrayList<>();
        owners.add(Denis);
        owners.add(Yana);
        owners.add(Vlad);
        owners.add(Sofia);
        owners.add(Alex);

        //System.out.println(owners);

        //Машины в списке
        List<Car> cars = new ArrayList<>();
        cars.add(Mazda);
        cars.add(Opel);
        cars.add(KIA);
        cars.add(Audi);
        cars.add(BMW);

        //System.out.println(cars);

        Set<Owners> uniqueOwners = new HashSet<>();

        for (Map.Entry<Owners, Set<Car>> entry : DriversWithCars.entrySet()) {
            Owners owner = entry.getKey();
            Set<Car> ownerCars = entry.getValue();

            for (Car car : ownerCars) {
                if (car.color.equals("White")) {
                    uniqueOwners.add(owner);
                }
            }
        }
        System.out.println(uniqueOwners);
    }
}