package VehicleDatabase;

// class extends car class
// No Additional methods to the car class. this was created in event anything is specific to Saloon in the future

public class Saloon extends car {

    public Saloon(boolean addSatNav, boolean addParkingSensors, boolean addTowBar, boolean addRoofRack, VehicleDatabase.make make, String model, int year, Gearbox gearbox, VehicleDatabase.colour colour, int mileage, String vin, vehicleclass vehicleClass, VehicleStatus vehicleStatus) {
        super(addSatNav, addParkingSensors, addTowBar, addRoofRack, make, model, year, gearbox, colour, mileage, vin, vehicleClass, vehicleStatus);
    }

       @Override
    public String toString() {
        //Type: Saloon | Make: Skoda | Model: Karoq | Year: 2022 | GearBox: Auto | Colour: Blue | Mileage: 1234 | Vin: 1234567890abc
        //AWD: Yes | SatNav: Yes | Parking Sensors: Yes | Towbar: Yes | RoofRack: Yes 
        //
        
        return "Type: " + vehicleclass.Saloon + " | Make: " + getMake() + " | Model: " + getModel()
                + " | Year: " + getYear() + " | Gearbox: " + getGearbox()
                + " | Colour: " + getColour() + " | Mileage: " + getMileage()
                + "\n  AWD: " + hasSatNav() 
                + " | Satnav: " + hasSatNav() + " | Parking Sensors: " + hasParkingSensors()
                + " | Towbar: " + hasTowBar() + " | RoofRack: " + hasRoofRack()
                + "\n ";
        
    }
    }


