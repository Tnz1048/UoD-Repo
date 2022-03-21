package VehicleDatabase;

// class extends car class
// No Additional methods to the car class. this was created in event anything is specific to Saloon in the future

public class Saloon extends car {

    public Saloon(boolean addSatNav, boolean addParkingSensors, boolean addTowBar, boolean addRoofRack, String make, String model, int year, Gearbox gearbox, VehicleDatabase.colour colour, int mileage, String vin) {
        super(addSatNav, addParkingSensors, addTowBar, addRoofRack, make, model, year, gearbox, colour, mileage, vin);
    }

   
    }


