package _05_Polymorphism._01_Vehicles;

public class Bus extends VehicleImp{


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.4, tankCapacity);
    }
}
