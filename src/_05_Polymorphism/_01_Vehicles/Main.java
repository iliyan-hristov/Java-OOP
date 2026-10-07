package _05_Polymorphism._01_Vehicles;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] carTokens = scan.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carFuelConsumption = Double.parseDouble(carTokens[2]);
        double carTankCapacity = Double.parseDouble(carTokens[3]);
        Vehicle car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);

        String[] truckTokens = scan.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckFuelConsumption = Double.parseDouble(truckTokens[2]);
        double truckTankCapacity = Double.parseDouble(truckTokens[3]);
        Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);

        String[] busTokens = scan.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(busTokens[1]);
        double busFuelConsumption = Double.parseDouble(busTokens[2]);
        double busTankCapacity = Double.parseDouble(busTokens[3]);
        Vehicle bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        int numberOfCommands = Integer.parseInt(scan.nextLine());

        Map<String, Vehicle> vehicleMap = Map.of("Car", car, "Truck", truck, "Bus", bus);

        for (int i = 0; i < numberOfCommands; i++) {

            String[] commandTokens = scan.nextLine().split("\\s+");
            String command = commandTokens[0];
            String vehicleType = commandTokens[1];
            double distance = Double.parseDouble(commandTokens[2]);

            try {

                switch (command) {

                    case "Drive":
                        Vehicle vehicle = vehicleMap.get(vehicleType);
                        String result = vehicle.driving(distance);
                        System.out.println(result);
                        break;

                    case "Refuel":
                        vehicle = vehicleMap.get(vehicleType);
                        vehicle.refuel(distance);
                        break;

                    case "DriveEmpty":
                        vehicle = vehicleMap.get(vehicleType);
                        if (vehicleType.equals("Bus")) {
                            busFuelConsumption -= 1.4;
                        }
                        vehicle.driving(distance);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }

        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
