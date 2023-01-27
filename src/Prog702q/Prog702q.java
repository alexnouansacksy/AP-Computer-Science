// Alex Nouansacksy
// Prog 702q
// 01/26/2023
package Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog702q.txt"));

            ArrayList<vehicle> list = new ArrayList<vehicle>();

            while (keyboard.hasNext()) {

                int num = keyboard.nextInt();
                String name = keyboard.next();
                int tires = keyboard.nextInt();

                if (num == 1) {
                    double worth = keyboard.nextDouble();
                    vehicle p = new car(name, tires, worth);
                    list.add(p);
                } else if (num == 2) {
                    int millage = keyboard.nextInt();
                    vehicle p = new truck(name, tires, millage);
                    list.add(p);
                } else if (num == 3) {
                    String town = keyboard.next();
                    vehicle p = new bus(name, tires, town);
                    list.add(p);
                }
            }

            int busTires = 0;
            int truckTires = 0;
            int carTires = 0;

            int totVehicles = list.size();
            double totWorth = 0;
            double totCarWorth = 0;

            for (vehicle i : list) totWorth += i.getValue();

            String longest = "";

            double lowestTruck = 128221323;
            String lowestTruckName = "";


            for (vehicle x : list) {
                if (x instanceof bus) {
                    if (((bus) x).getTown().length() > longest.length()) {
                        longest = ((bus) x).getTown();
                    }
                    busTires += x.getTire();

                }

                if (x instanceof truck) {
                    if (x.getValue() < lowestTruck) {
                        lowestTruck = x.getValue();
                        lowestTruckName = x.getName();
                    }
                    truckTires += x.getTire();
                }

                if (x instanceof car) {
                    carTires += x.getTire();
                    totCarWorth += x.getValue();
                }
            }

            out.println("Total number of vehicles: " + totVehicles);
            out.println("Total value of cars: $" + totCarWorth);
            out.println("Total value of vehicles: $" +totWorth);
            out.println("Longest home destination: " + longest);
            out.println("Truck with least value: " + lowestTruckName + " with a value of $" + lowestTruck);
            out.println("Number of tires of Cars: " + carTires);
            out.println("Number of tires of Trucks: "+ truckTires);
            out.println("Number of tires of Busses: " + busTires);

            for (vehicle i : list) {
                if (i instanceof car) {
                    out.println("\nCar\nName: " + i.getName() + "\nValue: "+ "\nTires: " + i.getTire() +  "\nValue: $" + i.getValue());
                } else if (i instanceof  truck) {
                    out.println("\nTruck\nName: " + i.getName() + "\nMiles " + ((truck) i).getMillage() + "\nTires: " + i.getTire() +  "\nValue: $" + i.getValue());
                } else if (i instanceof bus) {
                    out.println("\nBus\nName: " + i.getName() + "\nTown: " + ((bus) i).getTown() + "\nTires: " + i.getTire() + "\nValue: $" + i.getValue());
                }
            }


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Total number of vehicles: 13
Total value of cars: $33950.0
Total value of vehicles: $428199.75
Longest home destination: Minneapolis
Truck with least value: Fred with a value of $18750.0
Number of tires of Cars: 15
Number of tires of Trucks: 95
Number of tires of Busses: 69

Car
Name: Bill
Value:
Tires: 4
Value: $10000.0

Truck
Name: Fred
Miles 125000.0
Tires: 18
Value: $18750.0

Bus
Name: Bussy
Town: Madison
Tires: 16
Value: $50000.0

Car
Name: Brian
Value:
Tires: 5
Value: $12500.0

Car
Name: Nick
Value:
Tires: 6
Value: $11450.0

Truck
Name: Billy
Miles 95000.0
Tires: 17
Value: $26250.0

Truck
Name: Sally
Miles 25000.0
Tires: 19
Value: $43750.0

Truck
Name: Erik
Miles 101001.0
Tires: 22
Value: $24749.75

Truck
Name: Softy
Miles 77000.0
Tires: 19
Value: $30750.0

Bus
Name: Russ
Town: Minneapolis
Tires: 12
Value: $50000.0

Bus
Name: Gus
Town: Milwaukee
Tires: 14
Value: $50000.0

Bus
Name: MacBus
Town: Oshkosh
Tires: 13
Value: $50000.0

Bus
Name: Babus
Town: GreenBay
Tires: 14
Value: $50000.0

Process finished with exit code 0

 */