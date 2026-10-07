package _05_Polymorphism._01_Vehicles;

public class Truck extends VehicleImp{
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
