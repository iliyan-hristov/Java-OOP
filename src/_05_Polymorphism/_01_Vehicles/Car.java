package _05_Polymorphism._01_Vehicles;

public class Car extends VehicleImp{
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }


}
