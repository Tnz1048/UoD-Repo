package VehicleDatabase;

// class extends car class
// No Additional methods to the car class. this was created in event anything is specific to hatchback in the future

public class hatchback extends car {

    public hatchback(boolean hasSatNav, boolean hasParkingSensors,
            boolean hasTowBar, boolean hasRoofRack, String make, String model,
            int year, Gearbox gearbox, colour colour, int mileage, String vin) {
        super(hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack,
                make, model, year, gearbox, colour, mileage, vin);
    }

}
