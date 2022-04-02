package VehicleDatabase;

//Extends from vehicles class 

public class Motorbike extends Vehicles {

    private boolean hasLuggageBox;

    public Motorbike(boolean hasLuggageBox, VehicleDatabase.make make, String model, int year, Gearbox gearbox, VehicleDatabase.colour colour, int mileage, String vin, vehicleclass vehicleClass, VehicleStatus vehicleStatus) {
        super(make, model, year, gearbox, colour, mileage, vin, vehicleClass, vehicleStatus);
        this.hasLuggageBox = hasLuggageBox;
    }

    public boolean hasLuggageBox() {
        return hasLuggageBox;
    }

    // Method to add Lugggage Box to MotorBike
    // If Motorbike already has it installed - will present a message to alert the user
    public void addLuggageBox() {
        if (this.hasLuggageBox == true) {
            System.out.println("Luggage Box Already Equipped!");
            return;
        }
        if (this.hasLuggageBox == false) {

            hasLuggageBox = true;
            System.out.println("Luggage Box has been Equipped!");
        }

    }
 // Method to remove Lugggage Box to MotorBike
 // If Motorbike does not have one installed - will present a message to alert the user
    public void removeLuggageBox() {
        if (this.hasLuggageBox == false) {
            System.out.println("No Luggage Box!");
            return;
        }
        if (this.hasLuggageBox == true) {

            hasLuggageBox = false;
            System.out.println("Luggage Box has been removed!");
        }

    }
        @Override
    public String toString() {
        //Type: MotorBike | Make: Skoda | Model: Karoq | Year: 2022 | GearBox: Auto | Colour: Blue | Mileage: 1234 | Vin: 1234567890abc
        //AWD: Yes | Third Row Seat: Yes | SatNav: Yes | Parking Sensors: Yes | Towbar: Yes | RoofRack: Yes 
        //
        
        return "Type: " + vehicleclass.Motorbike + " | Make: " + getMake() + " | Model: " + getModel()
                + " | Year: " + getYear() + " | Gearbox: " + getGearbox()
                + " | Colour: " + getColour() + " | Mileage: " + getMileage()
                + "\n  LuggageBox: " + hasLuggageBox() 
                + "\n ";
        
    }
}
