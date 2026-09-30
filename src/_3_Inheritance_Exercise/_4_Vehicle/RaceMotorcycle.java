package _3_Inheritance_Exercise._4_Vehicle;

public class RaceMotorcycle extends Motorcycle{

    final static double DEFAULT_FUEL_CONSUMPTION = 8;
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
