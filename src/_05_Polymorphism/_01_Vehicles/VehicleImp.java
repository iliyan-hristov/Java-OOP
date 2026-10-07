package _05_Polymorphism._01_Vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImp implements Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public VehicleImp(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }


    @Override
    public String driving(double distance) {

        double neededFuel = fuelConsumption * distance;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if (neededFuel <= fuelQuantity){
            fuelQuantity -= neededFuel;
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
        }

        return String.format("%s needs refueling", this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double liters) {
        if (liters < 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if (fuelQuantity + liters > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

       this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return "%s: %.2f".formatted(this.getClass().getSimpleName(), fuelQuantity);
    }
}
